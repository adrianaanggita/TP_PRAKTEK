package penjualanBarang;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;


public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("B.json"));
        } catch (FileNotFoundException e) {
            // Error
            e.printStackTrace();
            return;
        }

        //parse json into Product array class
        Gson gson = new Gson();
        product[] json = gson.fromJson(bufferedReader, product[].class);

        System.out.println("ProductName | Quantity | Weight | Destination | Service Value | Total");
        for(product p : json) {
            System.out.println(p.productName + " | " + p.quantity + " | " +
                    p.weight + " | " + p.city.destination + " | " +
                    p.servicePackage.service + " " + p.servicePackage.value + " | " +
                    (p.priceItem*p.quantity + p.servicePackage.value));
        }
}
