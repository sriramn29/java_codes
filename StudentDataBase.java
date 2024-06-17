class Student {
    String name;
    int rollno;
    int marks[];

    public Student(String name, int rollno, int marks[]) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    void updateMarks(int marks[]) {
        this.marks = marks;
    }

    public int totalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollno;
    }
}

public class StudentDataBase {
    public static void main(String[] args) {
        Student student1 = new Student("Sriram", 204, new int[] {85, 92, 89, 95, 100});
        Student student2 = new Student("Sameer", 178, new int[] {87, 83, 92, 96, 89});
        System.out.println(student1.getName() + "(RollNo " + student1.getRollNo() + ") TotalMarks: " + student1.totalMarks());
        System.out.println(student2.getName() + "(RollNo " + student2.getRollNo() + ") TotalMarks: " + student2.totalMarks());
        student2.updateMarks(new int[] {90, 92, 96, 91, 100});
        System.out.println(student2.getName() + "(RollNo " + student2.getRollNo() + ") TotalMarks: " + student2.totalMarks());
    }
}