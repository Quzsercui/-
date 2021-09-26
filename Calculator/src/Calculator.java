import java.util.Scanner;

/**
 * Created by czz
 * Description:
 * User: 旧鹿麋
 * Date: 2021-09-12
 * Time: 11:00
 */
class Cal{
    private double sum;
    private double sub;
    private double mul;
    private double div;
    public void plus(double a,double b){
        this.sum = a+b;
        System.out.println(a+"+"+b+"="+sum);
    }
    public void substract(double a,double b){
        this.sub = a-b;
        System.out.println(a+"-"+b+"="+sub);
    }
    public void mulity(double a,double b){
        this.mul = a*b;
        System.out.println(a+"*"+b+"="+mul);
    }
    public void divide(double a,double b){
        this.div = a/b;
        System.out.println(a+"/"+b+"="+div);
    }
}
public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("******简易计算器：******");
            System.out.println("*******1.加法：********");
            System.out.println("*******2.减法：********");
            System.out.println("*******3.乘法：********");
            System.out.println("*******4.除法：********");
            System.out.println("*******5.请选择：*******");
            int flg = sc.nextInt();
            Cal cal1 = new Cal();
            System.out.println("请输入a和b的值：");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            switch (flg) {
                case 1:
                    cal1.plus(a, b);
                    break;
                case 2:
                    cal1.substract(a, b);
                    break;
                case 3:
                    cal1.mulity(a, b);
                    break;
                case 4:
                    cal1.divide(a, b);
                    break;
            }
        }
    }
}
