public class Person {
    private String name;

    public Person (String name){ this.name=name; }

    public String getName(){ return this.name; }

    public void setName(String name){ this.name = name; }

    public void sayHello(){ System.out.println("Hello, "+name); }

    public static void main (String[] args) {
        Person nick = new Person("Nick");
        nick.sayHello();
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//        Person person3 = new Person("John");
//        Person person4 = person3;
//        System.out.println(person3 == person4);
        Person person5 = new Person("John");
        Person person6 = person5;
        System.out.println(person5.getName());
        System.out.println(person6.getName());
        person5.setName("Jane");
        System.out.println(person5.getName());
        System.out.println(person6.getName());
    }
}
