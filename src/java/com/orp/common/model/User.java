/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orp.common.model;

import java.util.Date;

/**
 *
 * @author PRAISON
 */
public class User {
    private String name;
    private Date lastModified;
    private Boolean status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
}
