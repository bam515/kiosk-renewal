package com.devbam.kioskrenewal.dao;

import com.devbam.kioskrenewal.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MenuDao {
    // 테이블 초기화
    public void initTable() {
        String sql = """
            CREATE TABLE IF NOT EXISTS menu (
                id INT AUTO_INCREMENT PRIMARY KEY,
                name VARCHAR(200),
                price INT
        """;

        try (Connection conn = DBConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.execute();
            System.out.println("MENU Table initialized.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
