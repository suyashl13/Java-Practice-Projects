class Student {
    public int serialNo;
    public String studentName;
    public float marks;

    Student(int serialNo, String studentName, float marks) {
        this.marks = marks;
        this.studentName = studentName;
        this.serialNo = serialNo;
    }

}

public class ArrayOfObjectsDemo {
    public static void main(String[] args) {
        //  Array of student.
        Student [] students = new Student[3];

        students[0] = new Student(1, "Suyash", 100);
        students[1] = new Student(2, "John", 80);
        students[2] = new Student(3, "James", 70);

        // Print all student details using for each loop.
        System.out.println("Sr. No.\tStudent Name\tMarks");
        for(Student student: students) {
            System.out.println(student.serialNo+"\t"+student.studentName+"\t\t"+student.marks);
        }
    }
}
