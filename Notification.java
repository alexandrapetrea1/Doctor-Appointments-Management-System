import java.time.LocalDateTime;

public class Notification {
    private String notificationType;
    private LocalDateTime notificationDate;
    private Person recipient;

    public Notification(String notificationType, LocalDateTime notificationDate, Person recipient) {
        this.notificationType = notificationType;
        this.notificationDate = notificationDate;
        this.recipient = recipient;
    }

    public String getNotificationType(){
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public LocalDateTime getNotificationDate(){
        return notificationDate;
    }

    public void setNotificationDate(LocalDateTime notificationDate) {
        this.notificationDate = notificationDate;
    }

    public Person getRecipient() {
        return recipient;
    }

    public void setRecipient(Person recipient) {
        this.recipient = recipient;
    }

    @Override
    public String toString() {
        return "Notification [Type: " + notificationType + ", Date: " + notificationDate +
                ", Recipient: " + recipient.getFirstName() + " " + recipient.getLastName() + "]";
    }
}