package application;

abstract class Beverage {
private String name;
private TYPE type;
private SIZE size;
private final double Price = 2.0;
private final double S_Price = 1.0;
  
public Beverage(String n, TYPE t, SIZE s) {
name = n;
type = t;
size = s;
}
  

public String toString() {
return name +", " +size;
}
public boolean equals(Beverage bev) {
if (name.equals(bev.getBevName()) && type==bev.getType1() && size==bev.getSize()) {
return true;
}
else {
return false;
}
}
  
public String getBevName() {
return name;
}
public TYPE getType1() {
return type;
}
public SIZE getSize() {
return size;
}
public double getBasePrice() {
return Price;
}
public double getSizePrice() {
return S_Price;
}
  
public void setName(String n) {
name = n;
}
public void setType(TYPE t) {
type = t;
}
public void setSize(SIZE s) {
size = s;
}

public abstract double calcPrice();

}