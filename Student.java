import java.util.*;

public class Student {
    Scanner sc = new Scanner(System.in);
    int rollno, grade;
    String address, dob, name;
    float percentage;

    public Student(int rollno, String name, String address, int grade, String dob, float percentage) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
        this.grade = grade;
        this.dob = dob;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRno() {
        return rollno;
    }

    public void setRno(int rollno) {
        this.rollno = rollno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public void recalcPercentage(int rollno) {
        System.out.println("lets recalculate the percentage for rollno " + rollno);
        System.out.println("Enter the math marks:");
        int math = sc.nextInt();
        System.out.println("Enter the social marks:");
        int soc = sc.nextInt();
        System.out.println("Enter the english marks:");
        int eng = sc.nextInt();
        System.out.println("Enter the science marks:");
        int sci = sc.nextInt();
        System.out.println("Enter the fmm marks:");
        int fmm = sc.nextInt();
        float percent = (math + soc + eng + sci + fmm) / 5;
        sc.nextLine();
        System.out.println("Do you want save the recalculated percentage? (Y/N)");
        String ch = sc.nextLine();
        if (ch == "Y") {
            setPercentage(percent);
            System.out.println("Recalculated percentade updated successfully.");
        }
    }
}