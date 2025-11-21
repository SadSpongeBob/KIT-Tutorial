package tut3.exercise2.solution;

class Session {
    String sessionId;
    int capacity = 25;
    int currentAmount = 0;
    double cost = 2;
    Student[] students = new Student[capacity];

    Session(String sessionId, int capacity, double cost) {
        this.sessionId = sessionId;
        this.capacity = capacity;
        this.students = new Student[capacity];
        this.cost = cost;
    }

    Session(String sessionId, int capacity) {
        this.sessionId = sessionId;
        this.capacity = capacity;
        this.students = new Student[capacity];
    }

    Session() {
        // Default constructor
    }

    String[] getAllStudents() {
        String[] studentIds = new String[students.length];
        for (int i = 0; i < students.length; i++) {
            studentIds[i] = students[i].studentId;
        }
        return studentIds;
    }

    boolean addStudent(Student student) {
        if (currentAmount < capacity) {
            students[currentAmount] = student;
            currentAmount++;
            return true;
        }
        return false;
    }
}
