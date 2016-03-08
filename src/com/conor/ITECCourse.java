package com.conor;

import java.util.ArrayList;

/**
 * Created by conor on 3/3/16.
 *
 */
public class ITECCourse {
    private String name;
    private int code;
    public ArrayList<String> students;
    private String roomNumber;
    private int maxStudents;

    public String getRoomNumber() {

        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {

        this.roomNumber = roomNumber;
    }

    public ArrayList<String> getStudents() {

        return students;
    }

    public void setStudents(ArrayList<String> students) {

        this.students = students;
    }

    //Add elements in stored in ArrayList

//    public int totalNumberStudents() {
//
//        int numberStudents = 0;
//        for(int i = 0; i < students.size(); i++) {
//             numberStudents = Integer.parseInt(students.get(i));
//        }
//        return numberStudents;
//    }




    //Constructor
    public ITECCourse(String courseName, int courseCode, int courseMaxStudents) {
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
    }

    public void addStudent(String studentName) {
        if(students.size() == maxStudents) {
            System.out.println("Course is full – can't add " + studentName);
        } else {
            students.add(studentName);
            System.out.println(studentName + " was added to " + this.name);
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
            System.out.println("Course Name: " + this.name);
            System.out.println("Course Code: " + this.code);
            System.out.println("Course room number " + this.roomNumber);
            System.out.println("Students enrolled:");
            for (String student : this.students) {
                System.out.println(student);
            }
            System.out.println("There are " + getNumberOfStudents() + " students enrolled");
            System.out.println("The max number of students for this course is " + this.maxStudents);
            System.out.println("The number of open seats in " + name + " are " + freeSpaces());
            //System.out.println("In all classes there are " + totalNumberStudents());
        }

    public int getNumberOfStudents() {
        return this.students.size();
        }

    public int freeSpaces() {
        int freeSpace = maxStudents - getNumberOfStudents();
        return freeSpace;
    }

}
