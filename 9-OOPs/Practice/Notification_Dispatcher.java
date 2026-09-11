package Practice;

interface Notification {
    public void send(String message);
}

class Email implements Notification {

    public void send(String message) {
        System.out.printf("Sending Email: %s\n", message);
    }
}

class SMS implements Notification {
    public void send(String message) {
        System.out.printf("Sending SMS: %s\n", message);
    }
}

public class Notification_Dispatcher {
    public static void main(String[] args) {
        Email e1 = new Email();
        SMS s1 = new SMS();

        e1.send("Hello");
        s1.send("Boy");
    }
}
