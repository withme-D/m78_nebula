package b_package;
import b_extend.Zi;  //导包
//包的作用 package
/*
1.包就是文件夹
2.对类进行分类管理
 */
//导包 import
/*
使用不同包下的类时，使用的时候要写类的全路径，写起来太麻烦
为了简化带包的操作，Java就提供了导包的功能
其实就是导进去某一个类

格式： import 包名；
范例： import b_extend.Fu
 */
//权限修饰符
/*
分类：
1.权限修饰符   private 默认 protected public
   本类内：                所有修饰符都可以使用
   继承（extend）          默认 protected public
   同一个包下               默认 protected public
   不在同一个包下带有继承     protected public
   不在同一个包下带有导包     public
2.状态修饰符
   1.final(最终态) 关键字是最终的意思，可以修饰成员方法，成员变量，类
       对于使用final关键字修饰过的
       1.方法  不可以在子类中重写(@Override)
       2.变量  不可以进行重新赋值(也就是变成给常量)
       3.类    不可以作为父类被子类继承

       final修饰局部变量
       变量是基本类型： final修饰指的是基本类型的数据值不能变
       变量是引用类型   final修饰指的是引用类型的地址值不能发生改变，但是可以地址里面的内容可以改变

   2.static(静态)  关键字是静态的意思，可以修饰成员方法，成员变量
        使用static修饰成员
        1.变量时：
           1.被类的所有对象共享
           2.可以通过类名调用（建议使用此种调用方式），也可以使用对象名调用
        2.方法：
           1.非静态的成员方法可以访问非静态的成员方法和变量，也可以访问静态的成员方法和变量
           2.静态的成员方法  只能访问静态的成员变量和成员方法
           （因为mian方法是静态的，所以建议写方法的时候使用static，为了方便main访问）

 */
public class bao {
    public static void main(String[] args) {
        //创建对象
        Zi z = new Zi();
        //调用方法
        z.show();
    }
}
