package src;

import java.util.Arrays;
import java.util.Scanner;

public class Array_hw {
    public static void main(String[] args) {
        //### 3단계: 배열
        //
        //6. 정수 5개를 입력받아 배열에 저장한 후, **최대값과 최소값**을 출력하세요.
        //7. 문자열 배열에 `"사과", "바나나", "딸기", "포도"`를 저장하고,
        //   사용자로부터 과일 이름을 입력받아 배열 안에 존재하는지 찾는 프로그램을 작성하세요.

        Scanner scanner = new Scanner(System.in);
//        int[] number = new int[5];
//
//        System.out.println("숫자 5개를 입력해 주세요");
//
//        for (int i = 0; i < number.length; i++) {
//            number[i] = scanner.nextInt();
//        }
//        System.out.println("저장된 값은 "+Arrays.toString(number)+"입니다.");
//        System.out.println("최소값과 최대값을 출력합니다.");
//        int max = number[0];
//        int min = number[0];
//        for (int i = 1; i < number.length; i++) {
//            if (number[i]>number[i-1]){
//                max = number[i];
//            }
//            if (number[i]<number[i-1]){
//                min = number[i];
//            }
//
//        }
//        System.out.println("최대값은 "+ max +"입니다.");
//        System.out.println("최소값은 " + min + "입니다.");
// -----------------------------------------------------------------
        System.out.println("찾으시는 과일을 입력해 주세요");
        String find = scanner.next();
        String[] fruit = {"사과", "바나나", "딸기", "포도"};

        boolean have = true;
        for (int i = 0; i < fruit.length; i++) {
            if (fruit[i].equals(find)){
                have = true;
                break;
            }
            else {
                have = false;
            }
        }

        if (have){
            System.out.println(find+"는 매장에 있습니다!");
        }
        else {
            System.out.println("찾으시는 과일은 매진되었습니다.");
        }


    }
}
