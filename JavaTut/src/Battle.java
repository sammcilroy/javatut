public class Battle {
    // utility class
    // all methods should be static
    // static methods and fields should be used when values shared by multiple objects

    public static void startFight(Warrior w1, Warrior w2) {
        while(true) {
            if (getAttackResult(w1, w2).equals("Game Over")) {
                System.out.println("Game Over");
                break;
            }
            if (getAttackResult(w2, w1).equals("Game Over")) {
                System.out.println("Game Over");
                break;
            }
        }
    }

    public static String getAttackResult(Warrior wA, Warrior wB) {
        int wAAtkAmt = wA.attack();
        int wBBlockAmt = wB.block();

        int dmg2WarB = wAAtkAmt - wBBlockAmt;
        if(dmg2WarB > 0) {
            wB.health = wB.health - dmg2WarB;
        } else dmg2WarB = 0;

        System.out.printf("%s Attacks %s and deals " + "%d Damage\n", wA.getName(), wB.getName(), dmg2WarB);
        System.out.printf("%s has %d Health\n\n", wB.getName(), wB.health);

        try {Thread.sleep(1500);} catch (InterruptedException ex) {};

        if(wB.health <= 0) {
            System.out.printf("%s has Died and %s is " + "Victorious\n", wB.getName(), wA.getName());
            return "Game Over";
        } else return "Fight Again";
    }
}
