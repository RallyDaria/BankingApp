package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("Adam", "Adamek", "123456789", "AdAd", "123456788", 1000000, 1234);
        Scanner sc = new Scanner(System.in);

        System.out.println("Witaj w naszym Banku");
        System.out.println("Użytkowniku wpisz login");
        String login = sc.next();
        if (login.equals(account1.getLogin())) {
            System.out.println("Poprawny login");
        } else {
            System.out.println("Błędny login");

        }

        System.out.println("podaj kod PIN");
        int pin = sc.nextInt();
        if (pin == account1.getPin()){
            System.out.println("PIN poprawny");
        } else {
            System.out.println(" BŁEDNY PIN!!!");
        };


            int wybor;
        do {
            System.out.println(" MENU - Wybierz numerycznie operacje która cię interesuje ");
            System.out.println("\n 1. Wpłata \n 2. Wypłata \n 3. Sprawdzenie salda konta \n 4. Weź Kredyt  \n 5. Wyjście");
            System.out.println(" Twój wybór");
            wybor = sc.nextInt();

            switch (wybor) {
                case 1:
                    System.out.println("Wpłata gotówki ");
                    double wplata=sc.nextDouble();
                    account1.deposit(wplata);
                    System.out.println("Aktualny stan konta to: "+ account1.getBalance());
                    break;
                case 2:
                    System.out.println("Wypłata gotówki");
                    double wyplata = sc.nextDouble();
                    account1.withdraw(wyplata);
                    System.out.println("Aktualny stan konta to: "+ account1.getBalance());
                    break;
                case 3:
                    System.out.println("Sprawdzenie salda konta");
                    System.out.println(account1.getBalance());
                    break;
                case 4:
                    System.out.println("Weź Kredyt");
                    double kredyt=sc.nextDouble();
                    account1.credit(kredyt);
                    System.out.println("Nowy stan konta"+ account1.getBalance());

                    break;
                case 5:
                    System.out.println("Do widzenia ");
            }

        } while (wybor != 5);

    }
}
