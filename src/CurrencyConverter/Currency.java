package CurrencyConverter;
import javax.swing.*;
import java.util.Scanner;

/*
 *************** Класс валют
 *
 * В данный момент: доллар/евро/рубли.
 *
 * Реализовать:
 * 1. Пользователь выбирает/вводит, валюту которая у него на руках (выбор сделан в пользу "выбирает")
 *    ...реализовано логическое условте
 *    2. Пользователь вводит число
 * 3. Выбирает в какую валюту конвертировать (доллар/евро/рубли)
 * 4. Программа производит расчет, и выводит результат в конслоль
 */

public class Currency extends JFrame implements IConverter {

    static final String valuta_RUB = "рубли", valuta_DOL = "доллары", valuta_EUR = "евро"; // валюты конвертера
    static final double kurs_DOL = 60, kurs_EUR = 76; // курсы валют

    private int value; // здесь будет хранится сумма, которая у пользователя на руках
    private String choice_value; // тут хранится выбранная валюта
    private JPanel panel;
    private JButton button;

    public Currency() {

        super("Money Converter");
        panel = new JPanel();
        panel.setLayout(null);
        setSize(400, 400);
        button = new JButton("конвертировать");
        button.setSize(150, 30);
        button.setLocation(150, 150);
        panel.add(button);
        setContentPane(panel);
        setVisible(true);

        System.out.println("Ваша валюта, введите на русском пример:\n" +
                  "\n" + valuta_RUB + "\n" + valuta_DOL + "\n" + valuta_EUR);
        Scanner choice_value = new Scanner(System.in);
        this.choice_value = choice_value.nextLine().toLowerCase().trim();

        System.out.print ("Введите сумму которая у вас есть: ");
        Scanner value = new Scanner(System.in);
        this.value = value.nextInt();

    }

    public void go() {

        System.out.println("Имеющиеся валюты: " +
                "\ni." + valuta_RUB +
                "\nii." + valuta_DOL +
                "\niii." + valuta_EUR +
                "\nВведите валюту по русски в которую хотите конвертировать:");
        Scanner sc = new Scanner(System.in);
        String choice_user = sc.nextLine().toLowerCase().trim();

        if (choice_user.equals(valuta_RUB) || choice_user.equals(valuta_DOL) || choice_user.equals(valuta_EUR)) {
            System.out.print("Вы хотите конвертировать:" +
                    "\nсумма = " + value +
                    "\nВалюта: " + choice_user);
        } else {
            System.out.println("Такой валюты нет");
        }

        get_Adjustment(value, choice_user);
    }

    @Override
    public void get_Adjustment (int value, String money_in) {

        double num = 0;
        if (money_in.equals(choice_value)) {
            System.out.println("\nНевозможная операция");
        } else {

            if (money_in.equals(valuta_RUB)) {

            }
            if (money_in.equals(valuta_DOL)) {
                num = value * kurs_DOL;
            }
            if (money_in.equals(valuta_EUR)) {
                num = value * kurs_EUR;
            }
            System.out.print("\nСумма к снятию = " + num);
            // Здесь должна быть окончательная сумма после конвертации
        }
    }

    @Override
    public void gui_go() {

    }

    public static void main(String[] args) {
        Currency c = new Currency();
        c.go();
    }

}
