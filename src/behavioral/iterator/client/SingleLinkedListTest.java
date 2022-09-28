package behavioral.iterator.client;

import behavioral.iterator.concreteaggregate.SingleLinkedList;
import behavioral.iterator.model.Node;

public class SingleLinkedListTest {

	public static void main(String[] args) {

		Node node1 = new Node("node1");
		Node node2 = new Node("node2");
		Node node3 = new Node("node3");
		Node node4 = new Node("node4");
		Node node5 = new Node("node5");

		System.out.println("EMPTY");
		SingleLinkedList singleLinkedList = new SingleLinkedList();
		System.out.println(singleLinkedList);
		System.out.println(singleLinkedList.getSize());
		singleLinkedList.print();

		System.out.println("PUSH");
		singleLinkedList.push(node1);
		singleLinkedList.push(node2);
		System.out.println(singleLinkedList.getSize());
		singleLinkedList.print();

		System.out.println("UNSHIFT");
		singleLinkedList.unshift(node3);
		System.out.println(singleLinkedList.getSize());
		singleLinkedList.print();

		System.out.println("SHIFT");
		singleLinkedList.shift();
		System.out.println(singleLinkedList.getSize());
		singleLinkedList.print();

		System.out.println("POP");
		singleLinkedList.pop();
		System.out.println(singleLinkedList.getSize());
		singleLinkedList.print();

		System.out.println("GET (INDEX)");
		System.out.println(singleLinkedList.get(1));
		System.out.println(singleLinkedList.getSize());
		singleLinkedList.print();

		System.out.println("SET NODE");
		singleLinkedList.setNode(1, node4);
		System.out.println(singleLinkedList.getSize());
		singleLinkedList.print();

		System.out.println("INSERT");
		singleLinkedList.insert(1, node5);
		System.out.println(singleLinkedList.getSize());
		singleLinkedList.print();

		System.out.println("REVERSE");
		singleLinkedList.reverse();
		System.out.println(singleLinkedList.getSize());
		singleLinkedList.print();

		System.out.println("REMOVE");
		singleLinkedList.remove(0);
		System.out.println(singleLinkedList.getSize());
		singleLinkedList.print();

		System.out.println("ROTATE");
		singleLinkedList.push(node1);
		singleLinkedList.push(node2);
		singleLinkedList.push(node3);
		singleLinkedList.push(node5);
		System.out.println(singleLinkedList.getSize());
		singleLinkedList.print();
		singleLinkedList.rotate(2);
		System.out.println(singleLinkedList.getSize());
		singleLinkedList.print();

	}

}
