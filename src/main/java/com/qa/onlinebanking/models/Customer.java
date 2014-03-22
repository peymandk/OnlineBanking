/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.qa.onlinebanking.models;

import com.qa.onlinebanking.dao.ObjectDao;
import com.qa.onlinebanking.persistence.HibernateUtil;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.Session;

/**
 *
 * @author Peyman
 */
@ManagedBean
@RequestScoped

@Entity
@Table
@PrimaryKeyJoinColumn(name = "personId")
public class Customer extends Person implements Serializable {
    
   

    @OneToMany(mappedBy = "relatedCustomer")
    private List<Account> accounts;
    

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
    
    
    
    public long saveCustomer() {
        ObjectDao userDao = new ObjectDao();
      return  userDao.addObject(this);
    }

 public void updateCustomer() throws IllegalAccessException, InvocationTargetException {
        ObjectDao userDao = new ObjectDao();
        userDao.updateObject(this, this.getPersonId(), Customer.class);
    }
 
    public void deleteCustomer() throws IllegalAccessException, InvocationTargetException {
        ObjectDao userDao = new ObjectDao();
        userDao.deleteObject(this, this.getPersonId(), Customer.class);
    }

    public static ArrayList<Customer> getAllCustomers() {
        ArrayList<Customer> customers; 
        ObjectDao userDao = new ObjectDao();
        customers = userDao.getAllObjects("Customer");
        return customers;
    }

   public static Customer getCustomerById(long id) {
        Customer customerHolder = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            customerHolder = (Customer) session.get(Customer.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return customerHolder;
    }
}
