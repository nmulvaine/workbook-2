package com.pluralsight.neighborhoodlibrary;

public class Book
{
    private String title;
    private String isbn;
    private String id;

    public Book(String title, String isbn, String id)
    {
        this.title = title;
        this.isbn = isbn;
        this.id = id;
    }

    public String toString()
    {
        return "Book{" +
               "Title='" + title + '\'' +
               ", ISBN='" + isbn + '\'' +
               ", ID=" + id +
               '}';
    }

    public String getTitle()
    {
        return title;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public String getId()
    {
        return id;
    }

    Book[] bookList = new Book[]{
            new Book("The Pragmatic Programmer", "978-0201616224", "1"),
            new Book("Clean Code", "978-0132350884", "2"),
            new Book("Design Patterns", "978-0201633610", "3"),
            new Book("Code Complete", "978-0735619678", "4"),
            new Book("Refactoring", "978-0201485677", "5"),
            new Book("Head First Design Patterns", "978-0596007126", "6"),
            new Book("Introduction to Algorithms", "978-0262033848", "7"),
            new Book("The Mythical Man-Month", "978-0201835953", "8"),
            new Book("Effective Java", "978-0134685991", "9"),
            new Book("You Don't Know JS: Scope & Closures", "978-1491904152", "10"),
            new Book("Java Concurrency in Practice", "978-0321349606", "11"),
            new Book("The Art of Computer Programming", "978-0201896831", "12"),
            new Book("Structure and Interpretation of Computer Programs", "978-0262510875", "13"),
            new Book("Clean Architecture", "978-0134494166", "14"),
            new Book("Working Effectively with Legacy Code", "978-0131177055", "15"),
            new Book("Patterns of Enterprise Application Architecture", "978-0321127426", "16"),
            new Book("Continuous Delivery", "978-0321601919", "17"),
            new Book("Building Microservices", "978-1491950357", "18"),
            new Book("Cracking the Coding Interview", "978-0984782857", "19"),
            new Book("Artificial Intelligence: A Modern Approach", "978-0136042594", "20")
    };

    public void printOperation()
    {
        System.out.println(id + " | " + title + " | " + isbn);
    }


}


/*String id;
    String isbn;
    String title;
    Boolean isCheckedOut;
    String checkedOutTo;
    String bookTitle;
   */






