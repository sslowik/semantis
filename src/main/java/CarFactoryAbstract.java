public class CarFactoryAbstract {

    public static void main(String[] args) {
        equipCar(new EconomyCarEquipmentFactory());
        equipCar(new ComfortCarEquipmentFactory());
    }

    private static void equipCar(CarEquipmentFactory carEquipmentFactory) {
        Engine engine = carEquipmentFactory.createEngine();
        engine.produceEngine();

        Light light = carEquipmentFactory.createLight();
        light.produceLight();

        Tire tire = carEquipmentFactory.createTire();
        tire.produceTire();
    }

}

interface CarEquipmentFactory {
    Engine createEngine();

    Light createLight();

    Tire createTire();
}

class EconomyCarEquipmentFactory implements CarEquipmentFactory {
    public Engine createEngine() {
        return new PetrolEngine();
    }

    public Light createLight() {
        return new Halogen();
    }

    public Tire createTire() {
        return new BudgetTire();
    }
}

class ComfortCarEquipmentFactory implements CarEquipmentFactory {
    public Engine createEngine() {
        return new HybridEngine();
    }

    public Light createLight() {
        return new LedLight();
    }

    public Tire createTire() {
        return new PremiumTire();
    }
}

interface Engine {
    void produceEngine();
}

interface Light {
    void produceLight();
}

interface Tire {
    void produceTire();
}

class PetrolEngine implements Engine {
    public void produceEngine() {
        System.out.println("Producing petrol engine.");
    }
}

class Halogen implements Light {
    public void produceLight() {
        System.out.println("Producing halogen light.");
    }
}

class BudgetTire implements Tire {
    public void produceTire() {
        System.out.println("Producing budget tire.");
    }
}

class HybridEngine implements Engine {
    public void produceEngine() {
        System.out.println("Producing hybrid engine.");
    }
}

class LedLight implements Light {
    public void produceLight() {
        System.out.println("Producing led light.");
    }
}

class PremiumTire implements Tire {
    public void produceTire() {
        System.out.println("Producing premium tire.");
    }
}
