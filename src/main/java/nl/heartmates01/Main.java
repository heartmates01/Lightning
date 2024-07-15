package nl.heartmates01;

// Try This 2-1
// Compute the distance to a lightning strike
// whose sound take 7.2 seconds to reach you.

//class Sound {
//
//  public static void main(String[] args) {
//    double dist;
//
//    dist = 7.2 * 1100;
//
//    System.out.println("The lightning is " + dist + " feet away.");
//  }
//}

// Geluid verplaatst zich met ongeveer 343 meter per seconden.
// Wanneer je een flits ziet en telt tot de donder,
// dan weet je de afstand tot de bliksem afstand in meters = tijd in seconden X 343 meter
// We kunnen berekenen hoe snel de bliksem zich verplaatsts door een aantal meet momenten te nemen
// en de afstand te berekenen tussen de donder en de vorige donder en de tijd die daar tussen lag.
// Op deze manier kunnen we berekenen hoe lang het duurt dat de bliksem bij ons is.

// Opdracht:

// Je mag input uitlezen zoals in hoofdstuk 3 wordt aangegeven, maar je mag ook de scanner class gebruiken:
// https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
// Geef de gebruiker de optie om aan te geven of de afstand in "feet" of "km" moet worden aangegeven
// Vraag met een loop steeds om input van de seconden tussen de bliksem en de donder
// Geef na elke input de afstand tot de bliksem weer,
// hoe snel het zich verplaatst en hoe lang het duurt tot het bij ons is

// afstand: ms x 343, ft x 1100
// duurt: ms x 5, ft x 26400


import java.util.Scanner;

class Sound {

  public static void main(String[] args) {

    Scanner FtKm = new Scanner(System.in);
    System.out.println("Calculate in FT or MS?\nFT = 1\nMS = 2");
    int Choice = FtKm.nextInt();

    if (Choice == 1) {
      while (true) {
        Scanner SecondsFT = new Scanner(System.in);
        System.out.println(
            "How many seconds are there between the thunder and lightning? To quit, type '0'.");
        int givenSecondsFT = SecondsFT.nextInt();

        if (givenSecondsFT == 0) {
          System.out.println("Bye!");
          System.exit(0);
        } else {
          int distFT = givenSecondsFT * 1100;
          System.out.println("The lightning is " + distFT + " feet away.");
        }
      }
    } else if (Choice == 2) {
      while (true) {
        Scanner SecondsMS = new Scanner(System.in);
        System.out.println(
            "How many seconds are there between the thunder and lightning? To quit, type '0'.");
        int givenSecondsMS = SecondsMS.nextInt();

        if (givenSecondsMS == 0) {
          System.out.println("Bye!");
          System.exit(0);
        } else {
          int distMS = givenSecondsMS * 343;
          System.out.println("The lightning is " + distMS + " meters away.");
        }
      }
    }
  }
}
