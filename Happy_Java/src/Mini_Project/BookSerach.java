package Mini_Project;

public class BookSerach {
    public void serach(String title){
        Book book = BookRepository.findBook(title);
        if (book != null){
            System.out.println("검색결과 :"+ book);
        }
        else {
            System.out.println("해당 책이 존재하지 않습니다.");
        }

    }

}
