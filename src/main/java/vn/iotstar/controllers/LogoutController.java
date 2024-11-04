package vn.iotstar.controllers;

import java.io.IOException;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vn.iotstar.models.UserModel;
import vn.iotstar.utils.Constant;
@WebServlet(name = "logout", urlPatterns = { "/logout" })
public class LogoutController extends HttpServlet{

	
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		HttpSession session = req.getSession();
		session.removeAttribute("account");
		resp.sendRedirect("home");


		/*Cookie[] cookies = req.getCookies();

		if(cookies != null){
			for (Cookie cookie : cookies) {
				if(Constant.COOKIE_REMEMBER.equals(cookie.getName())){
					cookie.setMaxAge(0); // <= > remove cookie
					resp.addCookie(cookie); // add again
					break;
				}
			}
		}
		resp.sendRedirect(req.getContextPath() + "/login");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}*/
	}

}
