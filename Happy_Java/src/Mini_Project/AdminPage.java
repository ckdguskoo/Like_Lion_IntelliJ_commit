package Mini_Project;

import java.util.Scanner;



public class AdminPage {
    Scanner sc = new Scanner(System.in);

    public void addBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("책제목 : ");
        String title = sc.nextLine();
        System.out.println("저자 :");
        String author = sc.nextLine();
        System.out.println("존재여부 :");
        boolean have = sc.nextBoolean();
        System.out.println("가격 :");
        int price = sc.nextInt();
        BookRepository.addBook(new Book(title,author,have,price));
        System.out.println("책저장이 완료 되었습니다.");
    }
    public void removeBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("책제목 : ");
        String title = sc.nextLine();
        System.out.println("저자 :");
        String author = sc.nextLine();
        System.out.println("존재여부 :");
        boolean have = sc.nextBoolean();
        System.out.println("가격 :");
        int price = sc.nextInt();
        BookRepository.remove(new Book(title,author,have,price));
        System.out.println("책 삭제가 완료 되었습니다.");
    }
}
