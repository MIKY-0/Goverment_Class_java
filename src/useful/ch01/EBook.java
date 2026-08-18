package useful.ch01;

import java.util.Objects;

public class EBook {
    private int bookId;
    private String title;
    private String author;

    public EBook(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "EBook[" + bookId + " , " + title + " , " + author + " , ]";
    }

    // equals 메서드 재정의 목적 : 필요하다면 논리적으로 같은 객체라고 판별하고 싶을때.
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true; // 1. 동일참조 체크
        if(!(obj instanceof EBook)) return false; // 2. 타입체크(EBook인지)

        // 만약 책 제목과 저자가 같다면 논리적으로 같은책이라고 판별.
        // 3. 필드 비교(논리적 기준)
        EBook other = (EBook) obj; // 다운캐스팅.
        return this.bookId == other.bookId && Objects.equals(this.title , other.title) &&
                Objects.equals(this.author , other.author);
    }

    // equals와 같이 재정의해야 의도대로 잘 작동.
    @Override
    public int hashCode() {
        return Objects.hash(bookId , title , author); // 필드기반으로 해시코드 생성.
    }
}
