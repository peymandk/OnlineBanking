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
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class CheckingAccount extends Account implements Serializable {

    @Override
    public long saveAccount() {
        ObjectDao<CheckingAccount> accountDao = new ObjectDao<CheckingAccount>();
        return accountDao.addObject(this);
    }

    @Override
    public void updateAccount() throws IllegalAccessException, InvocationTargetException {
        ObjectDao<CheckingAccount> checkingAccountDao = new ObjectDao<CheckingAccount>();
        checkingAccountDao.updateObject(this, this.getAccountId(), CheckingAccount.class);
    }

    @Override
    public void deleteAccount() throws IllegalAccessException, InvocationTargetException {
        ObjectDao checkingAccountDao = new ObjectDao();
        checkingAccountDao.deleteObject(this, this.getAccountId(), CheckingAccount.class);
    }

    public static CheckingAccount getCheckingAccountById(long id) {
        CheckingAccount checkingAccountHolder = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            checkingAccountHolder = (CheckingAccount) session.get(CheckingAccount.class, id);
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return checkingAccountHolder;
    }

    public static ArrayList<CheckingAccount> getCheckingAccounts() {
        ArrayList<CheckingAccount> checkingAccounts;
        ObjectDao checkingAccountDao = new ObjectDao();
        checkingAccounts = checkingAccountDao.getAllObjects("CheckingAccount");
        return checkingAccounts;
    }

    @Override
    public boolean withdraw(double amount) throws IllegalAccessException, InvocationTargetException {
        boolean isDone = false;

        if (this.getBalance() >= amount) {
            super.withdraw(amount);
            isDone = true;
        }
        return isDone;
    }
}
