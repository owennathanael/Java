package Q1;

import java.util.Arrays;

class Student extends Person
{
    private int numCourse;
    private String[] courses;
    private int[] grades;
    public Student(String name, String address)
    {
        numCourse = 0;
        super(name, address);
        courses = new String[5];
        grades = new int[5];
    }
    public double getAverageGrade()
    {
        int total=0;
        for(int grade:grades)
        {
            total+=grade;
        }
        return total/numCourse;
    }
    @Override
    public String toString() 
    {
        return "Student: "+getName()+"<"+getAddress()+"> "+ Arrays.toString(courses)+" "+Arrays.toString(grades)+"";
    }
    public void addCourseGrade(String course, int grade)
    {
        grades[numCourse]=grade;
        courses[numCourse]=course;
        numCourse++;
    }
    public void printGrades()
    {
        System.out.println(this);
        for (int i=0;i<courses.length-1;i++)
        {
            System.out.println("course: "+courses[i]+" grade: "+grades[i]);
        }
    }
}