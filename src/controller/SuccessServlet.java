package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SuccessServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        if(session!=null){
            Object obj=session.getAttribute("session_account");
            if(obj!=null){
                response.sendRedirect("/success.jsp");
            }
        }else {
            request.getRequestDispatcher("index.jsp");
        }

    }
}
