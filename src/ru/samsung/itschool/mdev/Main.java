package ru.samsung.itschool.mdev;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // /
        // %

       // 1.2 Задание - 3 задачи
       // 1.5 Задание - 2 задачи


       // x >= y && (x * x - 4 >= y)

	    boolean flag = true;
	    int a = 100, b = 2;

	    if(a < 0 && b > 5) {

        } else if(a != -2) {

        } else {

        }

	    // a = 1
	    switch(a) {
            case 0:
                System.out.println("0");
            case 1:
            case 5:
                System.out.println("1 or 5");
            case 6:
                System.out.println("6");
            default:
                System.out.println("default");
        }

	    for(int i=0;i<10;i++) {
          //  System.out.print(i);
        }
	    for(int j=10;j>0;j--) {

        }
	    int[] x; // null
        x = new int[10];

        for(int i=0;i<x.length;i++) {
          //  System.out.print(x[i]);
        }
	    ArrayList arrayList = new ArrayList(); // 20
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add("Hello");

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("HHH");
        //arrayList1.add(1);

    /*    while(a > 0) {
            //  вообще может не выполнится
        }

        do {
            // 1 проход всегда будет
        } while(a < 0);
*/
        int[][] y = new int[4][3];
        Random r = new Random();

        for(int i=0;i<y.length;i++) {
            for(int j=0;j<y[i].length;j++) {
                y[i][j] = r.nextInt(100);
            }
        }

        for(int i=0;i<y.length;i++) {
            for(int j=0;j<y[i].length;j++) {
                System.out.print(y[i][j] + " ");
            }
            System.out.println();
        }



    }
}
