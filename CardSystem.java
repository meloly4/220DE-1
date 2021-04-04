import java.util.*;
import java.lang.*;
import java.io.*;

public class CardSystem {
  static Set<String> present = new HashSet<String>();
  static Hashtable<Integer,String> classList = new Hashtable<Integer,String>();

  public static void swipe(int id) {
    if (classList.containsKey(id)){
      present.add(classList.get(id));
    }
  }

  public String whoWerePresent() {
    if (present.isEmpty()){
      return "No one was here today";
    } else {
      return String.join(", ", present) + " went to class today";
    }
  }

}