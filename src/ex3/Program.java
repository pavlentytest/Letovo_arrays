package ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        while(scanner.hasNext()) {
            a.add(scanner.nextInt());
        }
        System.out.println(calc(a));
    }
    public static int calc(ArrayList<Integer> z) {
        int counter=0;
        for(int i=0;i<z.size();i++) {
            if(z.get(i)%2==0) {
                counter++;
            }
        }
        return counter;
    }
}
