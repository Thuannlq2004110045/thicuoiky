package eHealthCare;

import java.util.Scanner;

public class BootStrap {
    public static void main(String[] args) throws InterruptedException {
        Scanner inputScanner = new Scanner(System.in);
        InsuranceCard insuranceCard = new InsuranceCard();
        NewInsuranceCardController newInsuranceCardController = new NewInsuranceCardController(insuranceCard);
        NewInsuranceCardUI newInsuranceCardUI = new NewInsuranceCardUI(newInsuranceCardController);

        System.out.println("Welcome to the eHealthCare System!!\n (To exit type 'exit') \n");

        while (true) {
            Thread.sleep(5000);
            displayOptions(newInsuranceCardController);
            //String prompt = getPrompt(newInsuranceCardController);
            //System.out.print(prompt);
            
            String rep = inputScanner.nextLine();

            // LI
            String resCMD;
            if (rep.toUpperCase().equals(Actions.CIC.toString())) {
                resCMD = newInsuranceCardUI.handleCommands(rep);
                System.out.println(resCMD);

                if (resCMD != null && !resCMD.equals("Unkown command.")) {
                    newInsuranceCardUI.handleInputs();
                }
            // } else if (rep.toUpperCase().equals(Actions.LI.toString())
            //         || rep.toUpperCase().equals(Actions.LO.toString())) {

            //     resCMD = loginAccountUI.handleCommands(rep);

            //     if (resCMD != null && !resCMD.equals("Unkown command.")) {
            //         loginAccountUI.handleInputs();
            //     }
            }
        }
    }

    public static void displayOptions(NewInsuranceCardController newInsuranceCardController) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~ MENU ~~~~~~~~~~~~~~~~~~~");
        // check
        String str = "";
            str = "Enter one of the commands in the    brackets:\n" +
                    "[CIC] Create Insurance Card\n" +
                    "[LI] Login";
            System.out.println(str);
            //System.out.println("Enter on of the commands in brackets:\n " +
                    //"[LO] Logout");
    }
}
