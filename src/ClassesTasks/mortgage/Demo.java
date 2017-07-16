package ClassesTasks.mortgage;

public class Demo {

    public static void main(String[] args) {

        Buyer[] buyer = new Buyer[10];
        buyer[0] = new Buyer(false, 60_000, 2_000_000, 5_000_000);
        MortCalculator calc2 = new MortCalculator(8.75f, 72f);

        // расчитываем ежемесячный платеж для первого клиента
        //double payment_month = calc2.setMont_pay(buyer[0].getMontly_income());
        calc2.check_verif_payment(buyer[0].isMortgage(), buyer[0].getMontly_income(), buyer[0].getCash());
        System.out.println("\nКлиенту потребуется " + calc2.what_time(buyer[0]) + " месяцев для выплаты ипотеки ");
    /*    System.out.println("Верификация пройдена");
        System.out.println("Верификация не пройдена");
    */
    }
 }


