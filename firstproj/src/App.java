
import C01.S02_Class.AttendanceBook;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        testAttendanceBook();        


    }
    static void testAttendanceBook() {
        AttendanceBook ab = new AttendanceBook(100);
        
        ab.insertStudent("홍길동");
        ab.insertStudent("김친구");
        ab.insertStudent("박감사");
        ab.insertStudent("이소리");
        ab.insertStudent("김둥실");
        ab.insertStudent("최자바");

        ab.printStudent();
        ab.deleteStudnet("박감사");
        ab.printStudent();
        System.out.println(ab.count);
        
    }
}