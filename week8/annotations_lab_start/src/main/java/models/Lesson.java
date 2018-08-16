package models;

import sun.util.calendar.LocalGregorianCalendar;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

public class Lesson {

    private int id;
    private String title;
    private int classoom_no;
    private Calendar date;
    private Course course;

    public Lesson(){

    }

    public Lesson(String title, int classoom_no, Calendar date, Course course) {
        this.id = id;
        this.title = title;
        this.classoom_no = classoom_no;
        this.date = date;
        this.course = course;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name= "title")
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name= "classroom_no")
    public int getClassoom_no() {
        return classoom_no;
    }
    public void setClassoom_no(int classoom_no) {
        this.classoom_no = classoom_no;
    }

    @Column(name= "date")
    public Calendar getDate() {
        return date;
    }
    public void setDate(Calendar date) {
        this.date = date;
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
