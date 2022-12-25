public class SmallShield extends  Shield{
    @Override
    public int damageAbsorption() {
        return 10;
    }

    @Override
    public String toString() {
        return "Маленький щит : " + super.toString();

    }
}
