package com.pluralsight.neighborhoodlibrary;
import java.lang.Object;
import java.lang.String.*;

public class Book {
    private String title;
    private String isbn;
    private String id;

    public Book (String title, String isbn, String id) {
    this.title = title;
    this.isbn = isbn;
    this.id = id;
    }

    public String getTitle() {
    return title;
    }

    public String getIsbn() {
    return isbn;
    }

    public String getId() {
        return id;
    }

        Object[] bookList = new Object[]{
                "The Pragmatic Programmer", "978-0201616224", 1,
                "Clean Code", "978-0132350884", 2,
                "Design Patterns", "978-0201633610", 3,
                "Code Complete", "978-0735619678", 4,
                "Refactoring", "978-0201485677", 5,
                "Head First Design Patterns", "978-0596007126", 6,
                "Introduction to Algorithms", "978-0262033848", 7,
                "The Mythical Man-Month", "978-0201835953", 8,
                "Effective Java", "978-0134685991", 9,
                "You Don't Know JS: Scope & Closures", "978-1491904152", 10,
                "Java Concurrency in Practice", "978-0321349606", 11,
                "The Art of Computer Programming", "978-0201896831", 12,
                "Structure and Interpretation of Computer Programs", "978-0262510875", 13,
                "Clean Architecture", "978-0134494166", 14,
                "Working Effectively with Legacy Code", "978-0131177055", 15,
                "Patterns of Enterprise Application Architecture", "978-0321127426", 16,
                "Continuous Delivery", "978-0321601919", 17,
                "Building Microservices", "978-1491950357", 18,
                "Cracking the Coding Interview", "978-0984782857", 19,
                "Artificial Intelligence: A Modern Approach", "978-0136042594", 20
        };
    private String toString (){
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", id=" + id +
                '}';
    }





    }


/*String id;
    String isbn;
    String title;
    Boolean isCheckedOut;
    String checkedOutTo;
    String bookTitle;
   */






