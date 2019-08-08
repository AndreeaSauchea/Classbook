package model;

import java.util.List;

public class ReportCard {

    public static final String MARK_LIST_IS_NULL = "Mark list is null";
    public static final String MARK_LIST_IS_EMPTY = "Mark list is empty";
    private Student student;
    private Subject subject;
    private List<Double> marks;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public List<Double> getMarks() {
        return marks;
    }

    public void setMarks(List<Double> marks) {
        this.marks = marks;
    }

    public double calculateAverage(List<Double> marks) throws IllegalArgumentException{
        if (marks == null){
            throw new IllegalArgumentException(MARK_LIST_IS_NULL);
        }
        if (marks.isEmpty()){
            throw new IllegalArgumentException(MARK_LIST_IS_EMPTY);
        }
        Double sum = calculateSum(marks);
        return sum/marks.size();
    }

    private Double calculateSum(List<Double> marks) {
        Double sum = 0.0;
        for (Double mark : marks) {
            sum += mark;
        }
        return sum;
    }
}
