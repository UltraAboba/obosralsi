package com.example.myapplication;

public class DataBase {
public static String gmail;
public static String password;
public DataBase(){};
    public DataBase(String word,String mail){
        DataBase.gmail = mail;
        DataBase.password = word;
    }
    public static String getGmail(){
        return gmail;
    }
    public static void  setGmail(String mail)
    {
        DataBase.gmail = mail;
    }
    public static String getPassword()
    {
        return password;
    }
    public static void setPassword(String password)
    {
        DataBase.password = password;
    }
    public static String ai = DataBase.getGmail();
    public static String ay = DataBase.getPassword();
}
