package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String account= request.getParameter("account");
        HttpSession session=request.getSession();
        if("admin".equals(account)){
            request.setAttribute("session_account",account);
            request.getRequestDispatcher("/success").forward(request,response);
        }
        else{
            response.sendRedirect("index.jsp");
        }

    }
}
