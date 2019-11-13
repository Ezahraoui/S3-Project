package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DemandeDAO;

public class DemandeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
 
        String sujet = request.getParameter("sujet");
        String document = request.getParameter("document_joindre");
        byte[] document_joindre = document.getBytes();
        HttpSession session = request.getSession(true);
        try {
            DemandeDAO demandeDAO = new DemandeDAO();
            demandeDAO.addDemande(sujet, document_joindre);
            response.sendRedirect("Success");
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    }

}
