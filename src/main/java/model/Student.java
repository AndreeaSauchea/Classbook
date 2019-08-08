package model;

import java.util.List;

public class Student extends Person {

    private SchoolClass schoolClass;
    private List<Subject> learningSubjects;

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }

    public List<Subject> getLearningSubjects() {
        return learningSubjects;
    }

    public void setLearningSubjects(List<Subject> learningSubjects) {
        this.learningSubjects = learningSubjects;
    }
}
