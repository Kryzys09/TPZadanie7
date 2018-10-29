package com.tp.lista1;

import java.util.Scanner;

/**
 * Hello world!
 * Krzysztof Klęczek
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("World Hello!");
        Account admin = new Account( "admin", "admin");
        System.out.println("Enter Login:");
        Scanner s = new Scanner(System.in);
        String templgn = s.nextLine();
        System.out.println("Enter password");
        String temppsswd = s.nextLine();
        if(admin.checkLogin(templgn) && admin.checkPassword(temppsswd)){
            System.out.println("Choose what you want to do:\n1. Account operations\n2. Read Mail\n3. Send Mail\n");
            String temp = s.nextLine();
            switch(temp){
                case "1":
                    System.out.println("1. Change login\n2. Change password\n");
                    temp = s.nextLine();
                    switch(temp){
                        case "1":
                            changeLogin(admin);
                            break;
                        case "2":
                            changePassword(admin);
                            break;
                        default:
                            System.out.println("Wrong number");
                            break;
                    }
                    break;
                case "2":
                    readMail();
                    break;
                case "3":
                    writeMail();
                    break;
                default:
                    System.out.println("Wrong number");
                    break;
            }
        }else{
            System.out.println("Wrong login or password ");
        }
    }

    public static void changeLogin(Account account){
        System.out.println("Enter new login:\n");
        Scanner s = new Scanner(System.in);
        account.setLogin(s.nextLine());
        System.out.println("Your new login is: " + account.getLogin());
    }

    public static void changePassword(Account account){
        System.out.println("Enter new password:\n");
        Scanner s = new Scanner(System.in);
        account.setPassword(s.nextLine());
        System.out.println("Your new password is: " + account.getPassword());
    }

    public static void readMail(){
        System.out.println("You read a mail");
    }
    public static void writeMail(){
        System.out.println("You wrote a mail");
    }
}
