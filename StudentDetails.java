import java.util.*;
public class StudentDetails {
    public static int n;
    public static Student[] s = new Student[n];
    public static void main(String[]args){
       Student s1 =  new Student(1,"lakshmi", "a-1703 aparna sarovar grande", 10, "13-11-2010", 95.2f);
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the function you would like to perform:- \n1. Add student details.\n2.Modify a student's details.\n3.Calculate percentage\n4.Display everything.");
       int ch = sc.nextInt();
       if (ch == 1){
        System.out.println("Enter the no.of students you would like to add");
        n = sc.nextInt();
        for(int i = 1; i<n; i++){
                System.out.println("enter student"+i+"s rollno.");
                int rno= sc.nextInt();
                System.out.println("enter student"+i+"s name");
                String nme = sc.nextLine();
                System.out.println("enter student" + i + "s address");
                String adr = sc.nextLine();
                System.out.println("enter student" + i + "s grade");
                int grd = sc.nextInt();
                System.out.println("enter student" + i + "s date of birth");
                String dob = sc.nextLine();
                System.out.println("enter student" + i + "s marks percentage");
                Float percent = sc.nextFloat();
                s[i] = new Student(rno, nme, adr, grd, dob, percent);            
        }
    }
    else if(ch == 2){
        System.out.println("Enter the rollno. of the student(whose details to be modified)");
        int r = sc.nextInt();
        System.out.println("Enter which variable must be modified(in lowercase letter)");
        String vm = sc.nextLine();
        for(int j =1; j<=n; j++){
            if(s[j].rollno == r){
                
            }
        }
    }
}
}
