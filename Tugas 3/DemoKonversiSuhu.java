/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author Bintang Danuarta
 */
public class DemoKonversiSuhu {
    public static void main(String[] args) {
        double celcius = 40;

        double fahrenheit = KonversiSuhu.celciusToFahrenheit(celcius);
        System.out.println("Suhu Celcius: " + celcius + " °C\n" + "Konversi menjadi Fahrenheit: " + fahrenheit + " °F\n");

        double reamur = KonversiSuhu.celciusToReamur(celcius);
        System.out.println("Suhu Celcius: " + celcius + " °C\n" + "Konversi menjadi Reamur: " + reamur + " °R\n");

        reamur = KonversiSuhu2.fahrenheitToReamur(fahrenheit);
        System.out.println("Suhu Fahrenheit: " + fahrenheit + " °F\n" + "Konversi menjadi Reamur: " + reamur + " °R");

    }
}
