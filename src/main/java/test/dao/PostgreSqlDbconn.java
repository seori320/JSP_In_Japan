package test.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class PostgreSqlDbconn {
	public static Connection getConnection() throws Exception {
		//DB 연결에 필요한 인스턴스 초기화
		Connection connect = null;
		//아래에서 DB 연결 대상 지정
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String password = "tiger";

		//DB 연결하기
		connect = DriverManager.getConnection(url, user, password);
		return connect;

	}
}
