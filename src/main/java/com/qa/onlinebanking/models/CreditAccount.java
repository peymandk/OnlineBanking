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
import javax.persistence.Column;
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
public class CreditAccount extends Account implements Serializable {

  
    

    public void saveCreditAccount() throws IllegalAccessException, InvocationTargetException {
        ObjectDao creditAccountDao = new ObjectDao();
        creditAccountDao.addOrUpdateObject(this, this.getAccountId(), CreditAccount.class);
    }

    public void updateCreditAccount() throws IllegalAccessException, InvocationTargetException {
        ObjectDao creditAccountDao = new ObjectDao();
        creditAccountDao.updateObject(this, this.getAccountId(), CreditAccount.class);
    }

    public void deleteCreditAccount() throws IllegalAccessException, InvocationTargetException {
        ObjectDao creditAccountDao = new ObjectDao();
        creditAccountDao.deleteObject(this, this.getAccountId(), CreditAccount.class);
    }

    public static CreditAccount getCreditAccountById(long id) {
        CreditAccount creditAccountHolder = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            creditAccountHolder = (CreditAccount) session.get(CreditAccount.class, id);
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return creditAccountHolder;
    }

    public static ArrayList<CreditAccount> getCreditAccounts() {
        ArrayList<CreditAccount> creditAccounts;
        ObjectDao creditAccountDao = new ObjectDao();
        creditAccounts = creditAccountDao.getAllObjects("CreditAccount");
        return creditAccounts;
    }
}
