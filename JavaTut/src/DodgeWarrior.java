import java.util.Random;

public class DodgeWarrior extends Warrior{

    double dodgePercent;
    Random rand = new Random();

    public DodgeWarrior(String name, int health, int atkMax, int blockMax, double dodgePercent) {
        super(name, health, atkMax, blockMax);
        this.dodgePercent = dodgePercent;

        teleportType = new CanTeleport();

    }
    @Override
    public int block() {
        double chance = rand.nextDouble();
        if(chance <= dodgePercent) {
            System.out.printf("%s Dodged the Attack\n\n", this.getName());
            return 10000;
        } else {
            return super.block();
        }
    }

}
