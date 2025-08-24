package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Variable_IF {
    public static void main(String[] args) {
        //### 1단계: 변수와 조건문
        //1. 사용자로부터 정수를 입력받아 **짝수인지 홀수인지** 판별하는 프로그램을 작성하세요.
        //2. 세 개의 정수를 입력받아 그 중 **가장 큰 수**를 출력하세요.

        System.out.println("짝수홀수를 구분하고싶으시면 1번");
        System.out.println("세 개의 정수값중 가장 큰수를 찾고싶으면 2번을 눌러주세요");
        Scanner number = new Scanner(System.in); //작업 고르기
        int distinguish = number.nextInt();
        try {
            if (distinguish !=1 && distinguish!=2){
                System.out.println("잘못 입력하셨습니다 1또는 2를 입력해주세요");
                return;

            }
            if (distinguish == 1) { //짝수홀수
                System.out.println("숫자를 입력해 주세요");
            }


            int in = number.nextInt();
            if (in % 2 == 0) { //짝수
                System.out.printf("%d 는 짝수입니다!", in);
            } else if (in % 2 == 1) { //홀수
                System.out.printf("%d 는 홀수입니다!", in);
            } else {
                System.out.println("잘못입력하셨습니다. 숫자를 입력해주세요"); //예외처리
                return;
            }

            if (distinguish == 2) { //큰값 찾기
                System.out.println("숫자 3개를 입력해주세요");
                int first = number.nextInt();
                int second = number.nextInt();
                int third = number.nextInt();

                int num = 0; //가장 큰값 저장
                num = Math.max(first, second);
                num = Math.max(num, third);
                System.out.println("가장큰값은 " + num + "입니다!");
            }
        }catch (InputMismatchException e){
            System.out.println("문자를 입력하셨습니다. 숫자를 입력해주세요. 프로그램을 종료합니다.");
        }




    }
}
