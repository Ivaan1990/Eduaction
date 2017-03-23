package magnitTable;

/**
 * Created by Asus on 09.03.2017.
 */

class Of76 extends Clowns {

    public static void main(String[] args) {

        //полиморфный массив i
        Nose[] i = new Nose[3];
        i[0] = new Acts();
        i[1] = new Clowns();
        i[2] = new Of76();

        for ( int x = 0; x < 3; x ++ ) {
            System.out.println ( i[x].iMethod()  + " " + i[x].getClass() );
        }

    }
}
