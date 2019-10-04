package com.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.bean.User;

public class UserRepository {

	public int insert(User user) {
		String sql = "insert into sample (name, password) values ( ?, ? ) ";
		ResultSet rs = null;
		int key = -1;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			System.out.println("found class");
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e1) {
			e1.printStackTrace();

		}

		try (Connection conn = DriverManager
				.getConnection("jdbc:mysql://localhost/demo?" + "serverTimezone=UTC&user=root&password=adminadmin");
				PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
			ps.setString(1, user.getName());
			ps.setString(2, user.getPassword());
			ps.executeUpdate();
			rs = ps.getGeneratedKeys();
			if (rs.next()) {
				key = rs.getInt(1);
			} else {
				System.out.println("something went wrong.");
			}
			System.out.println(key);

		} catch (Exception e) {
			e.printStackTrace();

		}
		return key;
	}

}
