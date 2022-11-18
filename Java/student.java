// public class student {
//     public static void main (string[] args)
//     Student s1=new Student();
//     s1.setFname();
//     s1.setLname();
//     s1.setAge();
//     System.out.println("Full Name is:" +s1.getFullName());
//     System.out.println("Birth year is:" +s1.getBirthyear(s1.age"));   
// }


import java.utli.Scanner;
public class student{
    String FNammer,LName;
    int age;
    Scanner sc=new Scanner(System.in);

    void setFName(){
        System.out.println("Enter the first Name");
        FName=sc.nextLine();
    }

    void setLname(){
        System.out.println("Enter the last name");
        LName=sc.nextLine();
    }

    void setAge(){
        System.out.println("Enter your age ");
        Age=sc.nextInt();
    }

    String getFull Name(){
        String fullName;
        fullName=fName + " " + lName;
        return fullName;
    }

    int getBirthYear(int)


}