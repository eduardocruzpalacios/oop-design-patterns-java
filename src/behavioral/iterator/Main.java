package behavioral.iterator;

import behavioral.iterator.iterables.SingleLinkedList;
import behavioral.iterator.iterators.Iterator;
import behavioral.iterator.model.Node;

public class Main {

	public static void main(String[] args) {

		// SingleLinkedList test

		// nodes
		Node node1 = new Node("node1");
		Node node2 = new Node("node2");
		Node node3 = new Node("node3");
		Node node4 = new Node("node4");
		Node node5 = new Node("node5");

		// empty
		System.out.println("EMPTY");
		SingleLinkedList singleLinkedList = new SingleLinkedList();
		System.out.println(singleLinkedList);
		System.out.println(singleLinkedList.getSize());
		singleLinkedList.print();

		// push
		System.out.println("PUSH");
		singleLinkedList.push(node1);
		singleLinkedList.push(node2);
		System.out.println(singleLinkedList.getSize());
		singleLinkedList.print();

		// unshift
		System.out.println("UNSHIFT");
		singleLinkedList.unshift(node3);
		System.out.println(singleLinkedList.getSize());
		singleLinkedList.print();

		// shift
		System.out.println("SHIFT");
		singleLinkedList.shift();
		System.out.println(singleLinkedList.getSize());
		singleLinkedList.print();

		// pop
		System.out.println("POP");
		singleLinkedList.pop();
		System.out.println(singleLinkedList.getSize());
		singleLinkedList.print();

		// get(int index)
		System.out.println("GET (INDEX)");
		System.out.println(singleLinkedList.get(1));
		System.out.println(singleLinkedList.getSize());
		singleLinkedList.print();

		// setNode
		System.out.println("SET NODE");
		singleLinkedList.setNode(1, node4);
		System.out.println(singleLinkedList.getSize());
		singleLinkedList.print();

		// insert
		System.out.println("INSERT");
		singleLinkedList.insert(1, node5);
		System.out.println(singleLinkedList.getSize());
		singleLinkedList.print();

		// reverse
		System.out.println("REVERSE");
		singleLinkedList.reverse();
		System.out.println(singleLinkedList.getSize());
		singleLinkedList.print();

		// remove
		System.out.println("REMOVE");
		singleLinkedList.remove(0);
		System.out.println(singleLinkedList.getSize());
		singleLinkedList.print();

		// rotate
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

		// now, this collection is looped using the Iterator
		for (Iterator iterator = singleLinkedList.getIterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}

		/*
		 * in case a new iterable collection is added, the maintainer must do the
		 * following:
		 * 
		 * - Create the intended-collection class in iterables package. By implementing
		 * Iterable interface, the override method must return a new instance of the
		 * class below (implementing Iterator interface) receiving the own instance (see
		 * SingleLinkedList override method as an example)
		 * 
		 * - Create the corresponding iterator class, which must implement Iterator
		 * interface
		 * 
		 * Once it has been done, the client could loop an iterator for this new
		 * collection (obtained from the new intended-collection class after having
		 * implemented Iterable interface), as the iterator would have hasNext and next
		 * methods
		 */

	}

}
