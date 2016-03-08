package com.conor;

public class ITECCourseManager {

    public static void main(String[] args) {

        //Instantiate object from ITECCourse
        ITECCourse maintenanceCourse =
                new ITECCourse("Microcomputer Systems Maintenance", 1310, 20);

//Add some students
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        maintenanceCourse.removeStudent("Carl");
        maintenanceCourse.writeCourseInfo();

        ITECCourse datacomCourse =
                new ITECCourse("Data Communications", 1425, 30);

//Add some students
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        //Call method to print out data
        datacomCourse.writeCourseInfo();

        ITECCourse JavaProgramming = new ITECCourse("Java Programming", 2545, 24);
        JavaProgramming.addStudent("Gus");
        JavaProgramming.addStudent("Harry");
        JavaProgramming.addStudent("Izzy");

        JavaProgramming.writeCourseInfo();

        ITECCourse smallCourse = new ITECCourse("Small Course", 1111, 3);
        smallCourse.addStudent("Jake");
        smallCourse.addStudent("Kirby");
        smallCourse.addStudent("Liam");
        smallCourse.addStudent("Marigold"); //Should not work as only 3 students can be in a course

        smallCourse.writeCourseInfo();

        //New object for room number

        ITECCourse InfoTec = new ITECCourse("Info Tech Concepts", 1100, 30);

        InfoTec.addStudent("Max");
        InfoTec.addStudent("Nancy");
        InfoTec.addStudent("Orson");
        InfoTec.setRoomNumber("T3050"); //Set room number from Class

        InfoTec.writeCourseInfo();


        //InfoTec.totalNumberStudents();

        //Adding the sum of ITECCourse objects
        int sum = maintenanceCourse.getNumberOfStudents() + datacomCourse.getNumberOfStudents() +
                smallCourse.getNumberOfStudents() + InfoTec.getNumberOfStudents();
        System.out.println("The total number of students in all classes is : " + sum);


    }
}
