import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GroceryItemTest {
    String name;
    String price;
    String type;
    String expiration;
    GroceryItem groceryItem;
    @Before
    public void setup(){
         name = "name";
         price = "0.00";
         type = "food";
         expiration = "01-03-2034" ;

        // i  need to set up a constructor.
       groceryItem = new GroceryItem(name, price, type , expiration);
// opps
    }
     // constructor test
     @Test
     public void constructorTest(){
        Assert.assertNotNull(groceryItem);
     }

    @Test
    public void setNameTest(){
         groceryItem.setName("cookies");
        String actual = groceryItem.getName();
         String expected = "cookies";
         Assert.assertEquals(expected, actual);
     }
    // test the obj name


    // test the obj price as a string
    @Test
    public void getPriceTest(){
        String actual = groceryItem.getPrice();
        String expected = "0.00";
        Assert.assertEquals(expected, actual);
    }

    // test the obj type as a string
    @Test
    public void getTypeTest(){
        String actual = groceryItem.getType();
        String expected = "food";
        Assert.assertEquals(expected, actual);
    }

    // test the obj expiration  as a string
    @Test
    public void getExpirationTest(){
        String actual = groceryItem.getExpiration();
        String expected = "01-03-2034";
        Assert.assertEquals(expected, actual);

    }


}
