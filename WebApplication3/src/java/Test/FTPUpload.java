package Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
 
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

/**
 *
 * @author asror
 */
public class FTPUpload {
    
    public static void main(String[] args) {
        
    }
    
    private static void showServerReply(FTPClient ftpClient) {
        String[] replies = ftpClient.getReplyStrings();
        if (replies != null && replies.length > 0) {
            for (String aReply : replies) {
                System.out.println("SERVER: " + aReply);
            }
        }
        
    }
    
    public void uploadDiretory(String path, String User){
        String server = "212.64.126.219";
        int port = 9942;
        String user = "asror";
        String pass = "asror";
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient.connect(server, port);
            showServerReply(ftpClient);
            int replyCode = ftpClient.getReplyCode();
            if (!FTPReply.isPositiveCompletion(replyCode)) {
                System.out.println("Operation failed. Server reply code: " + replyCode);
                return;
            }
            boolean success = ftpClient.login(user, pass);
            showServerReply(ftpClient);
            if (!success) {
                System.out.println("Could not login to the server");
                return;
            }
            // Creates a directory
            String dirToCreate = "/"+ User + path;
            success = ftpClient.makeDirectory(dirToCreate);
            showServerReply(ftpClient);
            if (success) {
                System.out.println("Successfully created directory: " + dirToCreate);
            } else {
                System.out.println("Failed to create directory. See server's reply.");
            }
            // logs out
            ftpClient.logout();
            ftpClient.disconnect();
        } catch (IOException ex) {
            System.out.println("Oops! Something wrong happened");
            ex.printStackTrace();
        }
        
    }
        
    public void UploadFile(String uniquecode, String Category, String User, String path){
        String server = "212.64.126.219";
        int port = 9942;
        String user = "asror";
        String pass = "asror";
 
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient.connect(server, port);
            ftpClient.login(user, pass);
                ftpClient.enterLocalPassiveMode();

            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
            
            String fullpathdt = path;
            // APPROACH #1: uploads first file using an InputStream
            File firstLocalFile = new File(fullpathdt);
 
            String firstRemoteFile = User + "/" + Category + "/" + uniquecode;
            InputStream inputStream = new FileInputStream(firstLocalFile);
 
            System.out.println("Start uploading first file");
            boolean done = ftpClient.storeFile(firstRemoteFile, inputStream);
            inputStream.close();
            if (done) {
                System.out.println("The first file is uploaded successfully.");
            }
            
            

            /*//APPROACH #2: uploads second file using an OutputStream
            File secondLocalFile = new File("C://Users/Asror/Desktop/mehmet2.txt");
            String secondRemoteFile = "/Upload123/mehmet4.txt";
            inputStream = new FileInputStream(secondLocalFile);
 
            System.out.println("Start uploading second file");
            OutputStream outputStream = ftpClient.storeFileStream(secondRemoteFile);
            byte[] bytesIn = new byte[4096];
            int read = 0;
 
            while ((read = inputStream.read(bytesIn)) != -1) {
                outputStream.write(bytesIn, 0, read);
            }
            inputStream.close();
            outputStream.close();
 
            boolean completed = ftpClient.completePendingCommand();
            if (completed) {
                System.out.println("The second file is uploaded successfully.");
            }*/
 
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                if (ftpClient.isConnected()) {
                    ftpClient.logout();
                    ftpClient.disconnect();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
        Thumbnail(path, uniquecode);
    }
    
    
    public void Thumbnail(String pathh, String Uniqu)
    {
                String server = "212.64.126.219";
        int port = 9942;
        String user = "asror";
        String pass = "asror";
 
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient.connect(server, port);
            ftpClient.login(user, pass);
                ftpClient.enterLocalPassiveMode();

            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
        
            InputStream inputStream = new FileInputStream(pathh);
            String firstRemoteFile = "";
            BufferedImage sourceImage = ImageIO.read(new File(pathh));
            
            int width = sourceImage.getWidth();
            int height = sourceImage.getHeight();

            if (width > height) {
                float extraSize = height - 100;
                float percentHight = (extraSize / height) * 100;
                float percentWidth = width - ((width / 100) * percentHight);
                BufferedImage img = new BufferedImage((int) percentWidth, 100, BufferedImage.TYPE_INT_RGB);
                Image scaledImage = sourceImage.getScaledInstance((int) percentWidth, 100, Image.SCALE_FAST);
                img.createGraphics().drawImage(scaledImage, 0, 0, null);
                BufferedImage img2 = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
                img2 = img.getSubimage((int) ((percentWidth - 100) / 2), 0, 100, 100);

                File f = new File(Uniqu);
                ImageIO.write(img2, "PNG", f);

                inputStream = new FileInputStream(f);
                firstRemoteFile = "/Thumb" + "/" + f.getName();
                System.out.println("Start uploading first file");
                boolean done = ftpClient.storeFile(firstRemoteFile, inputStream);
                inputStream.close();
                if (done) {
                    System.out.println("The first file is uploaded successfully.");
                }

            } else {
                float extraSize = width - 100;
                float percentWidth = (extraSize / width) * 100;
                float percentHight = height - ((height / 100) * percentWidth);
                BufferedImage img = new BufferedImage(100, (int) percentHight, BufferedImage.TYPE_INT_RGB);
                Image scaledImage = sourceImage.getScaledInstance(100, (int) percentHight, Image.SCALE_SMOOTH);
                img.createGraphics().drawImage(scaledImage, 0, 0, null);
                BufferedImage img2 = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
                img2 = img.getSubimage(0, (int) ((percentHight - 100) / 2), 100, 100);

                File f = new File(Uniqu);
                ImageIO.write(img2, "PNG", f);

                inputStream = new FileInputStream(f);
                firstRemoteFile = "/Thumb" + "/" + f.getName();;
                System.out.println("Start uploading first file");
                boolean done = ftpClient.storeFile(firstRemoteFile, inputStream);
                inputStream.close();
                if (done) {
                    System.out.println("The first file is uploaded successfully.");
                }
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                if (ftpClient.isConnected()) {
                    ftpClient.logout();
                    ftpClient.disconnect();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
    }

    
    public boolean UploadFotoDatabase(String Uniq, int Cat, int Fotograafid, String FilePath, double Basis, int Winst) throws Exception {
        Databaseconnector ts = new Databaseconnector();
        if (ts.verbindmetDatabase()) {
            PreparedStatement state = null;
            try {
                String q = "INSERT INTO FW_FOTO (UniqueCode, CatID, FotograafID, FilePath, BasisPrijs, Winstmarge, GROEPCODE) VALUES(? ,?, ?, ?, ? , ?, ?)";
                state = ts.conn.prepareStatement(q);
                state.setString(1, Uniq);
                state.setInt(2, Cat);
                state.setInt(3, Fotograafid);
                state.setString(4, FilePath);
                state.setDouble(5, Basis);
                state.setInt(6, Winst);
                    final String alphabet = "0123456789ABCDEFGHJKLMNOPQRSTUVWXYZ";
                    final int N = alphabet.length();
                    String groepcode = "";
                    Random r = new Random();

                    for (int i = 0; i < 10; i++) {
                        groepcode = groepcode + alphabet.charAt(r.nextInt(N));
                    }
                state.setString(7, groepcode);
                //state.executeQuery();
                state.executeUpdate();
              
            } catch (SQLException e) {
                return false;
            } finally {
                if (state != null) {
                    state.close();
                }
            }
        }
        return true;
    }


    private String getUserID(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}