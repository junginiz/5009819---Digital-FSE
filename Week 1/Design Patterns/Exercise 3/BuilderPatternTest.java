public class BuilderPatternTest {
    public static void main(String[] args) {
        // Creating a high-end gaming computer
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA RTX 3090")
                .setMotherboard("ASUS ROG Maximus XIII")
                .setPowerSupply("1000W")
                .setCoolingSystem("Liquid Cooling")
                .setCaseType("Full Tower")
                .build();

        // Creating a budget office computer
        Computer officeComputer = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM("8GB")
                .setStorage("500GB HDD")
                .setGPU("Integrated Graphics")
                .setMotherboard("ASUS Prime B460M")
                .setPowerSupply("500W")
                .setCoolingSystem("Air Cooling")
                .setCaseType("Mini Tower")
                .build();

        // Printing the configurations
        System.out.println("Gaming Computer: " + gamingComputer);
        System.out.println("Office Computer: " + officeComputer);
    }
}
