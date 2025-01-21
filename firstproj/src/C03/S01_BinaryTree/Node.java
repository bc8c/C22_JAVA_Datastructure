package C03.S01_BinaryTree;

public class Node<Key> {
	private Key item;
	private Node<Key> left;
	private Node<Key> right;

	public Node(Key newItem) {
		item = newItem;
		left = null;
		right = null;
	}

	public Key getKey() {
		return item;
	}

	public Node<Key> getLeft() {
		return left;
	}

	public Node<Key> getRight() {
		return right;
	}

	public void setKey(Key newItem) {
		item = newItem;
	}

	public void setLeft(Node<Key> lt) {
		left = lt;
	}

	public void setRight(Node<Key> rt) {
		right = rt;
	}
}
