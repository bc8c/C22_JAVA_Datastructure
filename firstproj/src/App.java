
import java.util.ArrayList;

import C01.S03_Class.AttendanceBook;
import C01.S04_GenericClass.DynamicAttendanceBook;
import C02.ArrList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // testAttendanceBook();
        // testDynamicAttendanceBook();
        testArrList();
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
}