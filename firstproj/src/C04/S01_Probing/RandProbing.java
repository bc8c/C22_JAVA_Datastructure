package C04.S01_Probing;

import java.util.Random;
public class RandProbing <K, V>{
	private int M = 13;  // 테이블 크기
	private K[] a = (K[]) new Object[M]; // 해시테이블
	private V[] d = (V[]) new Object[M]; // key관련 데이터 저장

	private int hash(K key){ //해시코드
		return (key.hashCode() & 0x7fffffff) % M;  // 나눗셈 함수
	}

	public void put(K key, V data) { // 삽입 연산
		int initialpos = hash(key);   // 초기 위치
		int i = initialpos;     
		Random rand = new Random();
		rand.setSeed(10);
		do {
			if (a[i] == null){ // 삽입 위치 발견
				a[i] = key;    // key를 해시테이블에 저장
				d[i] = data;   // key관련 데이터를 동일한 인덱스하에 저장
				return;
			}
			if (a[i].equals(key)) { // 이미 key 존재
				d[i] = data;  // 데이터만 갱신
				return; 
			}            
			i = (initialpos + rand.nextInt(1000)) % M;  // i = 다음 위치
		} while (i != initialpos); // 현재 i가 초기위치와 같게되면 루프 종료
	}

	public V get(K key) {  //탐색 연산
		Random rand = new Random();
		rand.setSeed(10);  // 삽입때와 같은 seed값 사용
		int initialpos = hash(key);   // 초기 위치
		int i = initialpos;
		while (a[i] != null) {
			if (a[i].equals(key))
				return d[i];   // 탐색 성공
			i = (initialpos + rand.nextInt(1000)) % M; // i = 다음 위치
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