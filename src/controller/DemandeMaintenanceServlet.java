package controller;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dao.DemandeMaintenanceDao;

/**
 * Servlet implementation class DemandeMaintenanceServlet
 */
@WebServlet("/DemandeMaintenanceServlet")
@MultipartConfig(maxFileSize = 16177215) // upload file's size up to 16MB
public class DemandeMaintenanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    private DemandeMaintenanceDao demandeMaintenanceDao;

    @Override
    public void init() {
    	demandeMaintenanceDao = new DemandeMaintenanceDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        // gets values of text fields
        String sujet = request.getParameter("sujet");
        String message = request.getParameter("message");
        String motif = request.getParameter("motif");
        
        
        InputStream inputStream = null; // input stream of the upload file
        

        String message1 = null;
        // obtains the upload file part in this multipart request
        Part filePart = request.getPart("file");
        if (filePart != null) {
            // prints out some information for debugging
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());

            // obtains input stream of the upload file
            inputStream = filePart.getInputStream();
        }
        
        
        // sends the statement to the database server
        int row = demandeMaintenanceDao.uploadFile(sujet, message, motif, inputStream);
        //int row1 = demandeMaintenanceDao.uploadMaintenance(motif);
        if (row > 0) {
            message1 = "File uploaded and saved into database";
        }

        // sets the message in request scope
        request.setAttribute("Message", message1);

        // forwards to the message page
        getServletContext().getRequestDispatcher("/messageDemande.jsp")
            .forward(request, response);
    }

}
