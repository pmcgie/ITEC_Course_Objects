package com.Paul_McGie;

import java.util.ArrayList;

public class ITECCourse {

    //Variables should be private
    private String name;
    private String room;
    private int code;
    private ArrayList<String> students;
    private int maxStudents;

    //Constructor
    public ITECCourse(String courseName, String courseRoom, int courseCode, int courseMaxStudents) {
        this.name = courseName;
        this.room = courseRoom;
        this.code = courseCode;
        this.students = new ArrayList<String>(); //Set up the students list
        this.maxStudents = courseMaxStudents;
    }

    public void addStudent(String studentName) {
        //No need to create ArrayList, the constructor has already done it
        if (students.size() == maxStudents) {
            System.out.println("Course is full - can't add " + studentName);
        } else {
            students.add(studentName);
        }
    }

    public void removeStudent(String studentName) {
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " was un-enrolled from " + this.name);
        } else {
            System.out.println(studentName + " was not found in " + this.name);
        }
    }

    public void writeCourseInfo() {
        System.out.println("Course name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Course Room: " + room);
        System.out.println("Students enrolled: ");
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students for this course is " + maxStudents);
        System.out.println("The number of spots left in the class is " + Free_Spaces());
    }


    public int getNumberOfStudents() {
        return this.students.size();
    }

    public int Free_Spaces() {
        int Class_Size = getNumberOfStudents();

        int free_spaces = this.maxStudents - Class_Size;

        return free_spaces;
    }


    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }
}
