package behavioral.iterator.concreteiterator;

import behavioral.iterator.concreteaggregate.SingleLinkedList;
import behavioral.iterator.iterator.Iterator;

public class SingleLinkedListIterator implements Iterator {

	private SingleLinkedList singleLinkedList;

	private int currentIndex = 0;

	public SingleLinkedListIterator(SingleLinkedList singleLinkedList) {
		this.singleLinkedList = singleLinkedList;
	}

	@Override
	public boolean hasNext() {
		if (this.currentIndex < singleLinkedList.getSize()) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		if (this.hasNext()) {
			return singleLinkedList.get(currentIndex++);
		}
		return null;
	}

}
