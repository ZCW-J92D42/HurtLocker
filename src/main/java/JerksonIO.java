import org.apache.commons.io.IOUtils;

public class JerksonIO {



    public String readRawDataToString() throws Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public static String createFormatString() {
        return null;
    }

    public void exportTxt(){

    }

    public static void main(String[] args) throws Exception{
        String output = (new JerksonIO()).readRawDataToString();
        System.out.println(output);
    }
    //tevin was here.
}
