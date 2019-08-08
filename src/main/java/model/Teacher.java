package model;

import java.util.List;

public class Teacher extends Person {

    private List<Subject> teachedSubjects;

    public List<Subject> getTeachedSubjects() {
        return teachedSubjects;
    }

    public void setTeachedSubjects(List<Subject> teachedSubjects) {
        this.teachedSubjects = teachedSubjects;
    }
}
