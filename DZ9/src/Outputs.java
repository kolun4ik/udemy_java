public class Outputs {
    Outputs() {
        System.out.println("Object created!");
    }
}

class TestOutputs {
    public static void main(String[] args) {
        Outputs o1 = new Outputs();
        Outputs o2 = new Outputs();
        Outputs o3 = new Outputs();
        Outputs o4 = new Outputs();
        Outputs o5 = new Outputs();
        Outputs o6 = new Outputs();
        Outputs o7 = new Outputs();
        o1 = o2 = o3 = o4 = o5 = o6 = o7 = null;
        Outputs o8 = new Outputs();
    }
}
