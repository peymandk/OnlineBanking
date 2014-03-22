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
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Peyman
 */
@ManagedBean
@RequestScoped

@Entity
@Table
@PrimaryKeyJoinColumn(name = "accountId")
public class SavingAccount extends Account implements Serializable{
    
    private double withdraw;

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }
    
    
    
      public void saveSavingAccount() throws IllegalAccessException, InvocationTargetException {
        ObjectDao savingAccountDao = new ObjectDao();
        savingAccountDao.addOrUpdateObject(this, this.getAccountId(), SavingAccount.class);
    }

    public void updateSavingAccount() throws IllegalAccessException, InvocationTargetException {
        ObjectDao savingAccountDao = new ObjectDao();
        savingAccountDao.updateObject(this, this.getAccountId(), SavingAccount.class);
    }

    public void deleteSavingAccount() throws IllegalAccessException, InvocationTargetException {
        ObjectDao savingAccountDao = new ObjectDao();
        savingAccountDao.deleteObject(this, this.getAccountId(), SavingAccount.class);
    }

    public static SavingAccount getSavingAccountById(long id) {
        SavingAccount savingAccountHolder = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            savingAccountHolder = (SavingAccount) session.get(SavingAccount.class, id);
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return savingAccountHolder;
    }

    public static ArrayList<SavingAccount> getSavingAccounts() {
        ArrayList<SavingAccount> savingAccounts;
        ObjectDao savingAccountDao = new ObjectDao();
        savingAccounts = savingAccountDao.getAllObjects("SavingAccount");
        return savingAccounts;
    }
}
