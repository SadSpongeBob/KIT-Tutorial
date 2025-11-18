# Task Definition

```java
class Pool {
    Session[] sessions;
    
    // TODO: Implement me
}

class Session {
    String sessionId;
    int capacity = 25;
    int currentAmount = 0;
    double cost = 2;
    Student[] students = new Student[capacity];
    
    // TODO: Implement me
}

class Student {
    String studentId;
    String name;
    double cashAmount;
}
```

There is a swimming pool system:
- Pool will hold information on each swimming session
- Each session has a capacity of 25 students
- Each session will cost 2€
- Each student has an amount of cash

Implement:
- Three constructor methods for sessions:
  - Takes `sessionId` and `capacity`
  - Takes `sessionId`, `capacity` and `cost`
  - Default constructor
- `getAllStudents`: Returns all of the `studentIds` in a session
- `addStudent`: Adds a student to session if session is not full,
otherwise returns `false`
- `getSession`: Returns the session that matches the passed `sessionId`,
returns `null` if no such session available


- `bookSession`: 
  - Student can book a session using the `sessionId`
  - Student pays the `cost` of that session, if he doesn't have enough
  he can't book
  - If the booking fails, returns `false`
