package ClassesTasks.variables;

public class Variables {

    private double first;
    private double second;

    Variables (double first, double second) {

        this.first = first;
        this.second = second;

    }

    public void printVariablse () {

        System.out.println(first);
        System.out.println(second);

    }

    public double getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }

    public double showSalary () {

        return first + second;
    }

    public boolean getMax () {

        if (first > second) {
            return true;
        } else {
            return false;
        }
    }

}
