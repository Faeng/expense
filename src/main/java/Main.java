import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Faeng",0);
        boolean state = true;
        String activity;
        double amount;
        String reminderNote;
        Scanner input = new Scanner(System.in);
        System.out.println("Pleased welcome : "+ "\"" + user1.getName()+"\""+ " to the income and expenditure account program.");


        while(state == true){
            System.out.println();
            System.out.println("Earn money:E, Spend money:S, Show Balance:B, Show Account:A, Quit:Q");
            activity = input.next();
            if(activity.equalsIgnoreCase("Q")) {
                state = false;
            }
            else if(activity.equalsIgnoreCase("E")){
                System.out.println("Input must more than 0");
                System.out.println("Amount & Note");
                amount = input.nextDouble();
                reminderNote = input.nextLine();
                user1.addMoney(amount,reminderNote);
            }
            else if(activity.equalsIgnoreCase("S")){
                System.out.println("Input must be minus");
                System.out.println("Amount & Note: ");
                amount = input.nextDouble();
                reminderNote = input.nextLine();
                user1.spendMoney(amount,reminderNote);
            }
            else if(activity.equalsIgnoreCase("B")){
                System.out.print("Now your Balance is: ");
                System.out.println(user1.showBalance() + "Baht.");
            }
            else if(activity.equalsIgnoreCase("A")){
                for (int i=0; i< user1.financeList.size(); i++){
                    if(user1.financeList.get(i)>=0){
                        System.out.print("Income: "+user1.financeList.get(i));
                        System.out.println("\t\t\t\tNote:"+user1.note.get(i));
                    }
                    if(user1.financeList.get(i)<0){
                        System.out.print("Expense: "+user1.financeList.get(i));
                        System.out.println("\t\t\t\tNote:"+user1.note.get(i));
                    }
                }
                /*for (Double i:user1.financeList) {
                    if(i>=0){
                        System.out.println("Income: "+ i );

                    }
                    else {
                        System.out.println("Expense: "+ i);
                    }
                } */
            }
            else{
                System.out.println("Invalid Input");
            }
        }
    }
}
