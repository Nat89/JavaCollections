import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class MessegeController {
    public Deque<Message> messages = new ArrayDeque<>();

        public void addMessage(String content, String author){
            Message m = new Message(content, author);
            messages.addFirst(m);
            System.out.println("Dodano wiadomości");
        }
        public void getMessage(){
            System.out.println(messages.getLast());
        }
        public void deleteMessage(){
            messages.removeLast();
        }
        public int getSize(){
            return messages.size();
        }
    }