package test.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import test.dao.GuestDao;
import test.form.GuestForm;

public class SearchAction extends Action {

	@SuppressWarnings("rawtypes")
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		GuestForm guestForm = (GuestForm) form;
		try {
			//화면상에서 검색키를 파라메터를 건네준다.
			ArrayList<String[]> list = GuestDao.selectAll(guestForm);
			request.setAttribute("guests", list);

		} catch (Exception e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}

		return mapping.findForward("guest");
	}
	
	 

}
