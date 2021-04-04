import java.util.*;

class Main {
  public static void main(String[] args) {

    //Create new instance of CardSystem
    CardSystem s1= new CardSystem();

    //Add everyone that enrolled in the class
    s1.classList.put(527023, "Kamisato Ayaka");
    s1.classList.put(825104, "Albedo Kreideprinz");
    s1.classList.put(263061, "Beidou Crux");
    s1.classList.put(821648, "Chongyun Yang");
    s1.classList.put(123657, "Hu Tao");
    s1.classList.put(781431, "Mona Megistus");

    //Swipe takes card ID as argument
    s1.swipe(781431);
    //Swipe doesn't do anything if an ID is swiped more than once
    s1.swipe(781431);
    //more swiping
    s1.swipe(123657);
    s1.swipe(527023);
    //Swipe doesn't do anything if an ID is not in the class list
    s1.swipe(999999);

    //Check attendance at the end of the day
    System.out.println(s1.whoWerePresent());
  }
}
