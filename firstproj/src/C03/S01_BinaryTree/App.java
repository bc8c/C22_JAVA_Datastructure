package C03.S01_BinaryTree;

public class App {
    public static void main(String[] args) {

        // 사용방법 예제 1
        // 모든 노드들의 변수를 생성하여 사용하는 방법
        Node n1 = new Node(100);
        Node n2 = new Node(200);
        Node n3 = new Node(300);
        Node n4 = new Node(400);
        Node n5 = new Node(500);
        Node n6 = new Node(600);
        Node n7 = new Node(700);
        Node n8 = new Node(800);

        n1.setLeft(n2);
        n1.setRight(n3);
        n2.setLeft(n4);
        n2.setRight(n5);
        n3.setLeft(n6);
        n3.setRight(n7);
        n4.setLeft(n8);

        BinaryTree t = new BinaryTree(); // Binary Tree 생성
        t.setRoot(n1); // Binary Tree Root 노드 지정

        System.out.println(t.getRoot().getKey());
        System.out.println(t.getRoot().getLeft().getRight().getKey());

        // 사용방법 예제 2
        // # 변수생성없이 메모리상의 객체만 생성하는 방법

        // BinaryTree t = new BinaryTree(); // Binary Tree 생성
        // Node n1 = new Node(100);
        // t.setRoot(n1); // Binary Tree Root 노드 지정

        // t.getRoot().setLeft(new Node(200));
        // t.getRoot().setRight(new Node(300));
        // t.getRoot().getLeft().setLeft(new Node(400));
        // t.getRoot().getLeft().setRight(new Node(500));

        // System.out.println(t.getRoot().getKey());
        // System.out.println(t.getRoot().getLeft().getRight().get.getKey());

    }
}
