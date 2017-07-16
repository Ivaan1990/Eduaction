package Humans3000;
import static java.lang.System.out;

public class Human {

    private String name;
    private double hungry, wireness;
    private int age;
    private boolean home, job, gender;

    public Human () {

    }

    public Human (String name, double hungry, double wireness,
                  int age, boolean home, boolean job, boolean gender) {


        this.name = name;
        this.hungry = hungry;
        this.wireness = wireness;
        this.age = age;
        this.home = home;
        this.job = job;
        this.gender = gender;

        if (this.gender) {
            out.println ("Male and his name " + name );
        } else {
            out.println("Female and her name " + name);
        }
        if (!home) this.job = false;
    }

    public String getName () {
        return name;
    }

    public int getAge () {
        return age;
    }

    boolean showHome () {
        if (home) return true;
        return false;
    }

    boolean showJob () {
        if (job) return true;
        return false;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public boolean isGender() {
        return gender;
    }

    public double getHungry() {
        return hungry;
    }

    public double getWireness() {
        return wireness;
    }

    public boolean isHome() {
        return home;
    }

    public boolean isJob() {
        return job;
    }
}
