import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by czz
 * Description:
 * User: 旧鹿麋
 * Date: 2021-09-24
 * Time: 21:02
 */
public class Experiment {
    public static void main(String[] args) {
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("*********************");
            System.out.println("*****1.升序排序*******");
            System.out.println("*****2.输出数值表格****");
            System.out.println("*****3.n元组*********");
            System.out.println("*****4.退出程序********");
            System.out.println("*****请输入选项：******");
            System.out.println("*********************");
            int chance = sc.nextInt();
            switch (chance) {
                case 1:
                    bublesort();
                    break;
                case 2:
                    print();
                    break;
                case 3:
                    Scanner SC = new Scanner(System.in);
                    System.out.println("请输入n的值：");
                    int n = SC.nextInt();
                    int[] arr = new int[n];
                    System.out.println("请输入n元组的值：");
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = SC.nextInt();
                    }
                    System.out.println("*********************");
                    System.out.println("*****1.打印三元组******");
                    System.out.println("*****2.三元组最大值****");
                    System.out.println("*****3.三元组最小值****");
                    System.out.println("*****4.销毁三元组******");
                    System.out.println("*****请输入选项：******");
                    System.out.println("*********************");
                    int chance2 = sc.nextInt();
                    Triplet triplet = new Triplet();
                    switch (chance2) {
                        case 1:
                            triplet.Get(arr);
                            break;
                        case 2:
                            triplet.Max(arr);
                            break;
                        case 3:
                            triplet.Min(arr);
                            break;
                        case 4:
                            triplet = null;
                            break;
                    }

            }
        }


    }
    public static void bublesort(){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("请输入10个数：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length-1; i++) {
            boolean flg = false;
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flg = true;
                }
            }
            if(flg == false){
                break;
            }
        }
        System.out.println("升序后的10个数：");
        System.out.println(Arrays.toString(arr));
    }
    public static void print(){
        int[][] arr = new int[10][10];
        for (int[] row:arr) {
            for (int val:row) {
                val = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("("+i+","+j+")");
            }
            System.out.println();
        }
    }

}
class Triplet {
//    public void create(){
//        Scanner SC = new Scanner(System.in);
//        System.out.println("请输入n的值：");
//        int n = SC.nextInt();
//        int[] arr = new int[n];
//        System.out.println("请输入n元组的值：");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = SC.nextInt();
//        }
//    }

    public void Get(int[] arr) {
        int i = 0;
        System.out.println("显示三元组：");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void Max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("n元组最大值是："+max);
    }
    public void Min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min >arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("n元组最小值是："+min);
    }
}
