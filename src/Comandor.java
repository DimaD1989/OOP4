public class Comandor extends  Warrior<Weapon,Protection,Armor>{
    public Comandor(String name, int healthpoint, Weapon weapon,Protection protection,Armor armor) {
        super(name, healthpoint, weapon, protection,armor);
    }

    @Override
    public String toString() {
        return "Командир : " + super.toString();
    }
}
