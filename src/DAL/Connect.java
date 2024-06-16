/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Huu Danh
 */
public class Connect {
     public static Connection Connect() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_bansach", "root", "");
            return con;
        } catch (Exception e) {
            return null;
        }
    }
}
