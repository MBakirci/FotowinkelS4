/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

public class TestServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private String cat = Test.StaticValues.getMyStaticMember();
    private String user = Test.StaticValues.getMyStaticuser();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        boolean isMultipartContent = ServletFileUpload.isMultipartContent(request);
        if (!isMultipartContent) {
            return;
        }

        FileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        try {
            List<FileItem> fields = upload.parseRequest(request);
            Iterator<FileItem> it = fields.iterator();
            if (!it.hasNext()) {
                return;
            }
            while (it.hasNext()) {
                FileItem fileItem = it.next();
                boolean isFormField = fileItem.isFormField();
                if (isFormField) {
                } else {
                    String J = fileItem.toString();
                    String L = "." +FilenameUtils.getExtension(fileItem.getName());
                    String pathloca = J.substring(J.indexOf("C:\\"), J.indexOf(", size"));
                    Test.FTPUpload ftpload = new Test.FTPUpload();
                    Test.StaticValues stat = new Test.StaticValues();
                    
                    
                    final String alphabet = "0123456789ABCDEFGHJKLMNOPQRSTUVWXYZ";
                    final int N = alphabet.length();
                    String UniqCode = user.substring(0, 3);
                    Random r = new Random();

                    for (int i = 0; i < 10; i++) {
                        UniqCode = UniqCode + alphabet.charAt(r.nextInt(N));
                    }
                    
                    String dbfilepath = user + "/" + cat + "/" + UniqCode + L;
                    ftpload.UploadFotoDatabase(UniqCode, 2, 1, dbfilepath , 5, 5);
                    ftpload.UploadFile(UniqCode + L, cat, user, pathloca);
                }
            }


        } catch (FileUploadException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            Logger.getLogger(TestServlet.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            response.sendRedirect("Upload.jsp");
        }
    }
}
