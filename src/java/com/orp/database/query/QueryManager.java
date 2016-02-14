/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orp.database.query;

import com.orp.database.connection.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PRAISON
 */
public class QueryManager extends ConnectionManager{
    
    private Connection connection = null;
    /**
     * 
     * @param Query, argumentList
     * @return 
     */
    public ResultSet returnResult(String query,List<Object> argumentList) {
        try {
            connection = getConnection();
            PreparedStatement pStatement = connection.prepareStatement(query);
            int i = 0;
            for(Object argument:argumentList) {
                i++;
                if(argument instanceof String) {
                    pStatement.setString(i, argument.toString());
                }
            }
            return pStatement.executeQuery();
        } catch (Exception ex) {
            Logger.getLogger(QueryManager.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return null;
    }
}
