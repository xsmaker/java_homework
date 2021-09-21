package xujinsong;

import java.util.Date;

public class Account {
    private String id, name;
    private double balance;
    private Date datetime;
    private static double all_balance=0;
    private static int list=0;
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
        all_balance += this.balance;
    }
    public Date getDatetime(){
        return datetime;
    }
    public void setDatetime(Date datetime){
        this.datetime = datetime;
    }
    public Account(String id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.datetime = new Date();
        all_balance += balance;
        list ++;
    }
    public Account(){
        this.id = "";
        this.name = "";
        this.balance = 0;
        this.datetime = new Date();
        list ++;
    }
    public void deposit(double money){
        this.balance = this.balance + money;
        all_balance = money + all_balance;
    }
    public void withdraw(double money){
        if (this.balance < money){
            System.out.println("您的余额不足，不能取钱");
            return;
        }
        this.balance = this.balance - money;
        all_balance = all_balance - money;
    }
    public void changeMoney(Account other, double money){
        if (this.balance < money){
            System.out.println("您的余额不足，不能转帐");
            return;
        }
        this.balance = this.balance - money;
        other.balance = other.balance + money;
    }
    public void print(){
        System.out.println("账号：" +id +" 户名：" +name +"余额：" +balance);
    }
    public static double getAllbalance(){
        return all_balance;
    }
    public static int getList(){
        return list;
    }
}


