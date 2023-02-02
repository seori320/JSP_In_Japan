package test.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import test.dao.LoginDao;
import test.form.GuestForm;


public class LoginAction extends Action {

    private final static String SUCCESS = "success";
    private final static String ERROR = "error";
    
    @Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		GuestForm guestForm = (GuestForm)form;
		try {
			//화면상에서 검색키를 파라메터를 건네준다.
			ArrayList<String[]> list = LoginDao.selectAll(guestForm);
			
			if(list ==null || list.size() == 0) {
				return mapping.findForward(ERROR);
			} else {
				return mapping.findForward(SUCCESS);
			}

		} catch (Exception e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
		return null;
	}	
}
