/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orp.connection.query;

/**
 *
 * @author PRAISON
 */
public interface QueryInterface {
    public static final String AUTENTICATE_USER = "SELECT count(*) "+
                                                    "FROM tbl_user "+
                                                      "WHERE user_name=? AND user_pass=?";
}
