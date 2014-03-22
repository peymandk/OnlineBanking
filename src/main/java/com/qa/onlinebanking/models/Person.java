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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import org.hibernate.Session;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

/**
 *
 * @author Peyman
 */
@ManagedBean
@RequestScoped

@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public class Person implements Serializable {
    
    @Id
    @GeneratedValue
    protected long personId;

    @Column
    private String userName;

    @Column
    private String password;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String gender;

    @Column
    private String email;
    
    @Column
    @Type(type = "org.joda.time.contrib.hibernate.PersistentDateTime")
    private DateTime dateOfBirth;

    @Column
    private String phoneNumber;

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
  
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public DateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void savePerson() {
        ObjectDao userDao = new ObjectDao();
        userDao.addObject(this);
    }

    public void updatePerson() throws IllegalAccessException, InvocationTargetException {
        ObjectDao userDao = new ObjectDao();
        userDao.updateObject(this, personId, Person.class);
    }

    public void deletePerson() throws IllegalAccessException, InvocationTargetException {
        ObjectDao userDao = new ObjectDao();
       userDao.updateObject(this, personId, Person.class);
    }

    public ArrayList<Person> getAllPersons() {
        ArrayList<Person> persons; 
        ObjectDao userDao = new ObjectDao();
        persons = userDao.getAllObjects("Person");
        return persons;
    }

   public static Person getPersonById(long id) {
        Person personHolder = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            personHolder = (Person) session.get(Person.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return personHolder;
    }
}
