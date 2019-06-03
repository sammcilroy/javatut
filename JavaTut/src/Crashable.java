// Abstract Classes
// similar to interfaces
// used when you don't require all methods to be implemented
// and you would also like to provide the option for methods to have code
public abstract class Crashable {
    boolean carDrivable = true;
    public void youCrashed(){
        this.carDrivable = false;
    }
    public abstract void setCarStrength(int carStrength);
    public abstract int getCarStrength();
}