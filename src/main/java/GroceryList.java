
import java.util.ArrayList;

public class GroceryList extends ArrayList<ArrayList<GroceryItem>> {

    ArrayList<GroceryItem> Milk;
    ArrayList<GroceryItem> Bread;
    ArrayList<GroceryItem> Cookies;
    ArrayList<GroceryItem> Apples;

    public GroceryList() {
        this.Milk = new ArrayList<>();
        this.Bread = new ArrayList<>();
        this.Cookies = new ArrayList<>();
        this.Apples = new ArrayList<>();
    }

    public ArrayList<GroceryItem> getMilk() {return Milk;}
    public void setMilk(ArrayList<GroceryItem> milk) {Milk = milk;}
    public ArrayList<GroceryItem> getBread() {return Bread;}
    public void setBread(ArrayList<GroceryItem> bread) {Bread = bread;}
    public ArrayList<GroceryItem> getCookies() {return Cookies;}
    public void setCookies(ArrayList<GroceryItem> cookies) {Cookies = cookies;}
    public ArrayList<GroceryItem> getApples() {return Apples;}
    public void setApples(ArrayList<GroceryItem> apples) {Apples = apples;}
}

