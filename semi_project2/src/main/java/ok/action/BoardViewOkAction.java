package ok.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.team.action.Action;
import com.team.action.ActionForward;

import board.dao.BoardDAO;

public class BoardViewOkAction implements Action {
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		BoardDAO dao = new BoardDAO();
		ActionForward forward = new ActionForward();
		
		forward.setRedirect(false);
		forward.setPath("/app/webService/search.jsp");

		return forward;
	}
}
