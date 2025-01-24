package JavaDesignPatterns.FactoryPattern;

public class Desktop implements Computer{
    private String name;
    private String ram ;
    private String cpu ;
    private boolean isBlutoothEnabled ;
    private boolean isGprsEnabled ;

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public String ram() {
        return this.ram;
    }

    @Override
    public String cpu() {
        return this.cpu;
    }

    @Override
    public boolean isBlutoothEnabled() {
        return this.isBlutoothEnabled;
    }

    @Override
    public boolean isGprsEnabled() {
        return this.isGprsEnabled;
    }

    public Desktop(String name, String ram, String cpu, boolean isBlutoothEnabled, boolean isGprsEnabled) {
        this.name = name;
        this.ram = ram;
        this.cpu = cpu;
        this.isBlutoothEnabled = isBlutoothEnabled;
        this.isGprsEnabled = isGprsEnabled;
    }
    @Override
    public String toString() {
        return "Desktop{" +
                "name='" + name + '\'' +
                ", ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                ", isBlutoothEnabled=" + isBlutoothEnabled +
                ", isGprsEnabled=" + isGprsEnabled +
                '}';
    }
}
