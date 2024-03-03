package application;

import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter the number of products : ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			switch (type) {
			case 'c' :
				products.add(new Product(name, price));
			break;
			case 'u' :
				System.out.print("Manufacture date (DD/MM/YYY) ? ");
				LocalDate date = LocalDate.parse(sc.next(),
							DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				products.add(new UsedProduct(name, price, date));
			break;
			case 'i' : 
				System.out.print("Customs fee: ");
				Double fee = sc.nextDouble();
				products.add(new ImportedProduct(name, price, fee));
			break;
			}

		}
		
		System.out.println();
		System.out.println("PRICE TAGS : ");
		for (Product producto : products) {
			System.out.println(producto.priceTag());	
		}
		
		
		sc.close();
	}

}
