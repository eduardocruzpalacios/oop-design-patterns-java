package behavioral.mediator;

import java.time.LocalDate;

import behavioral.mediator.mediators.ChatRoom;
import behavioral.mediator.mediators.Mediator;
import behavioral.mediator.model.Message;
import behavioral.mediator.participants.ChatUser;
import behavioral.mediator.participants.Participant;

public class Main {

	public static void main(String[] args) {

		// a chat room is created
		Mediator chatRoom = new ChatRoom("1");

		// users are created and they join the chat room
		Participant user1 = new ChatUser(chatRoom, "Jean", 0);
		chatRoom.link(user1);

		Participant user2 = new ChatUser(chatRoom, "Michael", 1);
		chatRoom.link(user2);

		Participant user3 = new ChatUser(chatRoom, "Xavier", 2);
		chatRoom.link(user3);

		// a message is sent to the 3 participants in the chat room
		Message message1 = new Message("Hi all!", user1, LocalDate.now());
		chatRoom.notifyAll(message1);

		// a message is sent to one participant in the chat room
		Message message2 = new Message("Hi all!", user2, LocalDate.now());
		chatRoom.notifyOne(message2, user3);

		// an user exits the chat room
		chatRoom.unlink(user1);

		// a message is sent to the 2 participants in the chat room
		Message message3 = new Message("Boooo", user3, LocalDate.now());
		chatRoom.notifyAll(message3);

	}

}
