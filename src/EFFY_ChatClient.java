import org.json.JSONObject;

import java.util.Timer;
import java.util.TimerTask;

public class EFFY_ChatClient {
     private final String listName = "Диалог";
     private final String fileName = "test.json";
     private DataJson myData = new DataJson(listName);
     private JSONObject json;


     public EFFY_ChatClient(){
          myData.loadJSON(fileName);
          json = myData.getJson();
     }

     public void writeMessage(String str){
          json.getJSONArray(listName).put(json.getJSONArray(listName).length(),new JSONObject(new Message(str).toString()));
          myData.saveJSON(json,fileName);
     }

     public String readMessage(){
          return json.getJSONArray(listName).toString();
     }


     public void loadMessages(){
          new java.util.Timer().schedule(
                  new TimerTask() {
                       public void run() {
                            myData.loadJSON(fileName);
                            System.out.println(readMessage());
                       }
                  },
                  0,1000*5 );
     }


}
