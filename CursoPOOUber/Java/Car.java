public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passegenger;
    
    public Car(String license,Account driver){
        this.license = license;
        this.driver = driver;
    }

    public void printDataCars(){
        System.out.println("Datos:"+"licencia= "+license+" Conductor= "+driver.name);
    }
}
