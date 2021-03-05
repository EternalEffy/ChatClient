public class Main {
    public static void main(String[] args) {
        EFFY_ChatClient myChat = new EFFY_ChatClient();

        System.out.println(myChat.readMessage());
        myChat.writeMessage("Hello");
        System.out.println(myChat.readMessage());
    }
}
