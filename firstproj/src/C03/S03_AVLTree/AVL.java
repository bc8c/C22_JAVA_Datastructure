package C03.S03_AVLTree;

public class AVL<Key extends Comparable<Key>, Value> {
	public Node root;
	public class Node {
		private Key id;       	
		private Value name;   	
		private int height;   	
		private Node left, right;  
		public Node(Key newID, Value newName, int newHt) { // 생성자
			id = newID;
			name = newName;
			height = newHt;
			left = right = null;
		}
	}

	public void put(Key k, Value v) {root = put(root, k, v);}  // 삽입 연산
	private Node put(Node n, Key k, Value v) {
		if (n == null) 	return new Node(k, v, 1);
		int t = k.compareTo(n.id);
		if (t < 0) 		n.left  = put(n.left,  k, v);
		else if (t > 0) n.right = put(n.right, k, v);
		else {
			n.name = v;  // k가 이미 트리에 있으므로 Value v만 갱신
			return n;
		}
		n.height = tallerHeight(height(n.left), height(n.right)) + 1;
		return balance(n); // 노드 n의 균형 점검 및 불균형을 바로 잡음
	}

	private Node balance(Node n) { // 불균형 처리
		if (bf(n) > 1) {  //노드 n의 왼쪽 서브트리가 높아서 불균형 발생
			if (bf(n.left) < 0) { // 노드 n의 왼쪽자식노드의 오른쪽서브트리가 높은 경우
				n.left = rotateLeft(n.left);    // LR-회전
			}
			n = rotateRight(n);  // LL-회전
		}
		else if (bf(n) < -1) {  //노드 n의 오른쪽 서브트리가 높아서 불균형 발생
			if (bf(n.right) > 0) {  // 노드 n의 오른쪽자식노드의 왼쪽 서브트리가 높은 경우
				n.right = rotateRight(n.right); // RL-회전
			}
			n = rotateLeft(n);  // RR-회전
		}
		return n;
	}

	private int bf(Node n) {  // bf 계산
		return height(n.left) - height(n.right);  // bf = 왼쪽 서브트리 높이 - 오른쪽 서브트리 높이 	
	}
	private int height(Node n) { // 높이 계산 
		if (n == null) return 0;
		return n.height;
	}	
	private int tallerHeight(int x, int y){  // 높이 비교
		if (x>y) return x;
		else return y;
	}

	private Node rotateRight(Node n) {  //우로 회전
		Node x = n.left;
		n.left = x.right;
		x.right = n;
		n.height = tallerHeight(height(n.left), height(n.right)) + 1; // 높이 갱신
		x.height = tallerHeight(height(x.left), height(x.right)) + 1; // 높이 갱신
		return x;  // 회전 후 x가 n의 이전 자리로 이동되었으므로 
	}

	private Node rotateLeft(Node n) {   //좌로 회전
		Node x = n.right;
		n.right = x.left;
		x.left = n;
		n.height = tallerHeight(height(n.left), height(n.right)) + 1; // 높이 갱신
		x.height = tallerHeight(height(x.left), height(x.right)) + 1; // 높이 갱신
		return x;  // 회전 후 x가 n의 이전 자리로 이동되었으므로 
	}

	public void print(Node root)  {  // 트리 출력
		System.out.printf("\ninorder:\n");
		inorder(root);
	}
	public void inorder(Node n){       // 중위 순회
		if (n != null) {
			inorder(n.left);   // n의 왼쪽 서브 트리를 순회하기 위해
			System.out.print(n.id+" ");  // 노드 n 방문
			inorder(n.right);  // n의 오른쪽 서브 트리를 순회하기 위해
		}
	}
}