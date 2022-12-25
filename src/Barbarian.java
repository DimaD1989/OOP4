public class Barbarian extends  Warrior<Axe,Shield,Gear>{ //варвар
    public Barbarian(String name, int healthpoint,Axe weapon,Shield protectoin,Gear gear) {
        super(name, healthpoint, weapon,protectoin,gear);
    }

    @Override
    public String toString() {
        return "Варвар : " + super.toString();
    }
}
