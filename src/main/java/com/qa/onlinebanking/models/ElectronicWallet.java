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
public class ElectronicWallet extends Account implements Serializable {


    @Override
    public long saveAccount() {
        ObjectDao<ElectronicWallet> accountDao = new ObjectDao<ElectronicWallet>();
        return accountDao.addObject(this);
    }

    public void updateAccount() throws IllegalAccessException, InvocationTargetException {
        ObjectDao<ElectronicWallet> accountDao = new ObjectDao<ElectronicWallet>();
        accountDao.updateObject(this, this.getAccountId(), ElectronicWallet.class);
    }

    @Override
    public void deleteAccount() throws IllegalAccessException, InvocationTargetException {
        ObjectDao<ElectronicWallet> accountDao = new ObjectDao<ElectronicWallet>();
        accountDao.deleteObject(this, this.getAccountId(), ElectronicWallet.class);
    }

    public static ElectronicWallet getElectronicWalletById(long id) {
        ElectronicWallet accountHolder = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            accountHolder = (ElectronicWallet) session.get(ElectronicWallet.class, id);
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return accountHolder;
    }

    public static ArrayList<ElectronicWallet> getElectronicWallets() {
        ArrayList<ElectronicWallet> accounts;
        ObjectDao accountDao = new ObjectDao<ElectronicWallet>();
        accounts = accountDao.getAllObjects("ElectronicWallet");
        return accounts;
    }

}
