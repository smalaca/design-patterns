package namedconstructor;

public class Person {
    private Name name;
    private Person mum;
    private Person dad;

    public Person(Name name) {
        this.name = name;
    }

    public Person(Name name, Person mum) {
        this(name);
        this.mum = mum;
    }

    public Person(Name name, Person mum, Person dad) {
        this(name, mum);
        this.dad = dad;
    }

//    public Person(Name name, Person dad) {
//        this(name);
//        this.dad = dad;
//    }
}
