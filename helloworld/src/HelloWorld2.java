import java.util.Scanner;

/**
 * Created by czz
 * Description:
 * User: 旧鹿麋
 * Date: 2021-09-11
 * Time: 22:39
 */
//class Student {
//    public void print(String name){
//        System.out.println(name+"说：HelloWorld!");
//    }
//}
//public class HelloWorld2 {
//    public static void main(String[] args) {
//        Student student1 = new Student();
//        student1.print("张三");
//
//    }
//}
public class HelloWorld2 {
    public static void main(String[] args) {
        Student stu = new Student();  //创建对象
        stu.speak("大家好！");  //给对象发消息
    }
}
class Student {
    public void speak(String s) {
        System.out.println(s);
    }
}
