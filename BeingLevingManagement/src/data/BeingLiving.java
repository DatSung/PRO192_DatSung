package data;

public abstract class BeingLiving {
    private String name;
    public BeingLiving() {
        name = "things";
    }
    public BeingLiving(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public final void useWater() { // final : Cac lop con khong duoc overide ham nay //
        System.out.println("User sweet H2O");
    }
    public abstract void grow();

}
