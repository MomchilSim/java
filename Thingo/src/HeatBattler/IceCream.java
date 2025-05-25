package HeatBattler;

public abstract class IceCream {
    private String type;
    private String topping;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getTopping() {
        return topping;
    }

    public abstract void prepare();
    public abstract void create();
}

