package servlet;

import com.daehosting.webservices.isbn.*;
import com.dataaccess.webservicesserver.*;
import ISBNService.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/validate")
public class ISBNValidationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String isbn = request.getParameter("isbn");
        String type = request.getParameter("type");
        ISBNValidator validator = new ISBNValidator();
        boolean isValid;

        if ("isbn10".equalsIgnoreCase(type)) {
            isValid = validator.validateISBN10(isbn);
        } else {
            isValid = validator.validateISBN13(isbn);
        }
        
        String text="";
        
        if(isValid)
        	text=validator.changeResult(isbn, "ISBN "+isbn+" is valid ("+isValid+")");
        else
        	text=validator.changeResult(isbn, "ISBN "+isbn+" is NOT valid ("+isValid+")");

        response.setContentType("text/plain");
        response.getWriter().write(text);
    }
}