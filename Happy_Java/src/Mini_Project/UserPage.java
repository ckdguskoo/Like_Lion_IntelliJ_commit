package Mini_Project;

import java.util.Scanner;

public class UserPage {
    Scanner scanner = new Scanner(System.in);

    public void adduser(){ //회원가입
        Scanner scanner = new Scanner(System.in);
        System.out.println("회원가입 하시는분의 이름, 나이, 생년월일을 순서대로 입력해주세요");
        System.out.println("이름 :");
        String str = scanner.nextLine();
        System.out.println("나이 :");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("생년월일 :");
        String birthday = scanner.nextLine();
        UserRepostiory.useradd(new User(str,age,birthday));
        System.out.println("회원가입이 정상적으로 진행되었습니다.");
    }

    public void delUser(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("회원탈퇴를 진행합니다.");
        System.out.println("탈퇴하실 회원 정보를 입력해주세요\n");
        System.out.println("이름 :");
        String str = scanner.nextLine();
        System.out.println("나이 :");
        int age = scanner.nextInt();
        System.out.println("생년월일 :");
        String birthday = scanner.nextLine();
        UserRepostiory.userdel(new User(str,age,birthday));
        System.out.println("회원탈퇴가 정상적으로 되었습니다.");
    }
}
