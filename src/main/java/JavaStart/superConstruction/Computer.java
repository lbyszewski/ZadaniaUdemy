package JavaStart.superConstruction;

public class Computer {
    private double cpu;
    private  int memorySize;

    public Computer(double cpu, int memorySize) {
        this.cpu = cpu;
        this.memorySize = memorySize;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }
}
