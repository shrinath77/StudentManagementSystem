import java.util.ArrayList;
import java.util.Scanner;

// Class representing a Student
class Student {
    private String name;
    private int age;
    private String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

// Main class for Student Management System
public class StudentManagementSystem {
    // List to store student objects
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    // Method to display the menu
    private static void displayMenu() {
        System.out.println("\nStudent Management System");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
    }

    // Method to add a student
    private static void addStudent() {
        System.out.print("\nEnter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        System.out.print("Enter Student Grade: ");
        String grade = scanner.nextLine();

        students.add(new Student(name, age, grade));
        System.out.println("Student added successfully!");
    }

    // Method to view all students
    private static void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("\nNo students found.");
        } else {
            System.out.println("\nStudent List:");
            for (Student student : students) {
                student.displayInfo();
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    System.out.println("Exiting... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
