package org.example;

public class Account {

    private String name;
    private String lastname;
    private String pesel;
    private String login;
    private String accountNumber;
    private double balance;
    private int pin;

    Account(String name, String lastname, String pesel, String login, String accountNumber, double balance, int pin) {
        this.name = name;
        this.lastname = lastname;
        this.pesel = pesel;
        this.login = login;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPesel() {
        return pesel;
    }

    public String getLogin() {
        return login;
    }

    public int getPin() {
        return pin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;

    }

    public double withdraw(double cashToGet) {
        return balance = balance - cashToGet;
    }
    public double deposit(double cashToDeposit){
        return balance=balance + cashToDeposit;
    }
    public double credit(double moneyToBorrow){
        double check=balance*0.1;
        if (check>moneyToBorrow){

                        return balance += moneyToBorrow;

        }else {
            System.out.println("Kredyt nie został przyznany");
            return balance;
        }
    }
}

