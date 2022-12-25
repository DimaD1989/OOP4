public class BigShield extends  Shield{
    @Override
    public int damageAbsorption() {
        return 30;
    }
    @Override
    public String toString() {
        return String.format("Большой шит поглащает урон : %d", damageAbsorption());
    }
}
