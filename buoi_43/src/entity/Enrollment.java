package entity;

public class Enrollment {

    private Long id;
    private Long studentId;
    private Long courseId;
    private double score;

    public Enrollment(Long id, Long studentId, Long courseId, double score) {
        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Enrollment [id=" + id + ", studentId=" + studentId + ", courseId=" + courseId + ", score=" + score + "]";
    }
    
}