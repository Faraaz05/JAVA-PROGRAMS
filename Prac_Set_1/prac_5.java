import java.util.Scanner;
public class prac_5 {
    public static void PrintBill(int[] Items , int ItemIndex) {
        String[] Item = {"Motor","Fan","Tube","Wire","E_Board"};
        int[] Price = {100,200,300,400,500};
        int[] GST = {8,24,15,30,15};
        int Tprice = 0,TGST = 0;

        System.out.println("Item\t\tPrice\t\tGST\t\t");

        for(int i = 0; i < ItemIndex; i++) {
            System.out.println(Item[Items[i]] + "\t\t" + Price[Items[i]] + "\t\t" + GST[Items[i]]);
            Tprice = Tprice + Price[Items[i]];
            TGST = TGST + GST[Items[i]];
        }

        int Final = Tprice + TGST;
        System.out.println("Total:  " + Tprice + "   GST: " + TGST + "   Final Amount: " + Final);

    }
    public static void main(String[] args) {
        int[] Items = new int[100];
        int ItemIndex = 0;
        Boolean exit = false;

        while(exit == false) {
        System.out.println("\n1 -> Motor");
        System.out.println("2 -> Fan");
        System.out.println("3 -> Tube");
        System.out.println("4 -> Wire");
        System.out.println("5 -> Electric_Board");
        System.out.println("6 -> Exit");
        System.out.println("Enter Your Choice: ");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        switch(choice) {
            case 1: {
                System.out.println("Motor Added To Bill");
                Items[ItemIndex++] = 0;      
                break;
            }
            case 2: {
                System.out.println("Fan Added To Bill");
                Items[ItemIndex++] = 1;
                break;
            }
            case 3: {
                System.out.println("Tube Added To Bill");
                Items[ItemIndex++] = 2;
                break;
            }
            case 4: {
                System.out.println("Wire Added To Bill");
                Items[ItemIndex++] = 3;
                break;
            }
            case 5: {
                System.out.println("Electric_Board Added To Bill");
                Items[ItemIndex++] = 4;
                break;
            }
            case 6: {
                System.out.println("Exiting... Generating Bill...");
                exit = true;
                break;
            }
        }
        }
        PrintBill(Items,ItemIndex);
        System.out.println("23CS012-Faraaz Bhojawala");
    }
}
