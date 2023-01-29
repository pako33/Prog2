import java.util.*;
public class Vt3main{
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of subscriptions");
        int p_num = Integer.parseInt(sc.nextLine());
        Subscription sub[] = new Subscription[p_num];
        for(int i=0; i<p_num; i++) {
            System.out.println("Input the Journal name");
            String p_nm = sc.nextLine();
            System.out.println("Input the Subscriber's name");
            String p_user = sc.nextLine();
            System.out.println("Input the Subscriber's Address");
            String p_address = sc.nextLine();
            System.out.println("Input the Journal's Price");
            Double p_price = Double.parseDouble(sc.nextLine());
            System.out.println("Subscription Length or -1 for standing subscription");
            int p_rate = Integer.parseInt(sc.nextLine());
            int p_discount = 0;
            if (p_rate == -1) {
                System.out.println("Discount rate?");
                p_discount = Integer.parseInt(sc.nextLine());
            }
            if (p_rate == -1) {
                sub[i] = new StandingSubscription(p_nm, p_user, p_address, p_price, p_discount);
            }
            else{
                sub[i] = new RegularSubscription(p_nm, p_user, p_address, p_price, p_rate);
            }
        }
        for(int i=0; i<p_num; i++) {
            printSubscriptionInvoice(sub[i]);
        }
    }
    static void printSubscriptionInvoice (Subscription subs) {
        subs.printInvoice();
    }
}