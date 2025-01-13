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
    }

}
