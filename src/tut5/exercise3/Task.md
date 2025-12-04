# Task Description

Revisiting the swimming pool system:
- Pool will hold information on each swimming session
- Each session has a capacity of 25 students

Implement the system from [`T3.2`](/tut3/exercise2/Task.md) using `Lists`:
- `Pool::addSession` should add a new session to the pool
- `Pool::getSession` should return the session with passed 
`sessionId`, `null` otherwise
- `Pool::clearSessions` should clear the session information of pool


- `Session::getAllStudents` should return a `List` of the students registered
to that session
- `Session::addStudent` should, if there is enough place, add a student
to that session
