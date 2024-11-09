package src.Model;

import java.time.LocalDateTime;

public class Notification {
    private String notificationType;
    private LocalDateTime notificationDate;
    private src.Model.Person recipient;

    public Notification(String notificationType, LocalDateTime notificationDate, src.Model.Person recipient) {
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

    public src.Model.Person getRecipient() {
        return recipient;
    }

    public void setRecipient(src.Model.Person recipient) {
        this.recipient = recipient;
    }

    @Override
    public String toString() {
        return "src.model.Notification [Type: " + notificationType + ", Date: " + notificationDate +
                ", Recipient: " + recipient.getFirstName() + " " + recipient.getLastName() + "]";
    }
}
