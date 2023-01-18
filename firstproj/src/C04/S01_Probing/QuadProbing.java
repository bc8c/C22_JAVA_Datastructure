package C04.S01_Probing;

public class QuadProbing<K, V>{
	private int M = 11;  // 테이블 크기
	private K[] a = (K[]) new Object[M]; // 해시테이블
	private V[] d = (V[]) new Object[M]; // key관련 데이터 저장

	private int hash(K key){  // 해시코드
		return (key.hashCode() & 0x7fffffff) % M;  // 나눗셈 함수
	}

	public void put(K key, V data) { // 삽입 연산
		int initialpos = hash(key);   // 초기 위치
        int i = initialpos, j = 1;
        do {
            if (a[i] == null){  // 삽입 위치 발견
            	a[i]  = key;    // key를 해시테이블에 저장
            	d[i] = data;    // key관련 데이터를 동일한 인덱스하에 저장
                  return;
            }
            if (a[i].equals(key)) {  // 이미 key 존재
                d[i] = data;         // data데이터만 갱신
            }            
            i = (initialpos + j * j++) % M; // i = 다음 위치           
        } while (i != initialpos);    
	}

	public V get(K key) {  // 탐색 연산
		int initialpos = hash(key);
        int i = initialpos, j = 1;
	        while (a[i] != null) {  // a[i]가 empty가 아니면
	            if (a[i].equals(key))
	                return d[i];        // 탐색 성공
	            i = (initialpos + j * j++) % M; // i = 다음 위치
	        }            
	        return null; // 탐색 실패
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
