public class Student extends Person {

    private int numCourses = 0;
    private String[] courses = new String[10];
    private int[] grades = new int[10];

    // Constructor
    public Student(String name, String address) {
        super(name, address);
    }

    // Tambah course dan nilai
    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }

    // Tampilkan nilai
    public void printGrades() {
        for (int i = 0; i < numCourses; i++) {
            System.out.println(courses[i] + " : " + grades[i]);
        }
    }

    // Hitung rata-rata
    public double getAverageGrade() {

        int sum = 0;

        for (int i = 0; i < numCourses; i++) {
            sum += grades[i];
        }

        return (double) sum / numCourses;
    }

    // toString
    public String toString() {
        return "Student: " + super.toString();
    }
}
