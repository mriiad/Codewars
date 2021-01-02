package CodeWars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
* @author m-riad
*/
public class SpinWords {
    
    public String spinWords(String sentence) {
      String [] words = sentence.split(" ");
      for(int i = 0; i < words.length; i++){
        if(words[i].length() >= 5){
            // words[i] = reverseWord(words[i]);
            // We can use another solution : The function reverse() of the StringBuilder
            // String -> StringBuilder -> String
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
      }
      return String.join(" ", words);
    }
    
    @Test
    public void test() {
      assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
      assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
    }
}
