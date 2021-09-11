public class student {
    private String name;
    private int age;
    private String sex;
    private int height;
    private String grade;
    public student(String name, String sex, String grade, int age, int height){
        this.name = name;
        this.sex = sex;
        this.grade = grade;
        this.age = age;
        this.height = height;
    }
    public void adult(){
        if (age>=18)
            System.out.print("该学生已成年");
        else
            System.out.print("该学生未成年");
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getSex(){
        return sex;
    }
    public int getHeight(){
        return height;
    }
    public String getGrade(){
        return grade;
    }

}
