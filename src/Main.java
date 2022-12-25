public class Main {
    public static void main(String[] args) {

        Comandor comandor = new Comandor("Alex", 280, new LongBow(), new BigShield(), new Hauberk());
        Team<Archer> archers = new Team<>(comandor);
        System.out.println(comandor);
        archers.addWarrior(new Archer("Tom", 170, new LongBow(), new SmallShield(),new Hauberk()));
        archers.addWarrior(new Archer("Ira",210, new LongBow(),new SmallShield(),new Hauberk()));
        archers.forEach(item -> System.out.println(item));

        System.out.println( "Суммарный урон команды равен: "+archers.getAllDamage() +
                " Суммарное здоровье: "+ archers.getAllHealthPoint() +
                " Максимальная зона поражения: " + archers.getMaxRadius()
                + "Максимальная защита: " + archers.getMaxArmor());

        System.out.println("---------------new Team-----------");
        Comandor comandor1 = new Comandor("Nick",280,new LongBow(),new BigShield(),new Hauberk());
        Team<Barbarian> axes = new Team<>(comandor1);
        axes.addWarrior(new Barbarian("Nata", 168 , new Sekira(),new SmallShield(),new Hauberk()));
        System.out.println(comandor1);
        for (Barbarian item:axes) {
            System.out.println(item);
        }
        System.out.println( "Суммарный урон команды равен: " + axes.getAllDamage() +
                " Суммарное здоровье: " + axes.getAllHealthPoint()+
                " Максимальная зона поражения: " + axes.getMaxRadius()
                + " Максимальная защита: " + archers.getMaxArmor());

        System.out.println("---------------Third Team-----------");

        Comandor comandor2 = new Comandor("Dmitriy", 290, new LongBow(), new BigShield(),new Hauberk());
        Team<Warrior> gang = new Team<>(comandor2);
        gang.addWarrior(new Barbarian("John", 325 , new Sekira(), new SmallShield(),new Hauberk()));
        gang.addWarrior(new Archer("Mayk",187 , new LongBow(),new SmallShield(),new Hauberk()));
        System.out.println(comandor2);
        gang.forEach(item-> System.out.println(item));
        System.out.println( "Суммарный урон команды равен : " + gang.getAllDamage() +
                " Суммарное здоровье : " + gang.getAllHealthPoint() +
                " Максимальная зона поражения : " + gang.getMaxRadius()
                + " Максимальная защита: " + archers.getMaxArmor());


    }
}