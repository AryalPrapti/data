public class Student1 {
    int rollno;//instance variable
    String name;
    static String college="softwarica";

    Student1(int r,String n){
        rollno=r;
        name=n;

    }
    void display(){
        System.out.println(rollno+ " "+name+" "+college);
    }
}
    
