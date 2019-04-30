package br.com.apsinformatica.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.Map.Entry;
import java.sql.PreparedStatement;

public class MysqlConnect {
	private final String USER = "apsinforma1";
	private final String PASS = "{1489apsApS*}";
	private final String PORT = "3306";
	private final String JDBC = "jdbc:mysql:";
	private final String HOST = "dbmy0104.whservidor.com";
	private final String DB = "apsinforma1";
	private Connection CONN;

	public void open() throws SQLException {
		String URL = JDBC + HOST + ":" + PORT + "/" + DB;
		// Firebird Driver do JDBC
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		CONN = DriverManager.getConnection(URL, USER, PASS);
		CONN.setAutoCommit(false);
	}

	public void close() {
		try {
			if (!CONN.isClosed()) {
				CONN.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void commit() {
		try {
			if (CONN != null && !CONN.isClosed()) {
				CONN.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void rollback() {
		try {
			if (CONN != null && !CONN.isClosed()) {
				CONN.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ResultSet executeQuery(String pSql) throws SQLException {
		return executeQuery(pSql, null);
	}

	public ResultSet executeQuery(String pSql, Map<Integer, Object> pParams) throws SQLException {
		PreparedStatement stm = CONN.prepareStatement(pSql);
		if (pParams != null) {
			for (Entry<Integer, Object> entry : pParams.entrySet()) {
				stm.setObject(entry.getKey(), entry.getValue());
			}
		}
		return stm.executeQuery();
	}

	public int executeUpdate(String pSql) throws SQLException {
		return executeUpdate(pSql, null);
	}

	public int executeUpdate(String pSql, Map<Integer, Object> pParams) throws SQLException {
		PreparedStatement stm = CONN.prepareStatement(pSql);
		if (pParams != null) {
			for (Entry<Integer, Object> entry : pParams.entrySet()) {
				stm.setObject(entry.getKey(), entry.getValue());
			}
		}

		return stm.executeUpdate();
	}

	public Connection getCONN() {
		return CONN;
	}

}
