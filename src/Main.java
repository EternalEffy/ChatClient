import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        EFFY_ChatClient myChat = new EFFY_ChatClient();
        myChat.loadMessages();
        myChat.writeMessage(new Scanner(System.in).nextLine());
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myChat.writeMessage("Hi)");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myChat.writeMessage(new Scanner(System.in).nextLine());
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myChat.writeMessage("im fine");

    }
}
