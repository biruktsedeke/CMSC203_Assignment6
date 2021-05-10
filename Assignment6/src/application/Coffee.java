package application;

public class Coffee extends Beverage{
private boolean exShot;
private boolean exSyrup;
private final double shotprice = .5;
private final double syrupPrice = .5;
  

public Coffee(String n, SIZE s, boolean shot, boolean syrup) {
super(n, TYPE.COFFEE, s);
exShot = shot;
exSyrup = syrup;
}
  

public String toString() {
String s = getBevName() +", " +getSize();
  
if (exShot) {
s += " Extra shot";
}
if (exSyrup) {
s += " Extra syrup";
}
  
s += ", $" +calcPrice();
  
return s;
}
@Override
public double calcPrice() {
double price = super.getBasePrice();
  
if (super.getSize() == SIZE.MEDIUM) {
price += super.getSizePrice();
}
else if (super.getSize() == SIZE.LARGE) {
price += 2 * super.getSizePrice();
}
  
if (exShot) {
price += shotprice;
}
if (exSyrup) {
price += syrupPrice;
}
  
return price;
}
public boolean equals(Coffee c) {
if (super.equals(c) && exShot==c.getExtraShot() && exSyrup==c.getExtraSyrup()) {
return true;
}
else {
return false;
}
}
  

public boolean getExtraShot() {
return exShot;
}
public boolean getExtraSyrup() {
return exSyrup;
}
public double getShotCost() {
return shotprice;
}
public double getSyrupCost() {
return syrupPrice;
}
  

public void setExtraShot(boolean shot) {
exShot = shot;
}
public void setExtraSyrup(boolean syrup) {
exSyrup = syrup;
}
}