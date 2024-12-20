package nl.heartmates01;

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
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Calculate in FT or MS?\n1. FT\n2. MS");
    int choice = scanner.nextInt();
    
    int distance = 0;
    int time = 0;
    
    if (choice == 1) {
      distance = 1100;
      time = 26400;
    } else if (choice == 2) {
      distance = 343;
      time = 5;
    }
    
    while(true){
      System.out.println("How many seconds are there between the thunder and the lightning? To quit, type '0'.");
      int seconds = scanner.nextInt();
      if(seconds == 0){
        System.out.println("Exiting.");
        System.exit(0);
      } else {
        int distanceResult = seconds * distance;
        int timeResult = seconds * time;
        System.out.println("The lightning is " + distanceResult + " feet away, and will take " + timeResult + " to reach you.");
      }
    }
  }
}
