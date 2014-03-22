/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qa.onlinebanking.run;

import com.qa.onlinebanking.models.Account;
import com.qa.onlinebanking.models.CheckingAccount;
import com.qa.onlinebanking.models.Customer;
import com.qa.onlinebanking.models.ElectronicWallet;
import com.qa.onlinebanking.models.Person;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/**
 *
 * @author Peyman
 */
public class HibernateTesting {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
//        Person p = new Person();
//        
//        p.setFirstName("Peyman");
//        p.setLastName("Kavian");
//        p.setEmail("sgdgredh");
//        p.setPassword("11111");
//        p.setPhoneNumber("514-565464");
//       p.savePerson();

//       Person pp= Person.getPersonById(1);
//        System.out.println("ID: "+ pp.getPersonId()+"  First Name: "+ pp.getFirstName()+" Last Name: "+ pp.getLastName());
//        Customer customer= new Customer();
//        customer.setFirstName("Khalid");
//        customer.setLastName("Altoum");
//        customer.saveCustomer();
        Customer customer = new Customer();
        customer.setFirstName("Ali");
        customer.setLastName("Husain");
        long custId = customer.saveCustomer();

        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setBalance(5000);
        checkingAccount.setAccountNumber("C100");
        long checkId = checkingAccount.saveAccount();

        ElectronicWallet electronicWallet = new ElectronicWallet();
        electronicWallet.setAccountNumber("W100");
        long walletId = electronicWallet.saveAccount();

        customer = Customer.getCustomerById(custId);
        electronicWallet = ElectronicWallet.getElectronicWalletById(walletId);
        checkingAccount = CheckingAccount.getCheckingAccountById(checkId);

        ArrayList<Account> accounts = new ArrayList<Account>();
        accounts.add(checkingAccount);
        accounts.add(electronicWallet);
        customer.setAccounts(accounts);
        checkingAccount.setRelatedCustomer(customer);
        electronicWallet.setRelatedCustomer(customer);
        
        checkingAccount.updateAccount();
        electronicWallet.updateAccount();
        
        customer.updateCustomer();

    }

}
