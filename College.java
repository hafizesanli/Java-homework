import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
class Semester{
    public static class Student{
        private String name;
        private int id;
        public Student(String name, int id){
            this.name=name;
            this.id = id;

        }
        public String getName(){
            return name;
        }
        public int getId(){
            return id;
        }
    }
    public static class Course{
        private String code;
        private String name;
        private ArrayList<Enrollment> enrollments;

        public Course(String code, String name) {
            this.code = code;
            this.name = name;
            this.enrollments = new ArrayList<Enrollment>();
        }

        public void addEnrollment(Enrollment enrollment) {
            if (this.enrollments.size() < 2) {
                this.enrollments.add(enrollment);
            } else {
                System.out.println(this.name);
            }
        }

        public String getCode() {
            return code;
        }

        public String getName() {
            return name;
        }

        public ArrayList<Enrollment> getEnrollments() {
            return enrollments;
        }
    }
    }
public class Enrollment {
    private Student student;
    private int midtermScore;
    private int finalScore;

    public Enrollment(Student student, int midtermScore, int finalScore) {
        this.student = student;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
    }

    public Student getStudent() {
        return student;
    }

    public int getMidtermScore() {
        return midtermScore;
    }

    public int getFinalScore() {
        return finalScore;
    }
}

public class College {
    public static void main(String[] args) {







    }
}