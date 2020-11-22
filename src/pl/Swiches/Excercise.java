package pl.Swiches;

import java.util.Scanner;

public class Excercise {
    Scanner scan = new Scanner(System.in);


     protected void HogwardHouse(){
         String house = scan.nextLine();
         switch (house){
             case "gryffindor":
                 System.out.println("bravery");
                 break;
             case "hufflepuff":
                 System.out.println("loyalty");
                 break;
             case "slytherin":
                 System.out.println("cunning");
                 break;
             case "ravenclaw":
                 System.out.println("intellect");
                 break;
             default:
                 System.out.println("not a valid house");

         }
     }

     protected void moving(){
         int n = scan.nextInt();
         switch (n){
             case 1:
                 System.out.println("move up");
                 break;
             case 2:
                 System.out.println("move down");
                 break;
             case 3:
                 System.out.println("move left");
                 break;
             case 4:
                 System.out.println("move right");
                 break;
             case 0:
                 System.out.println("do not move");
                 break;
             default:
                 System.out.println("error!");

         }
     }

     protected void maleviaRooms(){
         String room = scan.nextLine();
         double wynik = 0;
         switch (room){
             case "triangle":
                 double a = scan.nextDouble();
                 double b = scan.nextDouble();
                 double c= scan.nextDouble();
                 double p = (a+b+c)/2;
                 double licznik = p*(p-a)*(p-b)*(p-c);
                  wynik = Math.sqrt(licznik);
                 System.out.println(wynik);
                 break;
             case "circle":
                 double r = scan.nextDouble();
                  wynik = r*r*3.14;
                 System.out.println(wynik);
                 break;
             case "rectangle":
                  a = scan.nextDouble();
                  b = scan.nextDouble();
                  wynik = a*b;
                 System.out.println(wynik);
         }
     }
}
