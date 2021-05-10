package application;


public interface BevShopInterfce {
	int MIN_AGE_FOR_ALCOHOL = 21; //Minimum age for offering alcohol drink
	int MAX_ORDER_FOR_ALCOHOL= 3; /*Maximum number of alcohol beverages
	that can be ordered within an order */
	int MIN_TIME= 8; //earliest time for the order
	int MAX_TIME= 23; //latest time for the order
	int MAX_FRUIT = 5; //Maximum number of fruits that this shop offers for SMOOTHIE beverage
	public boolean validTime(int time);
	public boolean eligibleForMore();
	public boolean validAge(int age);
	public void startNewOrder(int time,DAY day,String customerName,int customerAge);
	public void processCoffeeOrder( String bevName,SIZE size,boolean extraShot,boolean extraSyrup );
	public void processAlcoholOrder( String bevName,SIZE size );
	public void processSmoothieOrder( String bevName,SIZE size,int numOfFruits,boolean addProtien);
	public int findOrder(int orderNo);
	public double totalOrderPrice(int orderNo);
	public double totalMonthlySale();
	public void sortOrders();
	public Order getOrderAtIndex(int index);
	}