package useful.ch01;

// Object클래스는 모든 클래스의 최상위 클래스. extends Object 선언 안해도 생략돼있음.
// java.lang 패키지는 import안해도 자동으로 가져옴.
public class Book extends Object{
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "[" + title +  " , " + author + "]";
    }

    public static void main(String[] args) {
        Book book = new Book("데미안" , "헤르만헤세");
        Book book2 = book;
        Book book3 = new Book("데미안" , "헤르만헤세");

        // 논리적으로 같은 객체라고 판별하고 싶을때 equals()메서드 사용.
        // 단, equals()메서드 재정의 할때 hashcode()메서드도 재정의 해야함.
        System.out.println("book == book2 : " +(book == book2));
        System.out.println("book.equals(book2) : " + book.equals(book2));
        System.out.println("book == book3 : " +(book == book3));
        System.out.println("book.equals(book3) : " + book.equals(book3));
        System.out.println("book.hashCode() : " + book.hashCode());


//        System.out.println(book);
//        System.out.println("==============================");
//        System.out.println("로깅 1 - 책 제목 : " + book.title);

    }
}
