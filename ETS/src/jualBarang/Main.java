package jualBarang;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;


public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Gson gson = new Gson();

        BufferedReader br = new BufferedReader (new FileReader(".\\src\\penjualanbarang\\Barang.json"));
    }
}
