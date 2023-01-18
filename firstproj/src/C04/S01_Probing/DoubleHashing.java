package C04.S01_Probing;

public class DoubleHashing <K, V>{
	private int M = 11;  // 테이블 크기
	private K[] a = (K[]) new Object[M];  //해시테이블
	private V[] d = (V[]) new Object[M];  //key괸련 데이터 저장

	private int hash(K key){  // 해시코드
		return (key.hashCode() & 0x7fffffff) % M;  //나눗셈 함수 
	}

	public void put(K key, V data) {
		int initialpos = hash(key);   // 초기 위치
		int i = initialpos;
		int j=1;
		int initialpos2=(7-(int)key % 7);  // 두번쨰 해시 함수, d(key)=7-key%7
		do {
			if (a[i] == null){  // 삽입 위치 발견
				a[i]  = key;    // key를 해시테이블에 저장
				d[i] = data;   // key관련 데이터를 동일한 인덱스하에 저장
				return;
			}
			if (a[i].equals(key)) { // 이미 key 존재
				d[i] = data;   // 데이터만 갱신
				return; 
			}            
			i = (initialpos + j*initialpos2) % M; // i = 다음 위치
			j++;
		} while (i != initialpos);  // 현재 i가 초기위치와 같게되면 루프 종료   
	}

	public V get(K key) {
		int initialpos = hash(key);     // 초기 위치
		int i = initialpos;
		int j=1;
		int initialpos2=(7-(int)key % 7);
		while (a[i] != null) {
			if (a[i].equals(key))
				return d[i];    // 탐색 성공
			i = (initialpos + j*initialpos2) % M; // i = 다음 위치
			j++;
		}            
		return null;  // 탐색 실패
	}

	public void print() {
		System.out.println("해시 테이블:");   
        for(int i=0;i<M;++i) System.out.printf("\t%2d",i);
        System.out.println();
        for(int i=0;i<M;++i) System.out.print("\t"+a[i]);
        System.out.println();
		for(int i=0;i<M;++i) System.out.print("\t"+d[i]);
        System.out.println();
	}
}