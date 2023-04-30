package sky.pro.com.example.testForMe.domain;

public class TruckDriver extends Driver{
    public TruckDriver(String name, String surname, String passport, String driverLicenceNumber, int professionNumber) {
        super(name, surname, passport, driverLicenceNumber,professionNumber);
    }
    public void setDriverLicenceNumber(String driverLicenceNumber){
        if(driverLicenceNumber!=null && driverLicenceNumber.startsWith("2")){
            super.setDriverLicenceNumber(driverLicenceNumber);
        }
    }
}
