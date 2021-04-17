package JavaStart.superConstruction;

public class Nootbook  extends  Computer{
    private int batteryCapacity;

    public Nootbook(double cpu, int memorySize, int batteryCapacity) {
        super(cpu, memorySize);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
