
class Main
{

    public static void main(String[] args)
    {
       System.out.println("Hola Mundo");
        Car car = new Car("amd234",new Account("Erik Carlod", "DAS234"));
        car.passegenger=5;
        car.printDataCars();

        Car car2 = new Car("NPL46E",new Account("Esneyder Saavedra", "DAS456"));
        car2.passegenger=3;
        car2.printDataCars();
    }
}