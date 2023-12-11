import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroceryItem {
    String name;
    String price;
    String type;
    String expiration;
    Pattern pattern;
    Matcher matcher;

    public GroceryItem(String segment) {
        this.name = extractName(segment);
        this.price = extractPrice(segment);
        this.type = extractType(segment);
        this.expiration = extractExpiration(segment);
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getExpiration() {
        return expiration;
    }

    public String extractName(String segment){
        pattern = Pattern.compile("");
        matcher = pattern.matcher(segment);
        if (matcher.find()){
            return matcher.group(0);
        }
        else {
            return " ";
        }
    }

    public String extractPrice(String segment){
        pattern = Pattern.compile("");
        matcher = pattern.matcher(segment);
        if (matcher.find()){
            return matcher.group(0);
        }
        else {
            return " ";
        }
    }

    public String extractType(String segment){
        pattern = Pattern.compile("");
        matcher = pattern.matcher(segment);
        if (matcher.find()){
            return matcher.group(0);
        }
        else {
            return " ";
        }
    }

    public String extractExpiration(String segment){
        pattern = Pattern.compile("");
        matcher = pattern.matcher(segment);
        if (matcher.find()){
            return matcher.group(0);
        }
        else {
            return " ";
        }
    }
}
