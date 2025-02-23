package java2.projects.bank.resourse;

import java2.projects.bank.utils.BankQueue;

public class Accountant extends Person{
    private BankQueue clients;

    public Accountant(String id, String name, String email, String number) {
        super(id, name, email, number);
    }
}
