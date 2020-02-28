package recit3;

import java.util.Random;

public class SingleLinkedList {
	private static class Node{
		int item;
		Node next;
		public Node (int item) {
			this.item = item;
			next = null;
		}
	}
	private Node head;
	public SingleLinkedList() {
		head = null;
	}
	public boolean insert(int value) {
		if(head == null) {
			head = new Node(value);
			return true;
		}
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = new Node(value);
		return true;
	}
	
	public boolean find(int value) {
		if (head == null) return false;
		Node current = head;
		while(current.next != null && current.item != value) {
			current = current.next;
		}
		if (current.item == value) return true;
		else return false;
	}
	
	public boolean delete(int value) {
		if (head == null) return false;
		if (head.item == value) {
			head = head.next;
			return true;
		}
		Node current = head;
		while (current.next != null && current.next.item != value) {
			current = current.next;
		}
		if (current.next == null) return false;
		current.next = current.next.next;
		return true;
		
	}
	
	public void print() {
		if (head == null) System.out.println("");
		StringBuilder s = new StringBuilder();
		Node current = head;
		while(current.next != null) {
			s.append(current.item+"->");
			current = current.next;
		}
		s.append(current.item+"->");
		System.out.println(s.toString());
	}
	public static void main(String[] args) {
		Random r = new Random();
		SingleLinkedList l = new SingleLinkedList();
		for(int i = 0; i<8; i++) {
			l.insert(r.nextInt(20));
		}
		l.print();

		l.insert(200);
		l.print();

		System.out.println("200? "+l.find(200));
		System.out.println("500? "+l.find(500));
		l.delete(200);
		
		
		l.print();
	}
}
