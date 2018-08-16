package models;

import javax.persistence.*;

@Entity
@Table(name="students")
public class Student {

    private int enrolment_no;
    private String firstname;
    private String lastname;
    private int age;
    private Course course;

    public Student (){

    }

    public Student(String firstname, String lastname, int age, Course course) {

        this.enrolment_no = enrolment_no;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.course = course;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="enrolment_no")
    public int getEnrolment_no() {
        return enrolment_no;
    }
    public void setEnrolment_no(int enrolment_no) {
        this.enrolment_no = enrolment_no;
    }

    @Column(name="first_name")
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Column(name="last_name")
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Column(name="age")
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @ManyToOne
    @JoinColumn(name="course_id", nullable = false)
    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
}
