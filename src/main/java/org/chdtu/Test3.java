package org.chdtu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
       Pet pet = context.getBean("myPet", Pet.class);
//      Pet pet1 = new Dog();
      Person person = new Person(pet);
     person.callYourPet();

        Person person1 = context.getBean("myPerson", Person.class);
//        person.callYourPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
