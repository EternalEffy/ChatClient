import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        EFFY_ChatClient myChat = new EFFY_ChatClient();
        myChat.writeMessage("WTF");
        System.out.println(myChat.readMessage());
    }
}
