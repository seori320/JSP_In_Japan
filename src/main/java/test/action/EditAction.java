package test.action;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import test.form.GuestForm;

public class EditAction extends Action {

	private final static String SUCCESS = "success";
	private final static String FAILURE = "failure";
	private  static  final Charset euckr = Charset.forName("EUC-KR");


	@SuppressWarnings("rawtypes")
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		GuestForm guestForm = (GuestForm) form;
		
		
		try {

			//화면상에서 선택한것의 키를 설정 
			String selected = request.getParameter("radiobutton");
			//선택한것을 보존 화면상에 표시
			if (selected != null) {
			    
				guestForm = setData(Integer.parseInt(selected), guestForm);
				String cardNum = guestForm.getCardNum();
				String name = guestForm.getName();
				String katakana = guestForm.getKatakana(); 
				String seibetu = guestForm.getSeibetu();
				String address = guestForm.getAddress();
				String birth = guestForm.getBirth();
				String mailAddr = guestForm.getMailAddr();
				String adoresuKakguin = guestForm.getAdoresuKakguin();
				String gigaku = guestForm.getGigaku(); 
				String haeshituke = guestForm.getHaeshituke();
				
				request.setAttribute("cardNum",cardNum);
				request.setAttribute("name",name);				
				request.setAttribute("katakana",katakana);
				request.setAttribute("seibetu",seibetu);
				request.setAttribute("address",address);
				request.setAttribute("birth",birth);
				request.setAttribute("gigaku",gigaku);
				request.setAttribute("mailAddr",mailAddr);
				request.setAttribute("adoresuKakguin",adoresuKakguin);
				request.setAttribute("gigaku",gigaku);
				request.setAttribute("haeshituke",haeshituke);
				
				return mapping.findForward("edit");
				
			} 

		} catch (Exception e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}

		return mapping.findForward("null");
	}

	private GuestForm setData(int selected, GuestForm guestForm) {
	
		GuestForm  guForm = new GuestForm();
		
		// TODO 자동 생성된 메소드 스텁
	     if(selected == 0) {
	    	 guForm.setCardNum(guestForm.getCardNum0());
	    	 guForm.setName(encodeStr(guestForm.getName0()));
	    	 guForm.setKatakana(guestForm.getKatakana0());
	    	 guForm.setSeibetu(	guestForm.getSeibetu0());
	    	 guForm.setAddress(	guestForm.getAddress0());
	    	 guForm.setBirth(	guestForm.getBirth0());
	    	 guForm.setMailAddr(	guestForm.getMailAddr0());
	    	 guForm.setAdoresuKakguin(guestForm.getAdoresuKakguin0());
	    	 guForm.setGigaku(guestForm.getGigaku0());
	    	 guForm.setHaeshituke(guestForm.getHaeshituke0());
	     }
	     else if(selected == 1) {
	    	 guForm.setCardNum(guestForm.getCardNum1());
	    	 guForm.setName(encodeStr(guestForm.getName1()));
	    	 guForm.setKatakana(guestForm.getKatakana1());
	    	 guForm.setSeibetu(	guestForm.getSeibetu1());
	    	 guForm.setAddress(	guestForm.getAddress1());
	    	 guForm.setBirth(	guestForm.getBirth1());
	    	 guForm.setMailAddr(	guestForm.getMailAddr1());
	    	 guForm.setAdoresuKakguin(guestForm.getAdoresuKakguin1());
	    	 guForm.setGigaku(guestForm.getGigaku1());
	    	 guForm.setHaeshituke(guestForm.getHaeshituke1());
	     } else if(selected == 2) {
	    	 guForm.setCardNum(guestForm.getCardNum2());
	    	 guForm.setName(encodeStr(guestForm.getName2()));
	    	 guForm.setKatakana(guestForm.getKatakana2());
	    	 guForm.setSeibetu(	guestForm.getSeibetu2());
	    	 guForm.setAddress(	guestForm.getAddress2());
	    	 guForm.setBirth(	guestForm.getBirth2());
	    	 guForm.setMailAddr(	guestForm.getMailAddr2());
	    	 guForm.setAdoresuKakguin(guestForm.getAdoresuKakguin2());
	    	 guForm.setGigaku(guestForm.getGigaku2());
	    	 guForm.setHaeshituke(guestForm.getHaeshituke2());
	     }else if(selected == 3) {
	    	 guForm.setCardNum(guestForm.getCardNum3());
	    	 guForm.setName(encodeStr(guestForm.getName3()));
	    	 guForm.setKatakana(guestForm.getKatakana3());
	    	 guForm.setSeibetu(	guestForm.getSeibetu3());
	    	 guForm.setAddress(	guestForm.getAddress3());
	    	 guForm.setBirth(	guestForm.getBirth3());
	    	 guForm.setMailAddr(	guestForm.getMailAddr3());
	    	 guForm.setAdoresuKakguin(guestForm.getAdoresuKakguin3());
	    	 guForm.setGigaku(guestForm.getGigaku3());
	    	 guForm.setHaeshituke(guestForm.getHaeshituke3());
	     }else if(selected == 4) {
	    	 guForm.setCardNum(guestForm.getCardNum4());
	    	 guForm.setName(encodeStr(guestForm.getName4()));
	    	 guForm.setKatakana(guestForm.getKatakana4());
	    	 guForm.setSeibetu(	guestForm.getSeibetu4());
	    	 guForm.setAddress(	guestForm.getAddress4());
	    	 guForm.setBirth(	guestForm.getBirth4());
	    	 guForm.setMailAddr(	guestForm.getMailAddr4());
	    	 guForm.setAdoresuKakguin(guestForm.getAdoresuKakguin4());
	    	 guForm.setGigaku(guestForm.getGigaku4());
	    	 guForm.setHaeshituke(guestForm.getHaeshituke4());
	     }
		
	     
	     
	     
		return guForm;
	}
	
	
    
    private String encodeStr(String str) {
        String encodeStr = null;
		try {
			encodeStr = URLEncoder.encode(str, "euc-kr");
		} catch (UnsupportedEncodingException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
        return encodeStr;
	}


}
