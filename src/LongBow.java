public class LongBow extends Bow { //Длинный лук
    @Override
    public int range() {
        return 100;
    }

    @Override
    public int damage() {
        return 10;
    }

    @Override
    public String toString() {
        return "Большой лук : " + super.toString();
    }
}
