/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orp.dao;
import com.orp.common.model.User;
/**
 *
 * @author PRAISON
 */
public interface UserDao {
    public Boolean doAuthenticate(String userName,String password) throws Exception;
}
