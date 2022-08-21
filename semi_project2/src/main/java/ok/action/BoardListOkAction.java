package ok.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.team.action.Action;
import com.team.action.ActionForward;

import board.dao.BoardDAO;
import board.vo.BoardVO;

public class BoardListOkAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		BoardDAO dao = new BoardDAO();
		ActionForward forward = new ActionForward();
		
		forward.setRedirect(false);
		forward.setPath("/app/webService/board.jsp");

		return forward;

	}

}
