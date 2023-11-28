package jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DB {
	public static Connection oraConn() {
		Connection conn = null;
		try {
			FileInputStream fis = new FileInputStream("c:/work/oracle.prop");
			Properties prop = new Properties();
			prop.load(fis);
//			등호(=) 기준, key = value 구조로 해당 파일의 데이터를 읽는다. 
//			=> 아래 각 변수(url, id, password)에 데이터(values)저장
			String url = prop.getProperty("url");
			String id = prop.getProperty("id");
			String password = prop.getProperty("password");
			conn = DriverManager.getConnection(url, id, password);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}
}
