
import C01.S03_Class.AttendanceBook;
import C01.S04_GenericClass.DynamicAttendanceBook;
import C02.S01_ArrList.ArrList;
import C02.S02_SinglyLinkedList.SList;
import C02.S03_ArrayStack.ArrayStack;
import C02.S04_ArrayQueue.ArrayQueue;
import C03.S01_BinaryTree.BinaryTree;
import C03.S01_BinaryTree.Node;
import C03.S02_BinarySearchTree.BinarySearchTree;
import C03.S03_AVLTree.AVL;
import C04.S01_Probing.DoubleHashing;
import C04.S01_Probing.LinearProbing;
import C04.S01_Probing.QuadProbing;
import C04.S01_Probing.RandProbing;

public class App {
    public static void main(String[] args) throws Exception {
        // testAttendanceBook();
        // testDynamicAttendanceBook();
        // testArrList();
        // testSinglylinkedList();
        // testArrayStack();
        // testArrayQueue();
        // testBinaryTree();
        // testBinarySearchTree();
        // testAVLTree();
        testLinearProbing();
        testQuadProving();
        testRandProving();
        testDoubleHashing();
    }

    static void testAttendanceBook() {
        AttendanceBook ab = new AttendanceBook(6);

        ab.insertStudent("홍길동");
        ab.insertStudent("김친구");
        ab.insertStudent("박감사");
        ab.insertStudent("이소리");
        ab.insertStudent("김둥실");
        ab.insertStudent("최자바");

        ab.printStudent();
        // ab.deleteStudnet(4);
        ab.deleteStudnet("박감사");
        ab.printStudent();
        System.out.println(ab.count);        
    }

    static void testDynamicAttendanceBook() {
        DynamicAttendanceBook<String> ab1 = new DynamicAttendanceBook<String>(6);
        ab1.insertStudent("홍길동");
        ab1.insertStudent("김친구");
        ab1.insertStudent("박감사");
        ab1.insertStudent("이소리");
        ab1.insertStudent("김둥실");
        ab1.insertStudent("최자바");

        ab1.printStudent();
        System.out.println("---------------------------------------------");
        ab1.deleteStudnet("박감사");
        ab1.printStudent();

        DynamicAttendanceBook<Integer> ab2 = new DynamicAttendanceBook<Integer>(6);
        ab2.insertStudent(85);
        ab2.insertStudent(97);
        ab2.insertStudent(65);
        ab2.printStudent();
        System.out.println("---------------------------------------------");
        Integer i = Integer.valueOf(97);
        ab2.deleteStudnet(i);
        ab2.printStudent();
    }

    static void testArrList(){
		ArrList<String> s = new ArrList<String>();
		s.insertLast("apple");	s.print(); 	s.insertLast("orange"); s.print();
		s.insertLast("cherry");	s.print(); 	s.insertLast("pear");   s.print();
		s.insert("grape",1); 	s.print();	s.insert("lemon",4); 	s.print();
		s.insertLast("kiwi"); 	s.print();		
		s.delete(4); s.print();	s.delete(0); s.print();
		s.delete(0); s.print();	s.delete(3); s.print();
		s.delete(0); s.print();
		
		System.out.println("1번쨰 항목은 "+s.peek(1)+"이다."); System.out.println();
    }

    static void testSinglylinkedList(){
        SList<String> s = new SList<String>();
        s.insertFront("orange"); s.insertFront("apple");
		s.insertAfter("cherry",s.head.getNext()); 
		s.insertFront("pear"); 			
		s.print();
		System.out.println(": s의 길이 = "+s.size()+"\n"); 
		System.out.println("체리가 \t"+s.search("cherry")+"번째에 있다.");
		System.out.println("키위가 \t"+s.search("kiwi")+"번째에 있다.\n");
		s.deleteAfter(s.head);
		s.print(); 
		System.out.println(": s의 길이 = "+s.size());System.out.println();
		s.deleteFront();
		s.print(); 
		System.out.println(": s의 길이 = "+s.size());System.out.println();
		
		SList<Integer> t = new SList<Integer>();
		t.insertFront(500); t.insertFront(200);	
		t.insertAfter(400,t.head); 
		t.insertFront(100); 
		t.insertAfter(300,t.head.getNext()); 
		t.print();
        System.out.println(": t의 길이 = "+t.size());
    }

