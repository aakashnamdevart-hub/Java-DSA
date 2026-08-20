package OOPs;

public class Classandobj {
    
    public static void main(String args[]){
        Student s1 = new Student();
        s1.setName("akash namdeo");
        s1.setAge(19);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        
        Student s2 = new Student();
        s2.setName("Aman namdeo");
        s2.setAge(22);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());

    }
}


class Student{
    private String name;
    private int age;

    void setName(String name){
      this.name = name;   
    }

    void setAge(int age){
        this.age = age;
    }

    String getName(){
        return this.name;
    }

    int getAge(){
        return this.age;
    }
}