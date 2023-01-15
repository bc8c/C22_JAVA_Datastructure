public class DoubleHashing <K, V>{
	private int M = 11;  // ���̺� ũ��
	private K[] a  = (K[]) new Object[M];  //�ؽ����̺�
	private V[] dt = (V[]) new Object[M];  //key���� ������ ����

	private int hash(K key){  // �ؽ��ڵ�
		return (key.hashCode() & 0x7fffffff) % M;  //������ �Լ� 
	}

	private void put(K key, V data) {
		int initialpos = hash(key);   // �ʱ� ��ġ
		int i = initialpos;
		int j=1;
		int d=(7-(int)key % 7);  // �ι��� �ؽ� �Լ�, d(key)=7-key%7
		do {
			if (a[i] == null){  // ���� ��ġ �߰�
				a[i]  = key;    // key�� �ؽ����̺� ����
				dt[i] = data;   // key���� �����͸� ������ �ε����Ͽ� ����
				return;
			}
			if (a[i].equals(key)) { // �̹� key ����
				dt[i] = data;   // �����͸� ����
				return; 
			}            
			i = (initialpos + j*d) % M; // i = ���� ��ġ
			j++;
		} while (i != initialpos);  // ���� i�� �ʱ���ġ�� ���ԵǸ� ���� ����   
	}

	public V get(K key) {
		int initialpos = hash(key);     // �ʱ� ��ġ
		int i = initialpos;
		int j=1;
		int d=(7-(int)key % 7);
		while (a[i] != null) {
			if (a[i].equals(key))
				return dt[i];    // Ž�� ����
			i = (initialpos + j*d) % M; // i = ���� ��ġ
			j++;
		}            
		return null;  // Ž�� ����
	}

	public static void main(String[] args) {

		DoubleHashing t = new DoubleHashing();
/*		//25, 37, 18, 55, 22, 35, 50, 63�� ���ʷ� ���̺� ����
		t.put(25, "grape"); 	t.put(37, "apple");	t.put(18, "bananna");
		t.put(55, "cherry");	t.put(22, "mango");	t.put(35, "lime");
		t.put(50, "orange");	t.put(63, "watermelone");
		
		System.out.println("Ž�� ���");
		System.out.println("50�� data = "+t.get(50));
		System.out.println("63�� data = "+t.get(63));
		System.out.println();
*/
		t.put(71, "grape"); t.put(23, "apple");	t.put(73, "bananna");
		t.put(49, "cherry");t.put(54, "mango");	t.put(89, "lime");
		t.put(39, "orange");
		System.out.println("�ؽ� ���̺�");
		for(int i=0;i<t.M;++i) System.out.printf("\t%2d",i);
		System.out.println();
		for(int i=0;i<t.M;++i) System.out.print("\t"+t.a[i]);
		System.out.println();
	}
}
