// MVCPatternTest.java
public class MVCPatternTest {
    public static void main(String[] args) {
        // Create a Student model
        Student student = new Student("John Doe", "12345", "A");

        // Create a Student view
        StudentView view = new StudentView();

        // Create a Student controller
        StudentController controller = new StudentController(student, view);

        // Display initial student details
        controller.updateView();

        // Update student details
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("A+");

        // Display updated student details
        controller.updateView();
    }
}
