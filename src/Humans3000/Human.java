package Humans3000;

public class Human {

    private String name;
    private char male = 'M', female = 'F';
    private double hungry, wireness;
    private int age;
    private boolean home, job;

    public Human () {

    }

    public Human (String name, char male, double hungry,
           double wireness, int age, boolean home, boolean job) {

        this.name = name;
        this.male = male;
        this.hungry = hungry;
        this.wireness = wireness;
        this.age = age;
        this.home = home;
        this.job = job;

        if (!home) {
            this.job = false;
        }

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

    public char getMale() {
        return male;
    }

    public char getFemale() {
        return female;
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
