package tut9.exercise1;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

class Module {
    private final String id;
    private final String name;
    private int enrollmentAmount = 0;
    private Set<String> enrolledStudentIds = new HashSet<>();

    public Module(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public boolean enrollStudent(Student student) {
        // TODO: Implement me
        return false;
    }

    public String getId() {
        return id;
    }
}
