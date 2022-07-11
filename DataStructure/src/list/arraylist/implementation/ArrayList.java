package list.arraylist.implementation;

public class ArrayList {
	// 몇개의 데이터가 리스트에 들어오는가.
	private int size = 0;
	// 배열로 ArrayList 만들기
	private Object[] elementData = new Object[100];
	
	public boolean addLast(Object element) {
		elementData[size] = element;
		size++;
		return true;
	}
	
	public void addFirst (Object element) {
		add(0, element);
	}
	
	public void add(int index, Object element) {
		
		for (int i = size - 1; index <= i; i--) {
			elementData[i + 1] = elementData[i];
		}
		elementData[index] = element;
		size++;
	}
	
	public String toString() {
		String str = "[";
		for (int i = 0; i < size; i++) {
			str += elementData[i];
			if (i < size - 1) {
				str += ",";
			}
		}
		str += "]";
		
		return str;
	}

	public Object remove(int index) {
		Object removed = elementData[index];
		for(int i = index + 1; i <= size - 1; i++) {
			elementData[i-1] = elementData[i];
		}
		size--;
		elementData[size] = null;
		return removed;
	}
	
	public Object removeFirst() {
		return remove(0);
	}
	
	public Object removeLast() {
		return remove(size-1);
	}
	
	public Object get(int index) {
		return elementData[index];
	}
	public int size() {
		return size;
	}
	public int indexOf(Object index) {
		for(int i = 0; i < size; i++) {
			if (index == elementData[i]) {
				return i;
			}
		}
		return -1;
	}
	public ListIterator listIterator() {
		return new ListIterator();
	}
	
	class ListIterator {
		private int nextIndex = 0;
		
		public boolean hasNext() {
			return nextIndex < size();
		}
		
		public Object next() {
			return elementData[nextIndex++];
			
		}
	}
}
