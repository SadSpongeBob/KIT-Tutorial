package tut6.exercise2;

import java.util.List;

abstract class Student {
    private final String name;
    private final int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract String getMajor();
    public abstract List<Module> getRequiredModules();

    public float getRequiredCredits() {
        // TODO: Implement me
        return 0;
    }

    @Override
    public String toString() {
        return id + ": " + name + " (" + getMajor() + ")";
    }
}
