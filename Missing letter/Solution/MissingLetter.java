package CodeWars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author m-riad
 */
public class MissingLetter {

    public static char findMissingLetter(char[] array)
    {
      int i = 0;
      while(i < array.length - 1){
        if((int)array[i + 1] != ((int)array[i]) + 1){
          return (char)(array[i] + 1);
        }
        i++;
      }
      return ' ';
    }
    
    @Test
    public void exampleTests() {
        assertEquals('e', findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', findMissingLetter(new char[] { 'O','Q','R','S' }));
    }
}
