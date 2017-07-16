package ClassesTasks.trains;

public class TestTrain implements Runnable{

    Thread t;

    public TestTrain () {
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {

        Train[] trains = new Train[8];

        trains[0] = new Train("Samara", 3, 12);
        trains[1] = new Train("St.Peterburg", 2, 9);
        trains[2] = new Train("Kazan'", 7, 5);
        trains[3] = new Train("Kaliningrad", 1, 15);
        trains[4] = new Train("Astrahan'", 12, 8);
        trains[5] = new Train("Kaliningrad", 8, 14);
        trains[6] = new Train("Kazan'", 13, 14);
        trains[7] = new Train("St.Peterburg", 18, 12);

        /*System.out.print ("Введите номер поезда ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        boolean haveNumber = true;
        for (int i = 0; i < trains.length; i++) {

            if (number == trains[i].getNumberOfTrain()) {
                trains[i].getInfoaboutTrain(trains[i], number);
                haveNumber = false;
            }
        }
        if (haveNumber == true) System.out.println("поездов под таким номером нет");
    }*/
        String[] sortFinalDest = new String[trains.length];
        for (int i = 0; i < trains.length; i++) {

            sortFinalDest[i] = trains[i].getFinalDest();
            System.out.println(sortFinalDest[i]);

        }

        System.out.println();
        try {
            for (int i = 0; i < sortFinalDest.length; i++) {
                if (sortFinalDest[i].charAt(0) < sortFinalDest[i + 1].charAt(0)) {
                    String temporarily = sortFinalDest[i];
                    sortFinalDest[i] = sortFinalDest[i + 1];
                    sortFinalDest[i + 1] = temporarily;
                }
                System.out.println(sortFinalDest[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {}
    }
}

