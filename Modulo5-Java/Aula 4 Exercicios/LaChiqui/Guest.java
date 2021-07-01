package LaChiqui;

public class Guest implements EatCake{

    protected String name;

    public Guest(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eatCake() {
    }
}
