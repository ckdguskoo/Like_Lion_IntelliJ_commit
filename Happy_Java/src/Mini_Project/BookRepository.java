package Mini_Project;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private static List<Book> books = new ArrayList<>();

    static { //보유 책 목록 static으로 선언해 모든 클래스가 사용할수 있게함
        books.add(new Book("해리포터", "JK롤링", true, 20000));
        books.add(new Book("asdf", "vfrd", true, 30000));
        books.add(new Book("qwer", "mjug", true, 50000));
    }


    //저장된 책 목록 반환하는 메소드
    public static List<Book> getBooks() {

        return books;
    }

    //제목찾아서 반환하는 메소드
    public static Book findBook(String name) {
        for (Book b : books) {
            if (b.getName().trim().equals(name)) {
                return b;
            }
        }
        return null;
    }

    //관리자페이지 책 추가
    public static void addBook(Book book){
        books.add(book);
    }

    //관리자페이지 책 삭제
    public static void remove(Book book){
        books.remove(book);
    }

}


