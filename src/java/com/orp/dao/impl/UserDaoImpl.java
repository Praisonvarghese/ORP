/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orp.dao.impl;

import com.orp.common.model.User;
import com.orp.connection.query.QueryInterface;
import com.orp.dao.UserDao;
import com.orp.database.query.QueryManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PRAISON
 */
public class UserDaoImpl implements UserDao {

    @Override
    public Boolean doAuthenticate(String userName, String password) throws Exception{
        //AUTENTICATE_USER
        Boolean isUserFound = false;
         try {
            QueryManager queryManager = new QueryManager();
            List<Object> lst = new ArrayList<Object>();
            lst.add(userName);
            lst.add(password);
            ResultSet resultSet = queryManager.returnResult(QueryInterface.AUTENTICATE_USER, lst);
            if(resultSet.isBeforeFirst()) {
                resultSet.next();
                if(resultSet.getInt(1) == 1) {
                    isUserFound = true;
                } 
            }
            
            System.out.println("cn ...... "+resultSet.getInt(1));
        } catch (Exception ex) {
            throw ex;
        }
        return isUserFound;
    }
    
}
