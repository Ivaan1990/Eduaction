package threads.test;

import threads.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {

        System.out.print("Введите символ:\nНачать поток 'r'");
        char res = (char) System.in.read();

        boolean begin = false;
        if (res == 'r') {

            System.out.println("Введите 's' если нужно приостоновить");
            begin = true;

            Wait ob = new Wait();
            //Thread.sleep(2000);
/*
            ob.pause();
            Thread.sleep(5000);
            ob.notifyMe();
*/

            char paus = (char) System.in.read();
            if (paus == 's') {
                System.out.println("Чтобы возобновить нажмите 'r'");
                begin = false;
                ob.pause();
//                ob.notifyMe();
                //Thread.sleep(4000);
            }
        }
    }
}

//ob.run();
//System.in.read()
        /*todo wait Не трогаем. Сделать внешнее управление потоком wait с помощью ввода символов
         черз консоль. p - pause, r-resume остальные символы игнорируем*/
