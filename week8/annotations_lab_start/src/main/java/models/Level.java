package models;

public enum Level {

    BENG("Bachelor of Engineering"),
    BA("Bachelor of Arts"),
    BSC("Bachelor of Science");

    private String coursename;

    Level(String coursename) {
        this.coursename = coursename;
    }

    public String getCoursename() {
        return coursename;
    }



}
