/**
 * @author SSene - Suzette Senephansiri
 * CIS175 - Spring 2022
 * Feb 9, 2022
 */

package model;

public class CoffeeMenu {

	private String customer;
	private String drink;
	private double price;
	final double TAX = .06;
	private double total;
	
	public CoffeeMenu() {
		// TODO Auto-generated constructor stub
		super();
	}

	public CoffeeMenu(String customer, String drink) {
		super();
		this.customer = customer;
		this.drink = drink;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public double getPrice() {
		final double MOCHA = 2.00;
		final double JAVA = 1.00;
		final double LATTE = 1.50;
		
		if (drink.equals("Mocha")) {
			price = MOCHA;
		}
		else if (drink.equals("Latte")) {
			price = LATTE;
		}
		else {
			price = JAVA;
		}
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double orderTotal() {
		double subTotal = TAX * getPrice();
		total = subTotal + getPrice();
		return total;
	}
	
}
