package eHealthCare;

public class NewInsuranceCardController {
    private InsuranceCard insuranceCard;

    public InsuranceCard getInsuranceCard() {
        return insuranceCard;
    }

    public NewInsuranceCardController(InsuranceCard insuranceCard){
        this.insuranceCard = insuranceCard;
    }

    public void createInsuranceCard(Integer id, Integer insuranceCardType, String name, String dateOfBirth, String address, String phoneNumber, InfoCustomer infoCustomer) {
        // Integer id = InsuranceCard.createID();
        // System.out.println("id duoc cap la: " + id);

        InsuranceCard.getInsuranceCards().update(id, insuranceCardType, name, dateOfBirth, address, phoneNumber, infoCustomer);
        InsuranceCard.getInsuranceCards().write();
    }
}
