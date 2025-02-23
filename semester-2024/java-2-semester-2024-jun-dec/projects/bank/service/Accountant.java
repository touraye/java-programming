package java2.projects.bank.service;

import java2.projects.bank.resourse.Store;

import java.util.HashSet;
import java.util.Set;

public class Accountant {
    /*
    This class is responsible for creating a bank acc for customer.
    These are the following details needed
     */
//    static public void createAcc(BankAcc acc){
//        // open an account for a customer
//        Store.accList.put(acc.getAccNumber(), acc);
//
//    }
//
//    static public void closeAcc(BankAcc acc){
//        // close a customer bank account
//    }

    static <E> Set<E> request(Set<E> set1, Set<E> set2){
        Set<E> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }
}
