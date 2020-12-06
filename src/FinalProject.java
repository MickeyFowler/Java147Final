//Mickey Fowler,fm66254@umbc.edu
import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;
import java.lang.String;
import java.util.Date;
public class FinalProject {
    public static void stockPurchaseInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter customer's name: ");
        String customerName = scan.nextLine();
        System.out.println("Enter number of shares purchased: ");
        int numberOfShares = scan.nextInt();
        System.out.println("Enter cost of each share: ");
        double costOfShares = scan.nextDouble();
        double amountPaid = numberOfShares * costOfShares;
        double commission = 0.04 * amountPaid;
        double totalCost = commission + amountPaid;
        System.out.println("Customer's name: " + customerName);
        System.out.println("Shares purchased: " + numberOfShares);
        System.out.println("Cost per share: " + costOfShares);
        System.out.println("This stock transaction with commission cost "  + customerName +" $:" + totalCost);
        System.out.println("Your total cost rounded up to the closest dollar is: " + Math.round(totalCost));
    }
    public static void michaelStocks(){
        String[] michaelStocks = new String[] {"Microsoft", "Ford", "Proctor and Gamble", "Apple"};
        System.out.println(Arrays.toString(michaelStocks));
    }
    public static int[] michaelSharesOfFord(int a,int b){
        int[] henryStocks = new int[200];
        henryStocks[1] = a;
        henryStocks[2] = b;
        return henryStocks;
    }
    public static void numberOfDayTrades(){
        Scanner scan = new Scanner(System.in);
        int tradeLimit = 4;
        System.out.println("Enter number of day trades commenced today, up to 3: ");
        int numberOfDayTradesCommenced = scan.nextInt();
        if(tradeLimit > numberOfDayTradesCommenced){
            numberOfDayTradesCommenced++;
            int tradeCapacity = tradeLimit - numberOfDayTradesCommenced;
            String limitMessage = tradeCapacity + " More day trades may be commenced today.";
            System.out.println(limitMessage);
        }else{
            System.out.println("You may only have up to 3 day trades a day.");
        }
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        stockPurchaseInfo();
        System.out.println("----------------------------------------------------");
        numberOfDayTrades();
        System.out.println("----------------------------------------------------");
        System.out.println("Stocks in customers Portfolio: ");
        michaelStocks();
        System.out.println("----------------------------------------------------");
        System.out.println("Enter number of beneficiaries: ");
                int accountLength = scan.nextInt();
        switch (accountLength) {
            case 0 -> System.out.println("Please name a beneficiary when possible.");
            case 1 -> System.out.println("We recommend to supply more contingent beneficiaries if possible.");
            case 2 -> System.out.println("Looks good! This is the recommended amount of beneficiaries.");
            case 3 -> System.out.println("Looks good!");
            default -> System.out.println("Invalid Input: you may only have up to 3 beneficiaries.");
        }
        System.out.println("----------------------------------------------------");
        int[] fordShares = michaelSharesOfFord(156,50);
        System.out.println("Amount of Ford Shares Owned by Michael: ");
        System.out.println(fordShares[1]);
        System.out.println("Amount of Microsoft Shares Owned by Michael: ");
        System.out.println(fordShares[2]);
        System.out.println("----------------------------------------------------");
        Date date = new Date();
        System.out.println("Today's date is: " + date.toString());
        System.out.println("----------------------------------------------------");
    }
    }