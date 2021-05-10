package application;

public class Smoothie extends Beverage{
	private int numFruit;
	private boolean protine;
	private final double fruitPrice = .5;
	private final double protinePrice = 1.5;
	  
	
	public Smoothie(String n, SIZE s, int nof, boolean ap) {
	super(n, TYPE.SMOOTHIE, s);
	numFruit = nof;
	protine = ap;
	}
	  
	
	public String toString() {
	String s = getBevName() +", " +getSize() +" " +numFruit +" Fruits";
	  
	if (protine) {
	s += " Protein powder";
	}
	  
	s += ", $" +calcPrice();
	  
	return s;
	}
	public boolean equals(Smoothie s) {
	if (super.equals(s) && numFruit==s.getNumOfFruits() && protine==s.getAddProtien()) {
	return true;
	}
	else {
	return false;
	}
	}
	public double calcPrice() {
	double price = super.getBasePrice();
	  
	if (super.getSize() == SIZE.MEDIUM) {
	price += super.getSizePrice();
	}
	else if (super.getSize() == SIZE.LARGE) {
	price += 2 * super.getSizePrice();
	}
	  
	price += numFruit * fruitPrice;
	if (protine) {
	price += protinePrice;
	}
	  
	return price;
	}
	  
	
	public int getNumOfFruits() {
	return numFruit;
	}
	public boolean getAddProtien() {
	return protine;
	}
	public double getFruitCost() {
	return fruitPrice;
	}
	public double getProteinCost() {
	return protinePrice;
	}
	  

	public void setNumOfFruits(int nof) {
	numFruit = nof;
	}
	public void setProteinPowder(boolean ap) {
	protine = ap;
	}
}
