import java.time.Year;
import java.util.Scanner;

/**
 * Created by czz
 * Description:
 * User: 旧鹿麋
 * Date: 2021-09-16
 * Time: 19:46
 */
public class TestDemo {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("*********************");
            System.out.println("*****1.判断闰年*******");
            System.out.println("*****2.判断水仙花数****");
            System.out.println("*****3.三元组*********");
            System.out.println("*****4.退出程序********");
            System.out.println("*****请输入选项：******");
            System.out.println("*********************");
            int chance = sc.nextInt();
            switch (chance) {
                case 1:
                    System.out.println("请输入年份：");
                    int year = sc.nextInt();
                    Year(year);
                    break;
                case 2:
                    System.out.println("请输入数字：");
                    int num = sc.nextInt();
                    flower(num);
                    break;
                case 3:
                    System.out.println("请输入三元组成员：");
                        int e1 = sc.nextInt();
                        int e2 = sc.nextInt();
                        int e3 = sc.nextInt();
                    System.out.println("*********************");
                    System.out.println("*****1.打印三元组******");
                    System.out.println("*****2.三元组最大值****");
                    System.out.println("*****3.三元组最小值****");
                    System.out.println("*****4.销毁三元组******");
                    System.out.println("*****请输入选项：******");
                    System.out.println("*********************");
                    int chance2 = sc.nextInt();
                    Triplet triplet = new Triplet(e1, e2, e3);
                    switch (chance2) {
                        case 1:
                            triplet.Get();
                            break;
                        case 2:
                            triplet.Max();
                            break;
                        case 3:
                            triplet.Min();
                            break;
                        case 4:
                            triplet = null;
                            break;
                    }

            }
        }
    }
    public  static void  Year(int year) {
        Scanner scanner = new Scanner(System.in);
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + "是普通闰年");
        } else if (year % 400 == 0)
            System.out.println(year + "是世纪闰年");

    }
    public  static void flower(int num){
            int sum = 0;
            int count = 0;
            int tmp = num;
            //1、求当前数字是几位数
            while (tmp != 0) {
                count++;//3
                tmp /= 10;//123/10=12    12/10=1   1/10=0
            }
            //i = 123  tmp=0
            //得到当前数字的每一位
            tmp = num;//123
            while (tmp != 0) {
                sum += Math.pow(tmp%10,count);//1、安住ctr 鼠标左键 2.
                tmp = tmp/10;//123/10=12
            }
            if(sum == num) {
                System.out.println(num+"是水仙花数!");
            }
            else {
                System.out.println(num+"不是水仙花数！");
            }

        }
    }
    class Triplet {
        public int[] arr = new int[3];
        public Triplet(int e1, int e2, int e3) {
            this.arr[0] = e1;
            this.arr[1] = e2;
            this.arr[2] = e3;
        }

        public void Get() {
            int i = 0;
            System.out.println("显示三元组：");
            for (i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public void Max() {
            int max = arr[0];
            for (int i = 1; i < 3; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            System.out.println("三元组最大值是："+max);
        }
        public void Min() {
            int min = arr[0];
            for (int i = 1; i < 3; i++) {
                if (min >arr[i]) {
                    min = arr[i];
                }
            }
            System.out.println("三元组最小值是："+min);
        }
    }
