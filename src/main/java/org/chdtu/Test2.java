package org.chdtu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Library library = context.getBean("Book", Library.class);
        Person person = new Person(library);
        person.YourOrder();
        library.say();

        context.close();
    }
}
