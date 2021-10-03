package XuT1;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(){

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age) throws AgeException{
        if (age < 0 || age > 200){
            throw new AgeException();
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        try{
            System.out.println("请输入年龄");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            p1.setAge(a);

        } catch (AgeException e){
            System.out.println("给age赋值错误：" +e.getMessage());
        }


    }
}

