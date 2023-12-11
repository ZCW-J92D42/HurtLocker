import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GroceryListTest {
    @Test
    public void testGetMilk() {
        GroceryList groceryList = new GroceryList();
        groceryList.getMilk().add(new GroceryItem("milk"));

        assertEquals(1, groceryList.getMilk().size());
    }
    @Test
    public void testSetMilk() {
        GroceryList groceryList = new GroceryList();
        assertEquals(0, groceryList.getMilk().size());

        ArrayList<GroceryItem> newMilkList = new ArrayList<>();
        newMilkList.add(new GroceryItem("milk"));
        groceryList.setMilk(newMilkList);

        assertEquals(1, groceryList.getMilk().size());
    }
    @Test
    public void testGetBread() {
    }
    @Test
    public void testSetBread() {
    }
    @Test
    public void testGetCookies() {
    }
    @Test
    public void testSetCookies() {
    }
    @Test
    public void testGetApples() {
    }
    @Test
    public void testSetApples() {
    }
    @Test
    public void testGetError() {
    }
    @Test
    public void testSetError() {
    }
}
