package test.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import test.form.GuestForm;

public class GuestDao {

	public static ArrayList<String[]> selectAll(GuestForm guestForm) {
		// TODO 자동 생성된 메소드 스텁
		// 화면상에서 검색키를 취득하여 케스트 데이블에서 데이타를 취득하여 
		// 리스트에 설정하여 액션에 리턴한다.
		ArrayList<String[]> list = new ArrayList<String[]>();
		try {

			Statement state = null;
			ResultSet rs = null;

			Class.forName("org.postgresql.Driver");

			//DB 연결하기
			state = PostgreSqlDbconn.getConnection().createStatement();
			String paraCardNum = guestForm.getCardNum();

			if (paraCardNum == null || paraCardNum.equals("")) {
				// 화면상에서 카드번호를 조건으로 건네준다
				String sqlselect = "select   card_num  , name   , katakana  , seibetu   , address  , birth  , mail_addr  , adoresu_kakguin  , gigaku   , haeshituke  from guest";
				rs = state.executeQuery(sqlselect);
			} else {
				String sqlselect = "select   card_num  , name   , katakana  , seibetu   , address  , birth  , mail_addr  , adoresu_kakguin  , gigaku   , haeshituke  from guest where card_num='"
						+ paraCardNum + "' ";
				rs = state.executeQuery(sqlselect);
			}

			while (rs.next()) {
				String[] data = new String[11];
				data[0] = setSpace(rs.getString("card_num"));
				data[1] = setSpace(rs.getString("name"));
				data[2] = setSpace(rs.getString("katakana"));
				data[3] = setSpace(rs.getString("seibetu"));
				data[4] = setSpace(rs.getString("address"));
				data[5] = setSpace(rs.getString("birth"));
				data[6] = setSpace(rs.getString("mail_addr"));
				data[7] = setSpace(rs.getString("adoresu_kakguin"));
				data[8] = setSpace(rs.getString("gigaku"));
				data[9] = setSpace(rs.getString("haeshituke"));
				list.add(data);
			}

		} catch (Exception e) {
			System.out.println("예외 발생：" + e);
		}
		return list;
	}

	@SuppressWarnings("unused")
	private static String setSpace(String param) {
		String setParam = "";

		if (param == null || param.isEmpty()) {
			setParam = "-";
		} else {
			setParam = param.trim();
		}

		return setParam;
	}
}
