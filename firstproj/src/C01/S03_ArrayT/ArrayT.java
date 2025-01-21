package C01.S03_ArrayT;

public class ArrayT {
    public static void main(String[] args) {

        // # 1.1 배열 생성 방식 ( 생성과 할당 분리 )
        int[] a = new int[3];
        a[0] = 3;
        a[1] = 4;
        a[2] = 5;

        // 1.2. 배열 생성 방식 ( 생성과 할당 일체 )
        // int[] a = new int[]{3,4,5};
        // int[] a = {3,4,5};
        int[] kk1 = { 3, 4, 5 };
        int[] kk2 = { 3, 4, 5 };

        // #2.1 배열 선언 및 할당, 사용 (Index 활용)
        int[] b = new int[] { 3, 4, 5 };
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);

        // #2.2 배열 선언 및 할당, 사용 (반복문 활용)
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        // #3. 문자열(String) 선언생성의 두가지 방법
        String str = new String("안녕");
        // String str = "안녕";
        System.out.println(str);

        // #4. 문자열(String) 클래스의 메소드 사용예시
        String str1 = new String("JAVA Class!");
        System.out.println(str1);
        str1 = str1.replace("Class", "Student");
        System.out.println(str1);

    }
}
