package Mini_Project;

public class BookList {
    public void showAll(){
        System.out.println("===도서목록===");
        for (Book b : BookRepository.getBooks()){
            System.out.println(b);
        }
    }
}
