//Concrete Mediator
//
//implements the Mediator interface and coordinates communication between Colleague objects.
//It is aware of all of the Colleagues and thier purposes with regards to inter-communication
import java.util.*;

public class ChatRoom implements IChatRoom
{
    private Map<String, User> usersMap = new HashMap<>();
    public void sendMessage(String msg, String userId)
    {
        User u = usersMap.get(userId);
        u.receive(msg);
    }
    public void addUser(User user) 
    {
        this.usersMap.put(user.getId(),user);
    }
}
