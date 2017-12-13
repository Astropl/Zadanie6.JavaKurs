package Zadanie6;

import java.util.Scanner;

/*Zadanie 6. Napisać program realizujący funkcje prostego kalkulatora,
pozwalającego na wy- konywanie operacji dodawania, odejmowania,
mnożenia i dzielenia na dwóch licz- bach rzeczywistych. Program ma
identyfikować sytuację wprowadzenia błędnego symbolu działania
oraz próbę dzielenia przez zero. Zastosować instrukcję switch do
wykonania odpowiedniego działania w zależności od
wprowadzonego symbolu operacji. Scenariusz działania programu:
a) Program wyświetla informację o swoim przeznaczeniu.
b) Wczytuje pierwszą liczbę.
c) Wczytuje symbol operacji arytmetycznej: +, -, *, /.
d) Wczytuje drugą liczbę.
e) Wyświetla wynik lub - w razie konieczności - informację o niemożności
wy- konania działania.
f) Program kończy swoje działanie po naciśnięciu przez użytkownika
klawisza Enter.
*/

public class JavaKurs
{
    public static void main(String[] args)
    {
        System.out.println("Zapraszm do prostego kalkulatora,\ntroszkę inacej działającego\nbo z lini komend. \nSprawdż sie.");
        Scanner sc = new Scanner(System.in);
        int znakKonca = 0;

        do {




        System.out.println("Prosze podaj pierwszą liczbę naturalną:\n");
        int liczba1 = sc.nextInt();
        System.out.println(" \nWybierz symbol peracji arytmetycznej. \nNacinsij wybraną cyfrę na klawiaturze");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        int wybrana = sc.nextInt();
        char wybranyZnak = 0;
        switch (wybrana)
        {
            case 1:
            {wybranyZnak = '+';
                break;}
            case 2:
            {wybranyZnak = '-';
                break;}
            case 3:
            {wybranyZnak = '*';
                break;}
            case 4:
            {wybranyZnak = '/';
                break;}
        }
        System.out.println("Prosze podaj drugą liczbę naturalną:\n");
        int liczba2 = sc.nextInt();

        if (wybranyZnak=='+')
        {
            System.out.println(" Wynik = " + liczba1 + wybranyZnak + liczba2+" = "+(liczba1+liczba2));
        }
else if (wybranyZnak=='-')
        {
        System.out.println(" Wynik = " + liczba1 + wybranyZnak + liczba2+" = "+(liczba1-liczba2));
        }
        else if (wybranyZnak=='*')
        {
            System.out.println(" Wynik = " + liczba1 + wybranyZnak + liczba2+" = "+(liczba1*liczba2));
        }
        else if (wybranyZnak=='/')
        {
            System.out.println(" Wynik = " + liczba1 + wybranyZnak + liczba2+" = "+(liczba1/liczba2));
        }
        else {
            System.out.println(" Nie moge wykonać działania!!!");
        }
            znakKonca++;

        } while (znakKonca < 2);

        }

    }


