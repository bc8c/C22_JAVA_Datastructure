package C01.S05_GenericClass;

public class App {

    public static void main(String[] args) {

        DynamicAttendanceBook<String> ab1 = new DynamicAttendanceBook<String>(6);

        ab1.insertStudent("홍길동");
        ab1.insertStudent("김친구");
        ab1.insertStudent("박감사");
        ab1.insertStudent("이소리");
        ab1.insertStudent("김둥실");
        ab1.insertStudent("최자바");

        ab1.printStudent();
        System.out.println("---------------------------------------------");
        // # [문제] : deleteStudent 함수의 매개변수로 objec(객체)를 입력할경우 정상 작동하지 않음
        // # [원인] : objec내의 문자열의 비교(equals)가아닌 object간의 직접비교 ("==")를 수행해서 생기는 문제
        // # [해결] : deleteStudent내의 비교구문을 equals 방식으로 바꾸면 해결됨
        // String str = new String("박감사");
        // ab1.deleteStudnet(str);
        ab1.deleteStudent("박감사");
        ab1.printStudent();

        DynamicAttendanceBook<Integer> ab2 = new DynamicAttendanceBook<Integer>(6);
        ab2.insertStudent(85);
        ab2.insertStudent(97);
        ab2.insertStudent(65);
        ab2.printStudent();
        System.out.println("---------------------------------------------");
        Integer i = Integer.valueOf(97);
        ab2.deleteStudent(i);
        ab2.printStudent();
    }

}
