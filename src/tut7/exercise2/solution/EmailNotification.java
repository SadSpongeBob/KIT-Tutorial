package tut7.exercise2.solution;

class EmailNotification implements Notification {
    private final String recipient;
    private final String message;
    private final String recipientMail;

    public EmailNotification(String recipient, String message, String recipientMail) {
        this.recipient = recipient;
        this.message = message;
        this.recipientMail = recipientMail;
    }

    @Override
    public String getRecipient() {
        return recipient;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public String getRecipientMail() {
        return recipientMail;
    }
}
