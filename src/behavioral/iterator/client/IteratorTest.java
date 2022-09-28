package behavioral.iterator.client;

import behavioral.iterator.concreteaggregate.SingleLinkedList;
import behavioral.iterator.iterator.Iterator;
import behavioral.iterator.model.Node;

public class IteratorTest {

	public static void main(String[] args) {

		Node node1 = new Node("node1");
		Node node2 = new Node("node2");
		Node node3 = new Node("node3");

		SingleLinkedList singleLinkedList = new SingleLinkedList();

		singleLinkedList.push(node1);
		singleLinkedList.push(node2);
		singleLinkedList.push(node3);

		for (Iterator iterator = singleLinkedList.getIterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}

	}

}
