public class Warrior {

    protected String name = "Warror";//protected a filed only this class and its subclasses can access, if marked private then subclasses would not have access
    public int health = 0;// public means this information will be available anywhere
    public int atkMax = 0;
    public int blockMax = 0;

    public Teleports teleportType;

    // to initialize or 'set up' a warrior whenever it is created we need a Constructor
    // Constructors should have the same name as the class


    public Warrior() {
    }

    public Warrior(String name, int health, int atkMax, int blockMax) {
        this.setName(name); // this keyword, reference an object that we do not have a name for
        this.health = health;
        this.atkMax = atkMax;
        this.blockMax = blockMax;
    }

    public int attack() {
        return 1 + (int)(Math.random()* ((atkMax - 1 )+ 1));
    }

    public int block() {
        return 1 + (int)(Math.random()* ((blockMax - 1 )+ 1));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAtkMax() {
        return atkMax;
    }

    public void setAtkMax(int atkMax) {
        this.atkMax = atkMax;
    }

    public int getBlockMax() {
        return blockMax;
    }

    public void setBlockMax(int blockMax) {
        this.blockMax = blockMax;
    }

    public String teleport() {
        return teleportType.teleport();
    }

    public void setTeleportAbility(Teleports newTeleportType) {
        teleportType = newTeleportType;
        }
    }

