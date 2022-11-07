package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Account account1=new Account("Adam","Adamek","123456789","AdAd","123456788",1000000,1234);
        Scanner sc=new Scanner(System.in);

        System.out.println("Witaj w naszym Banku");
        System.out.println("Użytkowniku wpisz login");
        String login=sc.next();
        if (login.equals(account1.getLogin())){
            System.out.println("Poprawny login");
        } else {
            System.out.println("Błędny login");

        }

        System.out.println("podaj kod PIN");
        int pin=sc.nextInt();


    }
    }

