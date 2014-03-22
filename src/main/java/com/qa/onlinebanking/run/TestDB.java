/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qa.onlinebanking.run;

import com.qa.onlinebanking.models.CheckingAccount;
import com.qa.onlinebanking.models.Customer;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author Peyman
 */
public class TestDB {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {

        //Customer cust=Customer.getCustomerById(7);
        CheckingAccount checkingAccount = CheckingAccount.getCheckingAccountById(3);
        if (checkingAccount.withdraw(90)) {
            System.out.println("Yes I deduct this amount form the fuckin guy ");
        } else {
            System.out.println("He does not have enough funs");
        }
        
        
        
        double amount = 1000;
        amount *= 1.15;
        System.out.println(amount);

    }
}
