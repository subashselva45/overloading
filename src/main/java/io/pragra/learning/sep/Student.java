package io.pragra.learning.sep;

public class Student {
   private String name;
    private int studentId;
    private String course;
    private double feepaid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        if(studentId<0){
            System.out.println("enter correct Id");
            return;
        }
        this.studentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getFeepaid() {
        return feepaid;
    }

    public void setFeepaid(int feepaid) {
        this.feepaid = feepaid;
    }
    public void printDetails(){
        System.out.println(this.name);
        System.out.println(this.studentId);
        System.out.println(this.course);
        System.out.println(this.feepaid);
    }
}
