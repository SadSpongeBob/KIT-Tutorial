# Task Description

Given the following classes:

```java
class CampusSystem {
    private StudentDatabase studentDatabase;
    private Set<Module> modules;

    public CampusSystem(StudentDatabase studentDatabase, Set<Module> modules) {
        this.studentDatabase = studentDatabase;
        this.modules = modules;
    }

    public Optional<Module> findModuleById(String moduleId) {
        // TODO: Implement me
    }
}
```

```java
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
    }

    public String getId() {
        return id;
    }
}
```

```java
class StudentDatabase {
    private final Map<String, Student> students = new HashMap<>();

    public Optional<Student> getStudent(String id) {
        // TODO: Implement me
        return Optional.empty();
    }

    public boolean addStudent(Student student) {
        // TODO: Implement me
        return false;
    }
}
```

Implement the methods:
- `Module#enrollStudent`
  - Should prevent duplication and in that case return `false`
- `StudentDatabase#getStudent`
  - Should return the `Student` with provided id
  - If not present should return `Optional#empty`
- `StudentDatabase#addStudent`
  - Should also prevent duplication and in that case return `false`
- `CampusSystem#findByModuleId`
  - Should return the `Module` with provided id
  - If not present should return `Optional#empty`
