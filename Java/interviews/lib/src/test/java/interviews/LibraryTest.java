/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package interviews;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
    @Test
    void anagramStringTest (){
        AnagramString anagramString= new AnagramString();
        assertTrue(anagramString.isAnagram("Twelve plus one","Eleven plus two"));
        assertTrue(anagramString.isAnagram("Clint Eastwood","Clint Eastwood"));
        assertFalse(anagramString.isAnagram("Software","Swear often"));
    }
    @Test
    void spacesURLTest (){
        SpacesURL url=new SpacesURL();
        assertEquals(url.spacesURL("http://code.org/hour of code.html"),"http://code.org/hour%20of%20code.html"
        );
    }
    @Test
    void integerToRomanTest (){
        IntegerToRoman integerToRoman=new IntegerToRoman();
        assertEquals("MCM",integerToRoman.intToRoman(1900));
        assertEquals("DCXXXIV",integerToRoman.intToRoman(634));
        assertEquals("MMXX",integerToRoman.intToRoman(2020));
    }
    @Test
    void rotateMatrixTest (){
        int matrix[][] = new int[][]{ {1,2,3}, {4,5,6} , {7,8,9} };
RotateMatrix rotateMatrix=new RotateMatrix();
assertArrayEquals(matrix,rotateMatrix.rightRotate(matrix,3));
    }

}
