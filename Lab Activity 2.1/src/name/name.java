package name;

   import java.util.Scanner;

public class name {
    private final String firstName;
    private final String lastName;
    private int age;
    private boolean isMinor;

    public name(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMinor = age < 18;
    }

    public String getName() {
        return lastName + ", " + firstName;
    }

    public void increaseAge() {
        age++;
        isMinor = age < 18;
    }
    @Override
    public String toString() {
        return lastName + ", " + firstName + " - " + age + " - " + (isMinor ? "minor" : "adult");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Enter test case number:");
        int testCase = scanner.nextInt();
       
        
        switch (testCase) {
            case 1 -> {
                name student1 = new name("Jemar Jude", "Maranga", 17);
                System.out.println("Test Case 1: Student under 18");
                System.out.println(student1);
            }
            case 2 -> {
                name student2 = new name("Jemar Jude", "Maranga", 17);
                student2.increaseAge();
                System.out.println("Test Case 2: Increase age of student 1");
                System.out.println(student2);
            }
            case 3 -> {
                name student3 = new name("Jose", "Cruz", 19);
                System.out.println("Test Case 3: Student over 18");
                System.out.println(student3);
            }
            default -> System.out.print("Invalid test case number");
        }
    }
}