package tut5.exercise2.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Pool {
    private final List<Session> sessions = new ArrayList<>();

    public boolean addSession(Session session) {
        return sessions.add(session);
    }

    public Session getSession(String sessionId) {
        if (sessionId == null) {
            return null;
        }

        for (Session session : sessions) {
            if (Objects.equals(session.getSessionId(), sessionId)) {
                return session;
            }
        }
        return null;
    }

    public void clearSessions() {
        sessions.clear();
    }
}
