package JavaDesignPatterns.FactoryPattern;

public class ComputerFactory {
    private ComputerFactory(){

    }

    public static Computer getComputer(ComputerType type,String name, String ram, String cpu, boolean isBlutoothEnabled, boolean isGprsEnabled){
       switch (type){
           case PC:
               return new PC(name,ram,cpu,isBlutoothEnabled,isGprsEnabled);
           case Laptop:
               return new Laptop(name,ram,cpu,isBlutoothEnabled,isGprsEnabled);
           case Desktop:
               return new Desktop(name,ram,cpu,isBlutoothEnabled,isGprsEnabled);
           default:
               throw new RuntimeException("Given input type is invalid.");
       }
    }
}
