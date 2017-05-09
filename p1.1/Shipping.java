import java.util.Scanner;
public class Shipping{
  public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("What is your name?");
String name = sc.nextLine();
System.out.println("Hello "+ name);

System.out.println("What is the weight of your package");
int weight = Integer.parseInt(sc.nextLine());

if(weight <= 20){
System.out.println("your package is = " + weight +" kg");
}
else{
  System.out.println("your package is too heavy");
}
if(weight <= 2){
  System.out.println("to ship your package it wil cost 2$");
}
else if(weight <= 4){
  System.out.println("to ship your package it wil cost 4,50$");
}
else if(weight <= 8){
  System.out.println("to ship your package it wil cost 8,75$");
}
else if(weight <= 10){
  System.out.println("to ship your package it wil cost 11$");
}
else if(weight <= 15){
  System.out.println("to ship your package it wil cost 17$");
}
else if(weight <= 20){
  System.out.println("to ship your package it wil cost 25$");
}




















  }
}
