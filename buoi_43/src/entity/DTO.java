package entity;

public class DTO {

    public static class Pair<T> {

        private T element1;
        private T element2;
        
        public Pair(T element1, T element2) {
            this.element1 = element1;
            this.element2 = element2;
        }

        public T getElement1() {
            return element1;
        }

        public void setElement1(T element1) {
            this.element1 = element1;
        }

        public T getElement2() {
            return element2;
        }

        public void setElement2(T element2) {
            this.element2 = element2;
        }

        @Override
        public String toString() {
            return "Pair [element1=" + element1 + ", element2=" + element2 + "]";
        }

    }

    public static class DTO1 {

        private Long studentId;
        private String studentName;
        private double gpa;
        
        public DTO1(Long studentId, String studentName, double gpa) {
            this.studentId = studentId;
            this.studentName = studentName;
            this.gpa = gpa;
        }

        public Long getStudentId() {
            return studentId;
        }

        public void setStudentId(Long studentId) {
            this.studentId = studentId;
        }

        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public double getGpa() {
            return gpa;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }

        @Override
        public String toString() {
            return "DTO1 [studentId=" + studentId + ", studentName=" + studentName + ", gpa=" + gpa + "]";
        }

    }

    public static class DTO2 {

        private Long studentId;
        private String studentName;
        private String courseName;
        private double courseScore;
        
        public DTO2(Long studentId, String studentName, String courseName, double courseScore) {
            this.studentId = studentId;
            this.studentName = studentName;
            this.courseName = courseName;
            this.courseScore = courseScore;
        }

        public Long getStudentId() {
            return studentId;
        }

        public void setStudentId(Long studentId) {
            this.studentId = studentId;
        }

        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public String getCourseName() {
            return courseName;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public double getCourseScore() {
            return courseScore;
        }

        public void setCourseScore(double courseScore) {
            this.courseScore = courseScore;
        }

        @Override
        public String toString() {
            return "DTO2 [studentId=" + studentId + ", studentName=" + studentName + ", courseName=" + courseName
                    + ", courseScore=" + courseScore + "]";
        }

    }
    
}