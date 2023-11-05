package org.chdtu;

public class Magazine implements Library{
    public Magazine(Book book) {
        System.out.println("Magazine bean is created");
    }
    @Override
    public void say(){
        System.out.println("magazine");
    }
}
