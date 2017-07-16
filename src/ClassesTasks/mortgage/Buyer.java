package ClassesTasks.mortgage;

public class Buyer {

    private boolean mortgage; // есть ли у заемщика закладная true есть
    private double montly_income; // зп в месяц
    private double cash; // первоночальный взнос
    private int desired; // сколько денег ему требуется

    public Buyer (boolean mortgage, double montly_income, double cash, int desired) {

        this.mortgage = mortgage;
        this.montly_income = montly_income;
        this.cash = cash;
        this.desired = desired;

    }

    public int getDesired() {
        return desired;
    }

    public double getMontly_income() {
        return montly_income;
    }

    public boolean isMortgage() {
        return mortgage;
    }

    public double getCash() {
        return cash;
    }

}
