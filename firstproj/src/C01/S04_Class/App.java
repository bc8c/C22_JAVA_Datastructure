package C01.S04_Class;

public class App {

    public static void main(String[] args) {

        AttendanceBook ab = new AttendanceBook(6);

        ab.insertStudent("홍길동");
        ab.insertStudent("김친구");
        ab.insertStudent("박감사");
        ab.insertStudent("이소리");
        ab.insertStudent("김둥실");
        ab.insertStudent("최자바");
        ab.insertStudent("이오류");

        ab.printStudent();
        ab.deleteStudnet(4);
        ab.deleteStudnet("박감사");
        ab.printStudent();
        System.out.println(ab.count); 
    }
    
}
