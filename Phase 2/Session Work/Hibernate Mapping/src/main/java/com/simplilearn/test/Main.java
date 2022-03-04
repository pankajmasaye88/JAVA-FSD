package com.simplilearn.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.simplilearn.ecommorce.Color;
import com.simplilearn.ecommorce.Finance;
import com.simplilearn.ecommorce.Product;

public class Main {
	
	public static void main(String[] args) {
		SessionFactory factory= HibernateUtilConfig.getSessionFactory();
		Session session= factory.openSession();
		
		Product p= new Product();
		p.setName("Laptop NEW");
		p.setPrice(new BigDecimal(45000));
		 
		Color color1= new Color("Pink");
		Color color2= new Color("Blue");
		
		List<Color> colors= new ArrayList<Color>();
		colors.add(color1);colors.add(color2);
		p.setColors(colors);
		
		Finance finance1= new Finance("CREDITCARD","EMI ON CITIBANK");
		Finance finance2= new Finance("BANK","40% Finance from SBI BANK");
		Map<Product,Finance> map= new HashMap<>();
		map.put(p, finance1);
		map.put(p, finance2);
		
		p.setFinance(map);
		session.close();
	}
}