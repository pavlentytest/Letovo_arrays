package ex2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        for(int i=0;i<n;i++) {
            x[i] = scanner.nextInt();
        }
        System.out.println(calc(x));
    }
    public static int calc(int[] z) {
        int counter=0;
        for(int i=0;i<z.length;i++) {
            if(z[i]%2==0) {
                counter++;
            }
        }
        return counter;
    }
}
