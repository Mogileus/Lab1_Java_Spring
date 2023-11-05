package org.chdtu;

public class Book implements Library{

    public Book() {
        System.out.println("Book bean is created");
    }
    @Override
    public void say(){
        System.out.println("book");
    }
}
