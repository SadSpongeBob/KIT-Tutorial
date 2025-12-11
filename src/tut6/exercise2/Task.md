# Task Description

Implement a `CsStudent` class which extends the `Student` class. Under
`Student` class also implement the missing method `getRequiredCredits`.

````java
class CsStudent {
    // TODO: Implement me
}

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
    }

    @Override
    public String toString() {
        return id + ": " + name + " (" + getMajor() + ")";
    }
}
````

- `getRequiredCredits()` should return the sum of credits
gained from the modules of student
- `getRequiredModules()` should return the 
following for a `CsStudent`:
  - `ModuleProgramming`
  - `ModuleGBI`
  - `ModuleAlgebra`
