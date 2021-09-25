import java.util.Scanner;

/**
 * Created by czz
 * Description:
 * User: 旧鹿麋
 * Date: 2021-09-24
 * Time: 12:57
 */
class Student {
    String name ;String gender ;
    double math ;
    double xiandai;
    double Cyuyan;
    double java;
    public Student(String name , String gender , double math , double xiandai, double Cyuyan, double java){
        this.name = name;
        this.gender = gender;
        this.math = math;
        this.xiandai = xiandai;
        this.Cyuyan = Cyuyan;
        this.java = java;
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Score Sr = new Score();
        for (int i = 0; i < 1; i++) {
            System.out.println("输入学生姓名：");
            String name = sc.next();
            System.out.println("请输入性别：");
            String gender = sc.next();
            System.out.println("请输入高数成绩：");
            double math = sc.nextDouble();
            System.out.println("请输入线代成绩：");
            double xiandai = sc.nextDouble();
            System.out.println("请输入C语言成绩：");
            double Cyuyan = sc.nextDouble();
            System.out.println("请输入java成绩：");
            double java = sc.nextDouble();

            Student s = new Student(name, gender, math, xiandai, Cyuyan, java);
            Sr.setData(s, i);
        }
        System.out.println("=========================================" +
                "学生成绩表======================================");
        System.out.println("姓名\t\t性别\t\t高数成绩\t\t线代成绩\t\tC语言成绩\t\tjava成绩\t\t\"平均成绩");

        Student[] b = Sr.getData();
        for (Student S : b) {
            if (S == null) {
                break;
            }
            System.out.println(S.name + "\t" + S.gender + "\t\t" + S.math
                    + "\t\t" + S.xiandai + "\t\t" + S.Cyuyan + "\t\t" + S.java);
            System.out.println();
        }
        System.out.println("是否查找学生成绩？ 是Y 否N");
        String flag = sc.next();
        if (flag.equals("Y")) {
            System.out.println("输入要查找的学生名:");
            String name = sc.next();
            Student S = Sr.SerchData(name);
            if (S == null) {
                System.out.println("对不起，没有此学生名");
            } else {
                String xb = S.gender;
                double sx = S.math;
                double xd = S.xiandai;
                double cyy = S.Cyuyan;
                double jv = S.java;
                double sum = sx + xd + cyy + jv;
                System.out.println("要查找的学生为:" + name + "\n性别：" + xb + "高数成绩为:" + sx
                        + "\n线代成绩为:" + xd + "\nc语言成绩为:" + cyy + "\njava成绩为:" + jv
                        + "\n总成绩成绩为:" + sum + "平均成绩为：" + sum / 4);
            }
        }
    }
}


