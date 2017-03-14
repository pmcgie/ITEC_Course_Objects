package com.Paul_McGie;

import java.util.ArrayList;

/**
 * Created by pmcgie on 3/14/2017.
 */
public class ITECCourseManager {

    public static void main(String args[]) {

        //Add Java Course - Example commented out
        ITECCourse JavaCourse = new ITECCourse("Java","T-3010",
                2545,30);

        ArrayList<ITECCourse> CourseCollection = new ArrayList<>();

        CourseCollection.add(JavaCourse);

        //Add some students
        JavaCourse.addStudent("Todd");
        JavaCourse.addStudent("Diana");
        JavaCourse.addStudent("Billy");
        JavaCourse.addStudent("Lucy");

        //Add course per lab (Info Tech Concepts)
        ITECCourse TechConcepts = new ITECCourse("Info Tech Concepts","T-3050",
                1100,30);

        TechConcepts.addStudent("Max");
        TechConcepts.addStudent("Nancy");
        TechConcepts.addStudent("Orson");

        CourseCollection.add(TechConcepts);

        for (ITECCourse course:CourseCollection) {
            System.out.println("Course: " + course.getName());
            System.out.println("Open Spots: " + course.Free_Spaces());
        }

    }

}
