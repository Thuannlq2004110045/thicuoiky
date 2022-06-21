package eHealthCare;

public class InfoCustomer {
    private int age;
    private String gender;
    private String bloodGroup;
    private Double weight;
    private Double height;
    
    public InfoCustomer() {
        this.age = 0;
        this.gender = null;
        this.bloodGroup = null;
        this.weight = null;
        this.height = null;
    }

    public InfoCustomer(int age, String gender, String bloodGroup, Double weight, Double height) {
        this.age = age;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.weight = weight;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return " [age=" + age + ", bloodGroup=" + bloodGroup + ", gender=" + gender + ", height=" + height
                + ", weight=" + weight + "]";
    }

    
}
