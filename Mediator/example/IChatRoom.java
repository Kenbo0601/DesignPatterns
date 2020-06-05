//Mediator interface
//
//defines the interface for communication between Colleague objects
public interface IChatRoom
{
    public void sendMessage(String msg, String userId);
    void addUser(User user);
}
