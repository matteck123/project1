package com.revature.repos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.beans.Author;

import utils.JDBCConnection;

public class AuthorDAO implements AuthorRepo {

	
	private Connection conn = JDBCConnection.getConnection();
	private StoryRepo stoDao = new StoryDAO();
	
	@Override
	public void addAuthor(Author a) {
		// If i get around to registering new users;

	}

	@Override
	public void updateAuthor(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Author getAuthor(String user, String pass) { // passed username and password
		String sql = "select * from authors where author_username = ? and author_password = ?";
		
		try {

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user);
			ps.setString(2, pass);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				Author a = new Author();
				a.setAuthorId(rs.getInt("author_id"));
				a.setAuthorUsername(user);
				a.setAuthorPassword(pass);
				a.setAuthorFirstName(rs.getString("author_first_name"));
				a.setAuthorLastName(rs.getString("author_last_name"));
				a.setAuthorPoints(rs.getInt("author_points"));
					
				a.setStories(stoDao.getStories(a.getAuthorId()));
				return a;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public Author getAuthor(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
