package tut7.exercise2.solution;

interface NotificationRepository {
    public boolean save(Notification notification);
    public Notification findByRecipient(String recipient);
}
