package JavaStart.Streams;

import java.util.Objects;

public class Variables {
    private int varInt;

    public Variables(int varInt) {
        this.varInt = varInt;
    }

    public int getVarInt() {
        return varInt;
    }

    public void setVarInt(int varInt) {
        this.varInt = varInt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Variables variables = (Variables) o;
        return varInt == variables.varInt;
    }

    @Override
    public int hashCode() {
        return Objects.hash(varInt);
    }
}
