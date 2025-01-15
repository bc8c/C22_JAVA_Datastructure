package C02.S01_ArrList;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        // # JAVA에 이미 구현된 ArrayList 사용해보기
        ArrayList<Integer> integers1 = new ArrayList<Integer>();
        integers1.add(80);
        integers1.add(90);
        integers1.add(101);
        integers1.add(100);
        integers1.add(167);
        integers1.add(123);
        System.out.println(integers1.get(4));
        System.out.println(integers1.size());

        // # 직접 만든 ArrList 사용해보기
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

}
