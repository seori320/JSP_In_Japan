package test.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import test.form.GuestForm;

public class EditDao {
	public static ArrayList<String[]> selectAll(GuestForm guestForm) {
		// TODO 자동 생성된 메소드 스텁
		ArrayList<String[]> list = new ArrayList<String[]>();
		try {
			Statement state = null;
			ResultSet rs = null;

			Class.forName("org.postgresql.Driver");

			//DB 연결하기
			state = PostgreSqlDbconn.getConnection().createStatement();
			String paraCardNum = guestForm.getCardNum();

			//TODO 
			// UPDATE public.guest SET card_num = '"+paraCardNum+"'where card_num='"+paraCardNum+"' "; 
			// rs = state.executeUpdate(sqlselect);
			
		
		} catch (Exception e) {
			System.out.println("예외 발생：" + e);
		}
		return list;
	}

	public static ArrayList<String[]> update(GuestForm guestForm) {
		// TODO 자동 생성된 메소드 스텁
		return null;
	}
}
		