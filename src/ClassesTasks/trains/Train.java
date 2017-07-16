package ClassesTasks.trains;

public class Train {

    private String finalDest;
    private int numberOfTrain;
    private int time;

    Train() {}

    Train (String finalDest, int numberOfTrain, int time) {

        this.finalDest = finalDest;
        this.numberOfTrain = numberOfTrain;
        this.time = time;

    }

    public String getFinalDest() {
        return finalDest;
    }

    public int getNumberOfTrain() {
        return numberOfTrain;
    }

    public int getTime() {
        return time;
    }

    public void getInfoaboutTrain(Train ob, int number) {
    // метод для ввода номера поезда с клавиатуры

        System.out.print("\nПоезд под номером " + number);
        System.out.print(", едет до " + ob.finalDest);
        System.out.print(", время отправления " + ob.time);

        if (ob.time > 12) {
            System.out.print(":00 PM");
        } else {
            System.out.print(":00 AM");
        }
    }

    public void sortFinalDest (Train train) {
     // сортируем поезда по пункту назначения

        String[] tableMaster = new String [8];
        for (int i = 0; i < tableMaster.length; i++) {

            tableMaster[i] = train.getFinalDest();
            System.out.println(tableMaster[i]);
        }

    }

}
