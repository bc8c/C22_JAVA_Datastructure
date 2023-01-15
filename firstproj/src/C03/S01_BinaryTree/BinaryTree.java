package C03.S01_BinaryTree;

public class BinaryTree<Key> {
    private Node root;

    public BinaryTree( ) { root = null; }      // 트리 생성자

    public Node getRoot( )            { return root; }
	public void setRoot(Node newRoot) { root = newRoot; }

    public boolean isEmpty( ) { return root == null; }
}
