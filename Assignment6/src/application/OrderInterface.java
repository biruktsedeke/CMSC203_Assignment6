package application;


public interface OrderInterface  {

	
		public boolean isWeekend();
		public Beverage getBeverage(int itemNo);
		public void addNewBeverage(String bevName,SIZE size,boolean extraShot,boolean extraSyrup);
		public void addNewBeverage( String bevName,SIZE size);
		public void addNewBeverage( String bevName,SIZE size,int numOfFruits,boolean addPRotien);
		public double calcOrderTotal();
		public int findNumOfBeveType(TYPE type);
		}