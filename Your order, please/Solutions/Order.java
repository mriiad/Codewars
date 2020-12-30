package CodeWars.Order;

public class Order {
    
    public static String order(String words) {
      String [] s = words.split(" ");
      
      for(int i = 0; i < s.length - 1; i++){
        for(int j = i + 1; j < s.length; j++){
          String temp = s[j].replaceAll("[a-zA-Z]", "");
          int order_j = Integer.parseInt(temp);
          // We know that values are from 1 to 9 and i start from 0
          if(order_j == i+1){
            // Swap operation
            String tempSwap = s[j];
            s[j] = s[i];
            s[i] = tempSwap;
          }
        }
      }
      return String.join(" ", s);
   }
}