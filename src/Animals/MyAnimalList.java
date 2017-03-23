package Animals;

/**
 * Created by Asus on 04.03.2017.
 */
public class MyAnimalList {

    private Animal[] animals = new Animal[5];//разнотипный массив
    private  int nextIndex = 0; //увеличиваем его при добавлении туда объекта Animal

    public  void add ( Animal a ) {

        if (nextIndex < animals.length) { // добавляет объект Animal пока массив не заполнится
            animals [nextIndex] = a;
            System.out.println ("Объект Animal добавлен в ячейку " + nextIndex);
            nextIndex ++;// увеличиваем индекс массива, для доступа к следующей ячейке
        }
    }
}

