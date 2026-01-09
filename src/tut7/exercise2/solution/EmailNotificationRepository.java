package tut7.exercise2.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class EmailNotificationRepository implements NotificationRepository {
    private List<EmailNotification> notifications = new ArrayList<>();

    EmailNotificationRepository(List<EmailNotification> notifications) {
        this.notifications = List.copyOf(notifications);
    }

    EmailNotificationRepository() {
    }

    @Override
    public boolean save(Notification notification) {
        if (notification.getClass().equals(EmailNotification.class)) {
            EmailNotification emailNotification = (EmailNotification) notification;
            return notifications.add(emailNotification);
        }
        return false;
    }

    @Override
    public Notification findByRecipient(String recipient) {
        for (Notification notification : notifications) {
            if (Objects.equals(recipient, notification.getRecipient())) {
                return notification;
            }
        }
        return null;
    }

    public Notification findByEmailRecipient(String emailRecipient) {
        for (EmailNotification notification : notifications) {
            if (Objects.equals(emailRecipient, notification.getRecipientMail())) {
                return notification;
            }
        }
        return null;
    }
}
