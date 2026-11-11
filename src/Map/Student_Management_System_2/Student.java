package Map.Student_Management_System_2;

import java.util.Objects;

public class Student {
    private int rollNo;
    private String name;
    private String phoneNo;
    private String address;
    private String branch;
    
    public Student(int rollNo, String name, String phoneNo,String address,String branch){
        this.rollNo = rollNo;
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = address;
        this.branch = branch;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "rollNo= " + rollNo +
                ", name= '" + name + '\'' +
                " address= '" + address + '\'' +
                ", phoneNo= '" + phoneNo + '\'' +
                ", branch= '" + branch ;
    }

    @Override
    public boolean equals(Object o) {
        if (this==o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return this.rollNo ==s.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }
}
