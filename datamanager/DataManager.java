package datamanager;

public class DataManager {
    // Inventory Data [cite: 35, 36, 68, 87-95]
    public static String[] products = {"Rice", "Sugar", "Coffee", "Milk"};
    public static double[] prices = {50.0, 45.0, 30.0, 25.0};
    public static int[] stock = {20, 20, 20, 20}; 

    // Transaction Log Data (Fixed size array) [cite: 20, 21, 52-56]
    public static String[] logProduct = new String[100];
    public static int[] logQty = new int[100];
    public static double[] logTotal = new double[100];
    public static int transactionCount = 0; 
}