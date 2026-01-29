package org.example;

// Student er en DBO (DataBærende Objekt)

public class Student {
    private int id;
    private String lastName, firstName;
    private int semesterNo;

    public Student(String lastName, String firstName, int semesterNo) {
        this(0, lastName, firstName, semesterNo);
    }

    public Student(int id, String lastName, String firstName, int semesterNo) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.semesterNo = semesterNo;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getSemesterNo() {
        return this.semesterNo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "[Student: id=" + id +
                ", lastName=" + lastName +
                ", firstName=" + firstName +
                ", semesterNo=" + semesterNo + "]";
    }
}

