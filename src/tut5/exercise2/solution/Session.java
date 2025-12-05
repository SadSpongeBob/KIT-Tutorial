package tut5.exercise2.solution;

import java.util.ArrayList;
import java.util.List;

class Session {
    private String sessionId;
    private int capacity = 25;
    private List<Student> students = new ArrayList<>();

    public List<Student> getAllStudents() {
        return List.copyOf(students);
    }

    public boolean addStudent(Student student) {
        if (students.size() >= capacity) {
            return false;
        }
        return students.add(student);
    }

    public String getSessionId() {
        return sessionId;
    }
}
