package cr.ac.tec.util;

import java.util.NoSuchElementException;

public class IntLinkedList {


	public Node head;
	public Node tail;
	public int size;

	public IntLinkedList() {
		size = 0;
	}

	public class Node {
		public int element;
		public Node next;
		public Node prev;

		public Node(int element, Node next, Node prev) {
			this.element = element;
			this.next = next;
			this.prev = prev;
		}
	}

	public int size() { return size; }

	public boolean isEmpty() { return size == 0; }


	public String toString(Node first) {
		String str = "[";
		while (first.prev != null) {
			first = first.prev;
		}
		while (first != null) {
			str += Integer.toString(first.element);
			first = first.next;
			if (!(first == null)) {
				str += ", ";
			}
		}
		str += "]";
		return str;
	}

	public void printSortedList(Node first) {
		while (first != null) {
			System.out.print(first.element + " ");
			first = first.next;
		}
	}

	public void addFirst(int element) {
		if (head != null) {
			Node tmp = head;
			head = new Node(element, tmp, null);
			head.next = tmp;
			if (tail == null) {
				tail = new Node(head.next.element, null, head);
			}
		} else {
			head = new Node(element, null, null);
		}
		size++;
	}

	public void addLast(int element) {
		if (!(head == null)) {
			Node tmp = tail;
			tail = new Node(element, null, tmp);
			head.prev = tmp;
		} else {
			head = new Node(element, null, null);
		}
		size++;
	}

	public void iterateForward(){

		Node tmp = head;
		while(tmp != null){
			tmp = tmp.next;
		}
	}

	public void iterateBackward(){

		Node tmp = tail;
		while(tmp != null){
			tmp = tmp.prev;
		}
	}

	public int removeFirst() {
		if (size == 0) throw new NoSuchElementException();
		Node tmp = head;
		head = head.next;
		head.prev = null;
		size--;
		return tmp.element;
	}

	public int removeLast() {
		if (size == 0) throw new NoSuchElementException();
		Node tmp = tail;
		tail = tail.prev;
		tail.next = null;
		size--;
		return tmp.element;
	}

	public Node findFirst() {
		Node tmp = head;
		while (tmp.prev != null) {
			tmp = tmp.prev;
		}
		return tmp;
	}

	public Node findLast() {
		Node tmp = head;
		while (tmp.next != null) {
			tmp = tmp.next;
		}
		return tmp;
	}

	public Node findSmallest() {
		Node smallest = head;
		while (head.next != null) {
			if ((smallest.next).element < smallest.element) {
				smallest = smallest.next;
			}
		}
		return smallest;
	}

	public Node findBiggest() {
		Node biggest = head;
		while (head.next != null) {
			if (biggest.next.element > biggest.element) {
				biggest = biggest.next;
			}
		}
		return biggest;
	}

	public Node find(int numToFind) {
		Node num = head;
		while (head.next != null) {
			if (num.next.element == numToFind) {
				num = num.next;
				break;
			} else {
				num = num.next;
			}
		}
		return num;
	}

	public void swap(Node x, Node y) {
		int element = x.element;
		x.element = y.element;
		y.element = element;
	}
}
