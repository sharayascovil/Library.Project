Book.java

package mypack;

public class Book

{

public static void main(String[] args) {

    String title: boolean borrowed;

        public Book(String bookTitle) {
    
            title = bookTitle;

    }

        public void rented() {
        
            borrowed = true;
    }


        public void returned() {
            
            borrowed = false;

    }

    public boolean isBorrowed() {

        return borrowed;

    }

    public String getTitle() {

        return title;

    }


    public static void main(String[] args) {

       Book bk = new Book("The Da Vinci Code");

        bk1.new Book("oops");

    System.out.println("Title: " + bk.getTitle());

    System.out.println("Borrowed?: " + bk.isBorrowed());

        bk.rented();

    System.out.println("Borrowed?: " + bk.isBorrowed());

        bk.returned();

   System.out.println("Borrowed?: " + bk.isBorrowed());

    }

}

Library.java

import mypack.*;

public class Library

{

String addr;

Book bk;

int i = 0;


public Library(String address) {

addr = address;

}

public void addBook(String abook) {

bk = new Book(abook);

}

  
public String openhours() {

    String c = "Libraries are open daily from 9am to 5pm.";

        return c;

}

  
public String printAddr() {

    return addr;

}

  
public String availbook() {

    return bk.getTitle();

}

  
public static void main(String[] args) {

  

// // Creating two libraries

Library firstLibrary = new Library("10 Main St.");

Library secondLibrary = new Library("228 Liberty St.");

  

firstLibrary.addBook("The Da Vinci Code");

firstLibrary.addBook("Le Petit Prince");

firstLibrary.addBook("A Tale of Two Cities");

firstLibrary.addBook("The Lord of the Rings");

  

System.out.println("First Library");

System.out.println(firstLibrary.printAddr());

System.out.println(firstLibrary.openhours());

  

System.out.println("Second Library");

System.out.println(secondLibrary.printAddr());

System.out.println(secondLibrary.openhours());


System.out.println(firstLibrary.availbook());

    }
}