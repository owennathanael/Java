package Q1;

import java.util.Arrays;

public class Teacher extends Person {
    private int numCourse;
    private String[] courses;

    public Teacher(String name, String address) {
        super(name, address);
        numCourse = 0;
        courses = new String[5];
    }

    @Override
    public String toString() {
        return "Teacher: " + getName() + ", <" + getAddress() + ">";
    }

    public boolean addCourse(String course) {
        for (int i = 0; i < numCourse; i++) {
            if (courses[i].equals(course))
            {
                return false;
            }
        }
        courses[numCourse] = course;
        numCourse++;
        return true;
    }

    public boolean removeCourse(String course) {
        int indLocation = 0;
        for (int i = 0; i < courses.length - 1; i++) {
            if (courses[i].equals(course)) {
                indLocation = i;
                break;
            }
        }
        if (indLocation == courses.length - 1)
        {
            return false;
        }
        else
        {
            for (int i = indLocation + 1; i < courses.length - 1; i++)
            {
                courses[i] = courses[i++];
            }
        }
        numCourse--;
        return true;
    }
}