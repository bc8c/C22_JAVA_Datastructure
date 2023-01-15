package C02.S02_SinglyLinkedList;

import java.util.NoSuchElementException;

public class SList <E> {
	
	public Node head;  // 연결 리스트의 첫 노드 가리킴
	private   int  size;

	public SList(){       // 연결 리스트 생성자
		head = null;
		size = 0;
	}
	public int size() { return size; }
	public boolean isEmpty() { return size == 0; }

	public void insertFront(E newItem){ // 연결리스트 맨 앞에 새 노드 삽입
		head = new Node(newItem, head);
		size++;
	}
	
	public void insertAfter(E newItem, Node p){ // 노드 p 바로 다음에 새 노드 삽입
		p.setNext(new Node(newItem, p.getNext()));
		size++;
	}
	
	public void deleteFront(){       // 리스트의 첫 노드 삭제
		if (isEmpty()) throw new NoSuchElementException();
		head = head.getNext();
		size--;
	}
	
	public void deleteAfter(Node p){ // p가 가리키는 노드의 다음 노드를 삭제
		if (p == null) throw new NoSuchElementException();
		Node t = p.getNext();
		p.setNext(t.getNext());
		t.setNext(null);
		size--;
	}

	 public int search(E target) {   // target을 탐색  
		 Node p = head;
		 for (int  k = 0; k < size ;k++){
			 if (target == p.getItem()) return k;
			 p = p.getNext(); 
		 }
		 return -1; // 탐색을 실패한 경우 -1 리턴
	 }
	 
	public void print(){  // 연결 리스트 노드들의 항목들을 차례로 출력
		for (Node p = head; p != null; p = p.getNext()) 
			System.out.print(p.getItem()+"\t ");
		System.out.println();
	}
}