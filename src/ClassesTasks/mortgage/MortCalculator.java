package ClassesTasks.mortgage;

public class MortCalculator {

    private final int BANK_RATE_INITIAL_FEE = 1_000_000, BANK_RATE_INITIAL_FEE2 = 2_000_000,
            BANK_RATE_INITIAL_FEE3 = 4_000_000; // требования к первоночальному взносу
    /*
    FEE = обычная
    FEE2 = улучшенная
    FEE3 = ультра улучшенная
    от этих параметров зависит процентная ставка
     */
    private final int BANK_RATE_PAYMENT = 60_000; // требования этого калькулятора от банка somefingBank, по зп в месяц
    private float interest_rate; // процентная ставка
    private float kz; // коэфициент залога
    private int how_wants;

    public MortCalculator(float interest_rate, float kz) {

        this.interest_rate = interest_rate;
        this.kz = kz;

    }

    public void setInterest_rate(float interest_rate) {
        this.interest_rate = interest_rate;
    }

    public double setMont_pay (double mont_pay) {
        //метод расчета ежемесячного платежа, в параметре зп в месяц
        return (mont_pay * this.interest_rate) / this.interest_rate;

    }

    public void setKz(float kz) {
        this.kz = kz;
    }
    public double getKz() {
        return kz;
    }

    public double getInterest_rate() {

        return interest_rate;
    }

    public void check_verif_payment (boolean mortgage, double montly_payment, double cash) {

        // проверка на зарплату
        if (montly_payment >= BANK_RATE_PAYMENT) {
            // пропускаем на следующий шаг
            if (cash >= BANK_RATE_INITIAL_FEE) {

                System.out.println("Вам одобрена программа №1");
                if (mortgage == true) {
                    System.out.println("\n ,а так же бонус за наличие залога");
                }
            } else {

                System.out.println("Обычная программа кредитования");
                if (mortgage == true) {
                    System.out.println("\n ,а так же бонус за наличие залога");
                }
            }
        } else {
            System.out.println("In the mortgage denied");
        }

    }

    public float what_time (Buyer ob) {
        //TODO реализовать метод уточнения точного времени выплати по ипотеке в месяцах
        /*    return (int)(ob.getDesired() / this.interest_rate) / this.kz;
    */return 0;
    }
}
