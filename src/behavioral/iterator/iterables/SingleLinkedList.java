package behavioral.iterator.iterables;

import java.util.ArrayList;
import java.util.List;

import behavioral.iterator.iterators.Iterator;
import behavioral.iterator.iterators.SingleLinkedListIterator;
import behavioral.iterator.model.Node;

public class SingleLinkedList implements Iterable {

	private Node head;
	private Node tail;
	private int length;

	public SingleLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	public int getSize() {
		return this.length;
	}

	public Node push(Node node) {
		Node newNode = new Node(node);
		if (this.head == null) {
			this.head = newNode;
			this.tail = this.head;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
		this.length++;
		return newNode;
	}

	public Node pop() {
		if (this.head == null) {
			return null;
		}
		Node current = this.head;
		Node newTail = current;
		while (current.getNext() != null) {
			newTail = current;
			current = (Node) current.getNext();
		}
		this.tail = newTail;
		this.tail.setNext(null);
		this.length--;
		if (this.length == 0) {
			this.head = null;
			this.tail = null;
		}
		return current;
	}

	public Node shift() {
		if (this.head == null) {
			return null;
		}
		Node currentHead = this.head;
		this.head = (Node) currentHead.getNext();
		this.length--;
		if (this.length == 0) {
			this.tail = null;
		}
		return currentHead;
	}

	public Node unshift(Node node) {
		Node newNode = new Node(node);
		if (this.head == null) {
			this.head = newNode;
			this.tail = this.head;
		}
		newNode.setNext(this.head);
		this.head = newNode;
		this.length++;
		return newNode;
	}

	public Node get(int index) {
		if (index < 0 || index > this.length) {
			return null;
		}
		;
		int counter = 0;
		Node current = this.head;
		while (counter != index && current.getNext() != null) {
			current = (Node) current.getNext();
			counter++;
		}
		return current;
	}

	public boolean setNode(int index, Node node) {
		Node foundNode = this.get(index);
		if (foundNode != null) {
			foundNode.setVal(node);
			return true;
		}
		return false;
	}

	public boolean insert(int index, Node node) {
		if (index < 0 || index > this.length) {
			return false;
		}
		if (index == this.length) {
			this.push(node);
			return true;
		}
		if (index == 0) {
			this.unshift(node);
			return true;
		}
		Node newNode = new Node(node);
		Node prev = this.get(index - 1);
		Node temp = (Node) prev.getNext();
		prev.setNext(newNode);
		newNode.setNext(temp);
		this.length++;
		return true;
	}

	public Node remove(int index) {
		if (index < 0 || index >= this.length) {
			return null;
		}
		if (index == 0) {
			return this.shift();
		}
		;
		if (index == this.length - 1) {
			return this.pop();
		}
		Node previousNode = this.get(index - 1);
		Node removed = (Node) previousNode.getNext();
		previousNode.setNext(removed.getNext());
		this.length--;
		return removed;
	}

	public SingleLinkedList reverse() {
		Node node = this.head;
		this.head = this.tail;
		this.tail = node;
		Node next;
		Node prev = null;
		for (int i = 0; i < this.length; i++) {
			next = (Node) node.getNext();
			node.setNext(prev);
			prev = node;
			node = next;
		}
		return this;
	}

	public void print() {
		List<Node> list = new ArrayList<Node>();
		Node current = this.head;
		while (current != null) {
			list.add((Node) current.getVal());
			current = (Node) current.getNext();
		}
		System.out.println(list);
	}

	public void rotate(int toIndex) {
		if (Math.abs(toIndex) > this.length) {
			int circles = (int) Math.floor(toIndex / this.length);
			toIndex = toIndex - (this.length * circles);
		}
		if (toIndex < 0) {
			toIndex = this.length + toIndex;
		}
		if (toIndex == 0) {
			return;
		}
		Node node = this.head;
		while (toIndex > 0) {
			this.head = (Node) node.getNext();
			this.tail.setNext(node);
			this.tail = node;
			node.setNext(null);
			node = this.head;
			toIndex--;
		}
	}

	@Override
	public Iterator getIterator() {
		return new SingleLinkedListIterator(this);
	}

}
