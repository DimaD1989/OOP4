public  abstract class Gear implements Armor {
    public abstract int armoring();

    @Override
    public String toString() {
        return String.format("Дает защиту: %d", armoring());
    }
}
