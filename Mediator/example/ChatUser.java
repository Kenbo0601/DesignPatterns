//Concrete Colleagues
//
//implements the Colleague interface and communicates with other COlleagues through itd Mediator
public class ChatUser extends User
{
    public ChatUser(IChatRoom room, String id, String name){
        super(room,id,name);
    }

    public void send(String msg, String userId) {
        System.out.println(this.getName() + " :: Sending Message : " + msg);
        getMediator().sendMessage(msg,userId);
    }

    public void receive(String msg) {
        System.out.println(this.getName() + " :: Received Message : " + msg);
    }
}
