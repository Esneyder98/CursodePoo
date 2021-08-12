from car import Car
if __name__=="__main__":
    print("Hola mundo")
    car = Car()
    car.license="NPL46E"
    car.driver="Carlos Santos"
    print(vars(car))

    car2 = Car()
    car2.license="wqsdfr"
    car2.driver="Jose lopez"
    print(vars(car2))
