package sky.pro.com.example.testForMe.domain;

public class Driver extends Person{
    private String driverLicenceNumber;
    public String getDriverLicenceNumber() {
        return driverLicenceNumber;
    }

    public void setDriverLicenceNumber(String driverLicenceNumber) {
        this.driverLicenceNumber = driverLicenceNumber;
    }

    public Driver(String name, String surname, String passport, String driverLicenceNumber, int professionNumber) {
        super(name, surname, passport, professionNumber);
        this.driverLicenceNumber = driverLicenceNumber;
    }



}
