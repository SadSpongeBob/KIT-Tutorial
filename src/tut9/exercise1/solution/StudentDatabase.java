package tut9.exercise1.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class StudentDatabase {
    private final Map<String, Student> students = new HashMap<>();

    public Optional<Student> getStudent(String id) {
        Student student = students.get(id);
        if (student == null) {
            return Optional.empty();
        }
        return Optional.of(student);
    }

    public boolean addStudent(Student student) {
        String id = student.getId();

        if (students.containsKey(id)) {
            return false;
        }
        students.put(id, student);
        return true;
    }
}
