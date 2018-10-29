package com.tp.lista1;

import java.util.List;

public class Account {
    private String login;
    private String password;
    private List<Mail> mailbox;

    public Account(String login, String password){
        this.login = login;
        this.password = password;
    }

    public void setLogin(String login){
        this.login = login;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getLogin(){
        return login;
    }
    public String getPassword(){
        return password;
    }

    public void addMail(Mail mail){
        mailbox.add(mail);
    }

    public void readMail(){ }

    public boolean checkPassword(String password){
        return this.password.equals(password);
    }

    public boolean checkLogin(String login){
        return this.login.equals(login);
    }
}
