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
		user1.operateAll(message1);

		// a message is sent to one participant in the chat room
		Message message2 = new Message("Hi all!", user2, LocalDate.now());
		user2.operateOne(message2, user3);

		// an user exits the chat room
		chatRoom.unlink(user1);

		// a message is sent to the 2 participants in the chat room
		Message message3 = new Message("Boooo", user3, LocalDate.now());
		user3.operateAll(message3);

		/*
		 * in case a new concrete participant is needed, the maintainer must:
		 * 
		 * - create the class in participants package implementing Participant
		 * interface. Doing so, current concrete mediator could work with it
		 * 
		 * in case a new concrete mediator is needed, the maintainer must:
		 * 
		 * - create the class in mediators package implementing Mediator interface.
		 * Doing so, this could work with current concrete participants
		 */

		/*
		 * Note to improve:
		 * 
		 * - the linking of concrete participant and concrete mediator could be done in
		 * the initialization of the former
		 */

	}

}
