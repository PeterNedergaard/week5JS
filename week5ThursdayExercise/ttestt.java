package week5ThursdayExercise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ttestt {


    public static void main(String[] args) throws IOException {
        URL url = new URL("http://restcountries.com/v3.1/alpha/de");
        HttpURLConnection con = (HttpURLConnection)url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Accept", "application/json;charset=UTF-8");
        Scanner scan = new Scanner(con.getInputStream());
        String jsonStr=null;
        if (scan.hasNext()) {
            jsonStr = scan.nextLine();
        }
        scan.close();
        System.out.println(jsonStr);
        System.out.println("hejhejhejhejhejhejhejhej");
    }
}
