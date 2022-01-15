package c_polymorphism.test;

public class Dome {
    public static void main(String[] args) {

        Animal a = new Cat();
        a.setAge(1);
        a.setName("加菲");
        a.eat();

        Cat b = new Cat();
        b.setAge(2);
        b.setName("波斯");
        b.eat();


    }
}
