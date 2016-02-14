/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orp.connection;

import com.orp.database.connection.ConnectionManager;
import com.orp.database.query.QueryManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PRAISON
 */
public class TestClass {
    public static void main(String[] args) {
        try {
            QueryManager queryManager = new QueryManager();
            List<Object> lst = new ArrayList<Object>();
            lst.add("admin");
            lst.add("admin2");
            ResultSet resultSet = queryManager.returnResult("SELECT count(*) FROM tbl_user WHERE user_name=? AND user_pass=?", lst);
            resultSet.next();
            System.out.println("cn ...... "+resultSet.getInt(1));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
