# Task Description

Given the interfaces [Notification](Notification.java) and 
[NotificationRepository](NotificationRepository.java) model the classes
`EmailNotification` and `EmailNotificationRepository`

```java
import javax.management.Notification;

class EmailNotification implements Notification {
    @Override
    public String getRecipient() {
        // TODO: Implement me
    }

    @Override
    public String getMessage() {
        // TODO: Implement me
    }

    public String getEmailRecipient() {
        // TODO: Implement me
    }
}

class EmailNotificationRepository implements NotificationRepository {
    @Override
    public boolean save(Notification notification) {
        // TODO: Implement me
    }

    @Override
    public Notification findByRecipient(String recipient) {
        // TODO: Implement me
    }

    public Notification findByEmailRecipient(String emailRecipient) {
        // TODO: Implement me
    }
}
```
