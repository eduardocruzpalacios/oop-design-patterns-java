package behavioral.mediator;

import java.time.LocalDateTime;

import behavioral.mediator.colleagueclass.Participant;
import behavioral.mediator.concretecolleagueclass.ChatUser;
import behavioral.mediator.concretemediator.ChatRoom;
import behavioral.mediator.mediator.Mediator;
import behavioral.mediator.model.Message;

public class Main {

	public static void main(String[] args) {

		Mediator chatRoom = new ChatRoom("1");

		Participant user1 = new ChatUser(chatRoom, "Jean", 0);
		Participant user2 = new ChatUser(chatRoom, "Michael", 1);
		Participant user3 = new ChatUser(chatRoom, "Xavier", 2);

		Message message1 = new Message("Hi all!", user1, LocalDateTime.now());
		user1.operateAll(message1);

		Message message2 = new Message("Hi all!", user2, LocalDateTime.now());
		user2.operateOne(message2, user3);

		user1.disconnect();

		Message message3 = new Message("Boooo", user3, LocalDateTime.now());
		user3.operateAll(message3);

	}

}
