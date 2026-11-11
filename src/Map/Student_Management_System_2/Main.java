package Map.Student_Management_System_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = StudentService.sc;
        System.out.println("================== WELCOME ==================");
        while (true){
            System.out.println("Add Student Press --> 1");
            System.out.println("Dispaly All Students press --> 2");
            System.out.println("Delete Student press --> 3");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    StudentService.addStudents();
                    break;
                case 2:
                    StudentService.displayAllStudents();
                    break;
                case 3:
                    StudentService.deleteStudent();
                    break;
                default:
                    System.out.println("Invalid Choice!!");
            }
        }
    }
}
