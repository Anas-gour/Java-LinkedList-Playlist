package Map.Student_Management_System_2;

import java.util.*;

public class StudentService {
    private static Map<Integer, Set<Student>> map = new HashMap<>();
    public static Scanner sc = new Scanner(System.in);
    public static void addStudents(){
        System.out.println("Enter Group ID:");
        int groupId = sc.nextInt();
        
        System.out.println("How Many Student You Want to Add ");
        int size = sc.nextInt();
        sc.nextLine();
        
        Set<Student> set = map.get(groupId);
        if (set==null){
            set = new HashSet<>();
        }
        
        for (int i = 1; i<=size; i++){
            System.out.println("Enter rollNo:");
            int rollno = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Student Name: ");
            String name = sc.nextLine();
            System.out.println("Enter Phone No:");
            String phone = sc.nextLine();
            System.out.println("Enter address: ");
            String address = sc.nextLine();
            System.out.println("Enter Branch: ");
            String branch = sc.nextLine();
            Student s = new Student(rollno,name,phone,address,branch);
            boolean result = set.add(s);
            if (result){
                System.out.println("Student Added Successfully!!");
            }else{
                System.out.println("Duplicate Roll Number!!");
            }
        }
        map.put(groupId,set);
        
    }
    
    public static void displayAllStudents(){
        Set<Map.Entry<Integer,Set<Student>>> set = map.entrySet();
        Iterator<Map.Entry<Integer,Set<Student>>> cursor = set.iterator();
        
        if (set.isEmpty()){
            System.out.println("List is Empty!!");
        }else{
            while (cursor.hasNext()){
                Map.Entry<Integer,Set<Student>> entry = cursor.next();
                System.out.println(entry.getKey()+": "+entry.getValue());
            }
            System.out.println("===================================================");
        }
    }
    
    
    public static void deleteStudent(){
        System.out.println("Enter Grouup Id:");
        int groupId = sc.nextInt();
        sc.nextLine();
        if (map.containsKey(groupId)){
            Set<Student> set = map.get(groupId);
            System.out.println("Enter Student RollNo: ");
            int rollNo = sc.nextInt();
            Iterator<Student> cursor = set.iterator();
            boolean found = false;
            while (cursor.hasNext()){
                Student s = cursor.next();
                if (s.getRollNo()==rollNo){
                    cursor.remove();
                    found = true;
                    System.out.println("Student Deleted Succesfully!!");
                    System.out.println("================================");
                    break;
                }
            }
            if (!found){
                System.out.println("Student Not Found!!");
                System.out.println("=====================");
            }
            if (set.isEmpty()){
                map.remove(groupId);
                System.out.println("Group is Also Removed Because it is empty.");
                System.out.println("=============================================");
            }
        }else{
            System.out.println("Group ID not Found!!");
            System.out.println("=======================");
        }
    }
    
    public static void searchById(){
        System.out.println("Enter ");
        
    }
    
}
