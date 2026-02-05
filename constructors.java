class Student {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student("Himaja", 101);
        System.out.println(s1.name + " - " + s1.id);
    }
}
