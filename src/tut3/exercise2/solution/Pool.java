package tut3.exercise2.solution;

class Pool {
    Session[] sessions;

    Session getSession(String sessionId) {
        if (sessionId == null) {
            return null;
        }

        for (Session session : sessions) {
            if (sessionId.equals(session.sessionId)) {
                return session;
            }
        }
        return null;
    }

    boolean bookSession(String sessionId, Student student) {
        Session session = getSession(sessionId);
        if (session == null) {
            return false;
        }

        if (session.cost <= student.cashAmount) {
            boolean success = session.addStudent(student);
            if (success) {
                student.cashAmount -= session.cost;
                return true;
            }
        }
        return false;
    }
}
