package OOP1;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
    static int num;
    static ArrayList<Stock> list = new ArrayList<>();
    static int[] price = new int[10];

    public static void getData() {
        int i=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number Of Stock You Want : ");
        num = sc.nextInt();

        while(i<num) {
            System.out.println("Enter Share Name : ");
            String shareName = sc.next();
            System.out.println("Enter Number Of Shares : ");
            int numberOfShare  = sc.nextInt();
            System.out.println("Enter Share price : ");
            int sharePrice  = sc.nextInt();

            list.add( new Stock(shareName,numberOfShare,sharePrice));
            price[i++]=sharePrice * numberOfShare;
        }
        for(int j=0; j<list.size(); j++) {
            System.out.println(list.get(j));
        }
    }
    public static void totalValueOfStocks() {
        int sumOfShares=0;
        for(int i=0; i<num;i++) {
            sumOfShares += price[i];
        }

        System.out.println("Total Share Price : "+sumOfShares);
    }

    public static void main(String[] args) {
        getData();
        totalValueOfStocks();
    }
}
