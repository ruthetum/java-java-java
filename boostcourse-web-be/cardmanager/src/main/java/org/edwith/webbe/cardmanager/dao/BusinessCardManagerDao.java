package org.edwith.webbe.cardmanager.dao;

import org.edwith.webbe.cardmanager.dto.BusinessCard;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusinessCardManagerDao {
    private static String dbUrl = "jdbc:mysql://localhost:[PORT_NUMBER]/[DB_NAME]?useSSL=false";
    private static String dbUser = "[USER]";
    private static String dbPw = "[PASSWORD]";

    public List<BusinessCard> searchBusinessCard(String keyword){
        List<BusinessCard> businessCardList = new ArrayList<>();

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbUrl, dbUser, dbPw);
            String sql = "SELECT * FROM business_card WHERE name LIKE ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + keyword + "%");
            rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString(1);
                String phone = rs.getString(2);
                String companyName = rs.getString(3);
                businessCardList.add(new BusinessCard(name, phone, companyName));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return businessCardList;
    }

    public BusinessCard addBusinessCard(BusinessCard businessCard){
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbUrl, dbUser, dbPw);
            String sql = "INSERT INTO business_card (name, phone, companyName) VALUES (?, ?, ?)";

            ps = conn.prepareStatement(sql);
            ps.setString(1, businessCard.getName());
            ps.setString(2, businessCard.getPhone());
            ps.setString(3, businessCard.getCompanyName());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return businessCard;
    }
}
