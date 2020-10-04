package StringUtility;


import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilityTest {
    private StringUtility stringUtility;

    @BeforeEach
    protected void setUp(){
        stringUtility = new StringUtility();
    }
    @Test
    public void ReverseStringTesta(){
        //Act
        String actual = stringUtility.ReverseString("a");
        String expected = "a";
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void ReverseStringTestaB(){
        //Act
        String actual = stringUtility.ReverseString("aB");
        String expected = "Ba";
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void ReverseStringTestaBc(){
        //Act
        String actual = stringUtility.ReverseString("aBc");
        String expected = "cBa";
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void CapitalizeStringTesta(){
        //Act
        String actual = stringUtility.CapitalizeString("a");
        String expected = "A";
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void CapitalizeStringTestaB(){
        //Act
        String actual = stringUtility.CapitalizeString("aB");
        String expected = "AB";
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void CapitalizeStringTestaBc(){
        //Act
        String actual = stringUtility.CapitalizeString("aBc");
        String expected = "ABC";
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void LowercaseStringTesta(){
        //Act
        String actual = stringUtility.LowercaseString("a");
        String expected = "a";
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void LowercaseStringTestaB(){
        //Act
        String actual = stringUtility.LowercaseString("aB");
        String expected = "ab";
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void LowercaseStringTestaBc(){
        //Act
        String actual = stringUtility.LowercaseString("aBc");
        String expected = "abc";
        //Assert
        assertEquals(expected, actual);
    }
}
