class Vehicle {
    String define_me() {
        return "a vehicle with pedals.";
    }
}

class Bicycle extends Vehicle {
    String define_me() {
        return "a cycle who is " + super.define_me();
    }
}

class Motorcycle extends Bicycle {
    String define_me() {
        return "a motorcycle, I am a cycle with an engine.";
    }

    Motorcycle() {
        System.out.println("Hello I am " + define_me());
        String ancestor = super.define_me();
        System.out.println("My ancestor is " + ancestor);
    }
}

public class Main {
    public static void main(String[] args) {
        Motorcycle m = new Motorcycle();
    }
}