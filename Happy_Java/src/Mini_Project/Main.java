package Mini_Project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookList bookList = new BookList();
        BookSerach bookSerach = new BookSerach();
        AdminPage admin = new AdminPage();
        UserPage userPage = new UserPage();

        while (true){
            System.out.println("\n");
            System.out.println("=====원하시는 기능을 선택해 주세요=====");
            System.out.println("1. 도서 검색");
            System.out.println("2. 도서 전체보기");
            System.out.println("3. 관리자 페이지");
            System.out.println("4. 회원가입 페이지");
            System.out.println("5. 회원탈퇴 페이지");
            System.out.println("0. 종료");

            int intinput = scanner.nextInt();
            scanner.nextLine();

            if (intinput == 0){
                System.out.println("프로그램을 종료합니다");
                break;
            }

           switch (intinput){
               case 1:
                   System.out.println("========================\n");
                   System.out.println("찾으시는 도서제목을 입력해주세요");

                   String input = scanner.next();

                   bookSerach.serach(input);
                   break;

               case 2:
                   System.out.println("========================");
                   System.out.println("도서 전체보기");
                   System.out.println("===결과를 출력합니다===\n");
                   bookList.showAll();
                   break;

               case 4:
                   System.out.println("회원가입 페이지로 이동합니다.");
                   userPage.adduser();
                   break;

               case 5:
                   System.out.println("회월탈퇴 페이지로 이동합니다.");
                   userPage.delUser();
                   break;

               case 0:
                   System.out.println("========================\n");
                   System.out.println("프로그램을 종료합니다");
                   break;

               case 3:
                   System.out.println("========================\n");
                   System.out.println("관리자 페이지로 이동합니다");
                   System.out.println("========================\n");
                   System.out.println("원하시는 작업을 선택해 주세요");
                   System.out.println("1.도서 추가  |  2. 도서 삭제  |  3. 뒤로가기" );
                   int admininput = scanner.nextInt();
                   scanner.nextLine();
                   switch (admininput){
                       case 1:
                           System.out.println("추가하실 책을 입력해 주세요 : ");
                           admin.addBook();
                           break;
                       case 2:
                           System.out.println("삭제하실 책을 입력해 주세요");
                           admin.removeBook();
                           break;
                       case 3:
                           System.out.println("\n이전 페이지로 이동합니다.");
                           break;
                       default:
                           System.out.println("잘못된 입력입니다. 다시 입력해주세요");
                           continue;
                   }

               default:
                   System.out.println("잘못된 입력입니다. 다시 입력해주세요");
                   continue;
           }

        }
    }
}
