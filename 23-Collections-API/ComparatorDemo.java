import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Student implements Comparable<Student> { 
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        if (this.marks > o.marks) {
            return 1;
        } else {
            return -1;
        }
    }
    
}

public class ComparatorDemo {
    public static void main(String[] args) {
        Comparator<Integer> intComparator = (Integer a, Integer b) -> {
            if (a%10 > b%10) {
                return 1;
            } else {
                return -1;
            }
        };


        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        
        for (int i = 0; i < 10; i++) {
            intArrayList.add((int) (Math.random() * 100));
        }

        System.out.println("Before sorting: ");
        for (Integer integer : intArrayList) {
            System.out.println(integer);
        }

        Collections.sort(intArrayList, intComparator);

        System.out.println("After sorting: ");
        
        for (Integer integer : intArrayList) {
            System.out.println(integer);
        }

        // Sort in reverse order.
        Collections.sort(intArrayList, intComparator.reversed());

        // ArrayList with custom objects.
        ArrayList<Student> studentArrayList = new ArrayList<Student>();

        studentArrayList.add(new Student("Suyash", 98));
        studentArrayList.add(new Student("Rahul", 95));
        studentArrayList.add(new Student("Rohit", 92));
        studentArrayList.add(new Student("Rahul", 90));

        System.out.println("Before sorting: ");
        for (Student student : studentArrayList) {
            System.out.println(student.name + " scored " + student.marks);
        }

        // Other Way.
        // Comparator<Student> studentComparator =  (o1, o2) -> {
        //     if (o1.marks > o2.marks) {
        //         return 1;
        //     } else {
        //         return -1;
        //     }
        // };

        Collections.sort(studentArrayList);

        System.out.println("After sorting: ");
        for (Student student : studentArrayList) {
            System.out.println(student.name + " scored " + student.marks);
        }

    }
}