    static void testArrayStack(){
        ArrayStack<String> stack = new ArrayStack<String>();
        //	stack.peek();
        stack.push("apple");
        stack.push("orange");
        stack.push("cherry");
        System.out.println(stack.peek());
        stack.push("pear");
        stack.print();
        stack.pop();
        System.out.println(stack.peek());
        stack.push("grape");
        stack.print();
    }

    static void testArrayQueue(){
        ArrayQueue<String> queue = new ArrayQueue<String>();

		queue.add("apple");		queue.add("orange");
		queue.add("cherry");	queue.add("pear"); 		queue.print();
		
		queue.remove(); 		queue.print();	
		
		queue.add("grape");		queue.print();
		
		queue.remove(); 		queue.print();
		
		queue.add("lemon");		queue.print();
		queue.add("mango");	    queue.print();
		queue.add("lime");		queue.print();
		queue.add("kiwi"); 		queue.print();
		
		queue.remove(); 		queue.print();
    }

    static void testBinaryTree(){
        Node n1 = new Node(100); Node n2 = new Node(200);
		Node n3 = new Node(300);	Node n4 = new Node(400);	
		Node n5 = new Node(500);	Node n6 = new Node(600);
		Node n7 = new Node(700);	Node n8 = new Node(800);

        n1.setLeft(n2); n1.setRight(n3);
		n2.setLeft(n4);	n2.setRight(n5);
		n3.setLeft(n6);	n3.setRight(n7);
		n4.setLeft(n8);

        BinaryTree t = new BinaryTree();    // Binary Tree 생성
		t.setRoot(n1);                      // Binary Tree Root 노드 지정

        System.out.println(t.getRoot().getKey());
        System.out.println(t.getRoot().getLeft().getRight().getKey());
    }

    static void testBinarySearchTree() {
        BinarySearchTree t = new BinarySearchTree(500, "Apple");  

		t.put(600, "Banana");
		t.put(200, "Melon"); 
		t.put(100, "Orange");
		t.put(400, "Tangerine"); 
		t.put(250, "Kiwi");
		t.put(150, "Grape");
		t.put(800, "Strawberry"); 
		t.put(700, "Cherry"); 
		t.put(50,  "Pear");
		t.put(350, "Lemon");
		t.put(10,  "Watermelon");

		t.print(t.root);System.out.println();

        t.delete(400);
        t.print(t.root);System.out.println();
    }

    static void testAVLTree(){
        AVL<Integer, String> st = new AVL<Integer, String>();

	 	st.put(75, "Apple"); st.put(80, "Grape");st.put(85, "Lime");
	 	st.put(20, "Mango"); st.put(10, "Strawberry");st.put(50, "Banana");
	 	st.put(30, "Cherry");st.put(40, "Watermelon");st.put(70, "Melon"); st.put(90, "fruit");
		st.print(st.root);		

    }

    static void testLinearProbing(){
        LinearProbing t = new LinearProbing();
        t.put(71, "grape"); t.put(23, "apple");	t.put(73, "bananna");
        t.put(49, "cherry");t.put(54, "mango");	t.put(89, "lime");
        t.put(39, "orange");
        
        System.out.println(t.get(54));        
        t.print();
    }    

    static void testQuadProving() {
        QuadProbing t = new QuadProbing();
        t.put(71, "grape"); t.put(23, "apple");	t.put(73, "bananna");
        t.put(49, "cherry");t.put(54, "mango");	t.put(89, "lime");
        t.put(39, "orange");

        System.out.println(t.get(54));        
        t.print();        
    }

    static void testRandProving() {
        RandProbing t = new RandProbing();
        t.put(71, "grape"); t.put(23, "apple");	t.put(73, "bananna");
        t.put(49, "cherry");t.put(54, "mango");	t.put(89, "lime");
        t.put(39, "orange");

        System.out.println(t.get(54));        
        t.print();        
    }

    static void testDoubleHashing() {
        DoubleHashing t = new DoubleHashing();
        t.put(71, "grape"); t.put(23, "apple");	t.put(73, "bananna");
        t.put(49, "cherry");t.put(54, "mango");	t.put(89, "lime");
        t.put(39, "orange");

        System.out.println(t.get(54));        
        t.print();        
    }
}