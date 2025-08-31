package Mini_Project;

import java.util.Objects;

//사용할 필드
public class Book {
    private String name;
    private String author;
    private int price;
    private boolean existence;

    //생성자
    public Book(String name, String author, boolean existence, int price) {
        this.name = name;
        this.author = author;
        this.existence = existence;
        this.price = price;
    }

    //getter, setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //메소드 오버라이딩
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book bookSet)) return false;
        return existence == bookSet.existence && Objects.equals(name, bookSet.name) && Objects.equals(author, bookSet.author) && Objects.equals(price, bookSet.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, price, existence);
    }

    @Override
    public String toString() {
        return "제목 : "+name+ "\t| 저자 : "+ author+"\t| 구매가능 : "+existence+"\t| 가격 : "+price;
    }
}
