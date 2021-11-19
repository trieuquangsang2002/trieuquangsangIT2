/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eaut_app.helpers;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author trieuquangsang
 */
public class DatabaseHelper {

    public static Connection opConnection() throws Exception {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost;database=Eaut_app;";
            String dbusername = "sa";
            String password = "sang2002";
            Connection con = DriverManager.getConnection(connectionUrl, dbusername, password);

             return con;
    }

}
