package behavioral.iterator.model;

public class Node {

	private Object val;
	private Object next;

	public Node(Object val) {
		this.val = val;
		this.next = null;
	}

	public Object getVal() {
		return this.val;
	}

	public void setVal(Object val) {
		this.val = val;
	}

	public Object getNext() {
		return this.next;
	}

	public void setNext(Object next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [val=" + val + ", next=" + next + "]";
	}

}
