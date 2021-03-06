import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EFFY_ChatClient myChat = new EFFY_ChatClient();
        myChat.loadMessages();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("stop"))
                break;
           myChat.writeMessage(sc.nextLine());
        }
    }
}
