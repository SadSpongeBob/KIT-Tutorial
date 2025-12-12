package tut6.exercise2.solution;

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
        float sum = 0;
        for (Module module : getRequiredModules()) {
            sum += module.getCredits();
        }
        return sum;
    }

    @Override
    public String toString() {
        return id + ": " + name + " (" + getMajor() + ")";
    }
}
