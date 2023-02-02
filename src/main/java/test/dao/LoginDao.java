package test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import test.form.GuestForm;

public class LoginDao {
	public static ArrayList<String[]> selectAll(GuestForm guestForm) {
		// TODO 자동 생성된 메소드 스텁
		ArrayList<String[]> list = new ArrayList<String[]>();
		try {

			Statement state = null;
			ResultSet rs = null;
			Connection con = null;

			Class.forName("org.postgresql.Driver");

			//DB 설정
			String url = "jdbc:postgresql://localhost:5432/postgres";
			String user = "postgres";
			String pass = "tiger";

			//DB 연결하기
			con = DriverManager.getConnection(url, user, pass);
			state = con.createStatement();

			state = PostgreSqlDbconn.getConnection().createStatement();
			String id = guestForm.getId();
			String password = guestForm.getPassword();

			String sqlselect = "select id from login where id = '" + id + "' and password = '" + password + "'";
			rs = state.executeQuery(sqlselect);
			while (rs.next()) {
				String[] data = new String[1];
				data[0] = rs.getString("id");
				list.add(data);
			}
			
		} catch (Exception e) {
			System.out.println("예외 발생：" + e);
		}
		return list;
	}
}

