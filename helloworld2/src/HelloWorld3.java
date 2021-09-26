import java.util.Scanner;

/**
 * Created by czz
 * Description:
 * User: 旧鹿麋
 * Date: 2021-09-12
 * Time: 0:02
 */
class student {
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public void print(String nu){
        System.out.println(name+"说：hello!"+nu);
    }
}
public class HelloWorld3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student stu1 = new student();
        System.out.print("请输入学生1：");
        String name1 = sc.nextLine();//张三
        System.out.print("请输入学生2：");
        String name2 = sc.nextLine();//李四
        student stu2 = new student();
        stu1.setName(name1);//学生1叫张三
        stu2.setName(name2);//学生2叫李四
        stu1.print(name2);
        stu2.print(name1);
    }
}
