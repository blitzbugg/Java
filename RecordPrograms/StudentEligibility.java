// 7.	Write a java program to find the details of the students eligible to enroll for the examination (Students, Department combinedly give the eligibility criteria for the enrollement class) using interfaces.

import java.io.DataInputStream;

interface Student {
    void inputStudentDetails(int sno, String sname, String className);
    void displayStudentDetails();
}

interface Department {
    void inputAttendance(int attendance);
    int getAttendance();
}

interface Exam {
    boolean isEligible();
    void displayEligibility();
}

class StudentDetails implements Student, Department, Exam {
    int sno;
    String sname;
    String className;
    int attendance;

    public void inputStudentDetails(int sno, String sname, String className) {
        this.sno = sno;
        this.sname = sname;
        this.className = className;
    }

    public void inputAttendance(int attendance) {
        this.attendance = attendance;
    }

    public void displayStudentDetails() {
        System.out.println("Student Number: " + sno);
        System.out.println("Student Name: " + sname);
        System.out.println("Class: " + className);
    }

    public int getAttendance() {
        return attendance;
    }

    public boolean isEligible() {
        return attendance >= 75;
    }

    public void displayEligibility() {
        System.out.println("\nExam Eligibility:");
        displayStudentDetails();
        System.out.println("Attendance: " + attendance + "%");
        if (isEligible()) {
            System.out.println("Status: Eligible for Exam");
        } else {
            System.out.println("Status: Not Eligible for Exam");
        }
    }
}

public class StudentEligibility {
    public static void main(String[] args) {
        try {
            DataInputStream input = new DataInputStream(System.in);

            StudentDetails student1 = new StudentDetails();

            System.out.println("Enter the student No: ");
            int sno = Integer.parseInt(input.readLine()); //
            
            System.out.println("Enter the student name: ");
            String sname = input.readLine();

            System.out.println("Enter the student classname: ");
            String className = input.readLine();

            System.out.println("Enter the student attendance %: ");
            int attendance = Integer.parseInt(input.readLine());

            student1.inputStudentDetails(sno, sname, className);
            student1.inputAttendance(attendance);

            student1.displayEligibility();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
