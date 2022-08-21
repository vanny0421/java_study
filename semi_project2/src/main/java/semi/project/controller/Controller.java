package semi.project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.team.action.ActionForward;

import ok.action.BoardListOkAction;
import ok.action.BoardViewOkAction;
import ok.action.BoardWriteOkAction;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestURI = req.getRequestURI();
		String contextPath = req.getContextPath();
		String command = requestURI.substring(contextPath.length());
		ActionForward forward = null;
		System.out.println(command);
		switch (command) {
		case "/webService/One.bo":
//			"/customerService/CS_BoardList.bo":
//			<a href="${pageContext.request.contextPath}/customerService/CS_BoardList.bo?page=${i}"><c:out value="${i}"/></a>
			try {
				forward = new BoardListOkAction().execute(req, resp);
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("/app/webService/BoardList.bo에서 오류");
			}
			break;
		case "/webService/Two.bo":
			try {
				forward = new BoardWriteOkAction().execute(req, resp);
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("/app/webService/BoardWrite.bo에서 오류");
			}
			break;
		case "/webService/Three.bo":
			try {
				forward = new BoardViewOkAction().execute(req, resp);
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("/app/webService/BoardView.bo에서 오류");
			}
			break;
		case "/webService/Four.bo":
			try {
				forward = new BoardListOkAction().execute(req, resp);
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("/app/webService/BoardList.bo에서 오류");
			}
			break;

		}
		if (forward != null) {
			if (forward.isRedirect()) {
				resp.sendRedirect(forward.getPath());
			} else {
				RequestDispatcher dispatcher = req.getRequestDispatcher(forward.getPath());
				dispatcher.forward(req, resp);
			}
		}
	}
}
