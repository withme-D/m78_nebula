package c_polymorphism.test;

public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + super.getAge() + "岁吃猫粮");
    }
}
