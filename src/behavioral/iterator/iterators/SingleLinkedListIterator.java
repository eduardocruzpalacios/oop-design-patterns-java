package behavioral.iterator.iterators;

import behavioral.iterator.iterables.SingleLinkedList;

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
