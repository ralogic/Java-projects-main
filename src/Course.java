public class Course {
    static void main(String[] args) {
        System.out.println("hello Rahul saini");
        MainCourse Course = new MainCourse("Rahul Saini");
        System.out.println(Course);

    }
}
class MainCourse{
    String courseName;
    int enrolledStudent;
    static int maxCapacity;
   String[] enrolledStudents;
   MainCourse(String courseName){
       this.courseName = courseName;
       this.enrolledStudent = 0;
       this.enrolledStudents = new String[maxCapacity];
   }
    static void SetMaxCapacity(int maxCapacity){
        MainCourse.maxCapacity = maxCapacity;
    }
    void setEnrolledStudents(String studentName){
        enrolledStudents[enrolledStudent] = studentName;
        enrolledStudent++;
    }
    void unEnrolledStudents(String studentName){
        System.out.println("student removed");
        enrolledStudent--;
    }
}
