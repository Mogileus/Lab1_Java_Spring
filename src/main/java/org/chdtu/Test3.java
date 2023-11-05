package org.chdtu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
       Library library = context.getBean("Magazine", Library.class);
     Person person = new Person(library);
    person.YourOrder();
        library.say();

    Person person1 = context.getBean("myPerson", Person.class);
       System.out.println(person.getSurname());
       System.out.println(person.getAge());

        context.close();
    }
}
