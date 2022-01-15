package b_extend;

public class Zi extends Fu{
    public int age = 20;
    public void show(){
        int age = 30;
        System.out.println(age);//输出的是局部变量的age
        //我要访问本类的成员变量age，怎么办？
        System.out.println(this.age);
        //我要访问父类的成员变量age，怎么办？
        System.out.println(super.age);
    }
}
