package cn.itcast;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
         threeVars();


    }

    public static void threeVars() {

        System.out.println("请输入变元个数");
        Scanner sc = new Scanner(System.in);
        int vars_num = sc.nextInt();

        System.out.println("请输入多项式项数");
        Scanner sc1 = new Scanner(System.in);
        int polyNum = sc1.nextInt();

        System.out.println("请输入常数项");
        Scanner scanner = new Scanner(System.in);
        int plus = scanner.nextInt();

        int[][] poly = new int[polyNum][vars_num];
        String tmp = "";
        String[] tmp2 = new String[vars_num];

        for (int i = 0; i < polyNum; i++) {
            Scanner sc2 = new Scanner(System.in);
            tmp = sc2.nextLine();
            // System.out.println(tmp);
            tmp2 = tmp.split(" ");
            for (int j = 0; j < tmp2.length; j++) {
                poly[i][j] = Integer.parseInt(tmp2[j]);
            }
        }
        int sum = 0;
        byte[][] res = new byte[polyNum][vars_num];
        for (int i = 0; i < polyNum; i++) {
            poly[i] = reverse(poly[i]);
            res[i] = threeT(poly[i]);
        }
        Traversal(res, vars_num);
        // System.out.println(sum);
    }

    public static byte[] threeT(int[] arr) {
        int resLength = arr.length / 8;
        int calRes = 0;
        if (arr.length % 8 != 0) {
            resLength = resLength + 1;
        }
        byte[] res = new byte[resLength];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                res[0] = (byte) (res[0] ^ (0b00000001 << i));
            }
        }
        return res;
    }

    public static void Traversal(byte[][] input, int varsNum) {

        for(int i = 0; i < input.length; i++){
            System.out.println(input[i][0]);
        }

        int limit = (int) Math.pow(2, varsNum);
        int polyNum = input.length;
        int byteNum = varsNum / 8;
        if (varsNum % 8 != 0) {
            byteNum = byteNum + 1;
        }
        byte[] tmp = new byte[input.length * limit];
        int point = 0;
        for (int i = 0; i < limit; i++) {
            for (int j = 0; j < polyNum; j++) {
                for (int t = 0; t < byteNum; t++) {
                    tmp[point] = (byte) (input[j][t] & i);
                    point++;
                }
            }
        }
        System.out.println(point);

//            System.out.println(tmp[i]);
        for(int i = 1; i < point + 1; i++){
            
        }

        int sum = 0;
        for(int i = 1; i < point + 1; i++){
            sum = sum + tmp[i - 1];
            if(i % 5 == 0){
                System.out.println((sum + 1) % 2);
            }
        }
    }

    public static int[] reverse(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int tmp = 0;
            tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
        return arr;
    }
}

