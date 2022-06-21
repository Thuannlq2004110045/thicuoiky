package eHealthCare;

import java.util.Scanner;

public class NewInsuranceCardUI {
    private static Scanner scanner = new Scanner(System.in);
    private Actions command;
    private NewInsuranceCardController newInsuranceCardController;

    public NewInsuranceCardUI(NewInsuranceCardController newInsuranceCardController){
        this.command = null;
        this.newInsuranceCardController = newInsuranceCardController;
    }

    public String handleCommands(String rep) {
        String cmd = rep.toUpperCase();
        this.command = Actions.valueOf(cmd);
        if (this.command.equals(Actions.CIC)) {
            return "Enter information";
        }else{
            return "Unknow command.";
        }
    }

    public void handleInputs() {
        if (this.command.equals(Actions.CIC)) {
            InsuranceCard insuranceCard = createInfoInsuranceCardInputs();
            newInsuranceCardController.createInsuranceCard(insuranceCard.getid(), insuranceCard.getInsuranceCardType(), insuranceCard.getName(), insuranceCard.getDateOfBirth(), insuranceCard.getAddress(), insuranceCard.getPhoneNumber(), insuranceCard.getInfocustomer());
        }
    }

    private static InsuranceCard createInfoInsuranceCardInputs() {
        System.out.print("HO VA TEN: ");
        String name = scanner.nextLine();
        System.out.print("NGAY SINH: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("DIA CHI: ");
        String address = scanner.nextLine();
        System.out.print("SO DIEN THOAI: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("THE BAO HIEM LOAI: ");
        Integer insuranceCardType = scanner.nextInt();
        scanner.nextLine();
        System.out.print("TUOI: ");
        Integer age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("GIOI TINH: ");
        String gender = scanner.nextLine();
        System.out.print("NHOM MAU: ");
        String bloodGroup = scanner.nextLine();
        System.out.print("CAN NANG: ");
        Double weight = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("CHIEU CAO: ");
        Double height = scanner.nextDouble();
        scanner.nextLine();
        InfoCustomer infocustomer = new InfoCustomer(age, gender, bloodGroup, weight, height);
        InsuranceCard insuranceCard = new InsuranceCard(insuranceCardType, name, dateOfBirth, address, phoneNumber, infocustomer);
        System.out.println("info InsurancceCard" + insuranceCard.toString());
        return insuranceCard;
    }
}
