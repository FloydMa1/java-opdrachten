import java.util.Scanner;
public class Les5{
  private Beer biertje;
  private Whiskey whiskeytje;
  private Vodka vodkatje;
  private Wijn wijn;
  public static void main(String[] args) {
    	Les5 self = new Les5();
      self.runLesson();


}

  private void runLesson(){
    vodkatje = new Vodka();
    biertje = new Beer();
    wijn = new Wijn();
    biertje.drink();

    whiskeytje = new Whiskey();
    whiskeytje.burn();
    whiskeytje.drink();


    while(!vodkatje.empty()){
      vodkatje.drink();
    }

    biertje.refil();
    vodkatje.refil();
    whiskeytje.refil();

    for(int i = 0; i < 5; i++){
      biertje.drink();
    }


    for(int i = 0; i < 30; i++) {
      vodkatje.nieuwglas();
      vodkatje.burn();
    }


    while(!wijn.empty()){
      wijn.drink();
    }
   }
  }
