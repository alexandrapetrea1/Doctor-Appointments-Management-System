public class Notification {
    private String notificationType;
    private String notificationDate;
    private Person recipient;

    public Notification(String notificationType, String notificationDate, Person recipient) {
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

    public String getNotificationDate(){
        return notificationDate;
    }

    public void setNotificationDate(String notificationDate) {
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
