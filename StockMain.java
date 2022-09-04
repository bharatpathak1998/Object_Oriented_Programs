import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StockMain {

    public static void main(String[] args) throws IOException, JSONException {
        String data = new String(Files.readAllBytes(Paths.get("Stock.json")));

        JSONArray jsonArray = new JSONArray(data);
        for(int i=0; i<jsonArray.length(); i++) {

            String str = jsonArray.get(i).toString();
            JSONObject object1 = new JSONObject(str);

            String stockName = (String) object1.get("StockName");
            int numberOfShare = (int) object1.get("NumberOfShare");
            int sharePrice = (int) object1.get("SharePrice");

            float stockValue = numberOfShare * sharePrice;

            System.out.println("\nStock Name : " + stockName);
            System.out.println("Number Of Share : " + numberOfShare);
            System.out.println("Share Price : " + sharePrice);
            System.out.println("Total Stock Value Of " + stockName + " : " + stockValue);
        }
        System.out.println("\n"+jsonArray);
    }
}
