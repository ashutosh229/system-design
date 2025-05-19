public abstract class BasePizza {
    public abstract int cost();
}

class MargheritaPizza extends BasePizza {
    @Override
    public int cost() {
        return 10;
    }
}

class VeggieDelightPizza extends BasePizza {
    @Override
    public int cost() {
        return 20;
    }
}
