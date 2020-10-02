package StringUtility;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class StringUtilityTest {

    @Test
    public void ReverseStringTest(){
        //Arrange
        StringUtility stringUtility = new StringUtility();
        //Act
        String actual = stringUtility.ReverseString("aBc");
        String expected = "cBa";
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void CapitalizeStringTest(){
        //Arrange
        StringUtility stringUtility = new StringUtility();
        //Act
        String actual = stringUtility.CapitalizeString("aBc");
        String expected = "ABC";
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void LowercaseStringTest(){
        //Arrange
        StringUtility stringUtility = new StringUtility();
        //Act
        String actual = stringUtility.LowercaseString("aBc");
        String expected = "abc";
        //Assert
        assertEquals(expected, actual);
    }
}
