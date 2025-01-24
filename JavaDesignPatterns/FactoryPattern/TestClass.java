package JavaDesignPatterns.FactoryPattern;

public class TestClass {
    public static void main(String[] args) {
        Computer computer1=ComputerFactory.getComputer(ComputerType.Laptop,"Lenovo","16 GB","128 HGZ",
                true,true);
        Computer computer2=ComputerFactory.getComputer(ComputerType.PC,"DELL","8 GB","86 HGZ",true,true);

        Computer computer3=ComputerFactory.getComputer(ComputerType.Desktop,"Asus","16 GB","256 HGZ",true,true);

        System.out.println("Laptop Config::"+ computer1);
        System.out.println("PC Config::"+computer2);
        System.out.println("Desktop Config::"+computer3);
    }
}
