package com.example.jcrudfirebase;

public class Mainmodel {


    String course, email, name, turl;

    Mainmodel()
    {

    }
    public Mainmodel(String course, String email, String name, String turl) {
        this.course = course;
        this.email = email;
        this.name = name;
        this.turl = turl;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTurl() {
        return turl;
    }

    public void setTurl(String turl) {
        this.turl = turl;
    }
}
