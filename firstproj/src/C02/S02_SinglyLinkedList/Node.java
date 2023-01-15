package C02.S02_SinglyLinkedList;

public class Node  <E>{
	private E    item;
	private Node next;
	
	public Node(E newItem, Node<E> p){ // 생성자
		item  = newItem;
		next  = p;
	}
	// get 메소드와 set 메소드
	public E    getItem() { return item;}
    public Node getNext() { return next;}
    public void setItem(E newItem)  { item = newItem;}
    public void setNext(Node n) 	{ next = n;}
}
