import java.util.Scanner;
public class GroceryListExample {

	public static void main(String[] args) {
		//Declare variables
		Scanner sc=new Scanner(System.in);
		
		int numItems=4;
		String[] itemNames= {"apples","banana","bread","milk"};//
		int[] itemQuantities= {3,2,1,2};
		float itemPrices[]= {1.99f,0.99f,2.49f,2.39f};
		
		boolean itemOnSale[]= {false,false,true,true};
		String[] extra=new String[6];
		for(int i=0;i<4;i++) {
			extra[i]=itemNames[i];
		}
		extra[4]= "mango";
		extra[5]="lichu";
		
		itemNames=new String[6];
		
		for(int i=0;i<6;i++) {
			itemNames[i]=extra[i];
		}
		
		for(String x:itemNames) {
			System.out.print(x+" ");
		}
		System.out.println();
		//inserting new element;
		String newArr[]=new String[7];
		int pos=2;
		String s="papaya";
		for(int i=0;i<7;i++) {
			if(i<pos) {
				newArr[i]=itemNames[i];
			}else if(i==pos) {
				newArr[i]=s;
			}else{
				newArr[i]=itemNames[i-1];
			}
		}
		
		itemNames=new String[7];
		for(int i=0;i<7;i++) {
			itemNames[i]=newArr[i];
		}
		
		
		for(String x:itemNames) {
			System.out.print(x+" ");
		}
		
		System.out.println();
//		//Searching an element;
//		System.out.println("\nEnter fruit to search:");
//		String key=sc.next();
//		
//		for(String x:newArr) {
//			if(x==key){
//				System.out.println("element found");
//				break;
//			}
//			
//		}
		//System.out.print("elemnt not found");
		
		Item items[]=new Item[4];
		
		items[0]=new Item();
		items[1]=new Item();
		items[2]=new Item();
		items[3]=new Item();
		
		items[0].names="A";
		items[1].names="B";
		items[2].names="C";
		items[3].names="D";
		
		items[0].quantities=5;
		items[1].quantities=3;
		items[2].quantities=6;
		items[3].quantities=4;
		
		for(Item x:items)
		{
			System.out.print(x.names+" ");
			System.out.println(x.quantities);
		}
		
		
		
		
		
		
		
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		//print the grocery list header
//		System.out.println("Grocery list:");
//		//print each items and its information using for loop
//		
//		for(int i=0;i<numItems;i++) {
//			System.out.print("-"+itemNames[i]+":");
//			System.out.print(itemQuantities[i]+"x");
//			System.out.print("$"+itemPrices[i]+"=");
//			double itemTotal=itemQuantities[i]*itemPrices[i];
//			System.out.print("$"+itemTotal);
//			
//			if(itemOnSale[i])System.out.print("(OnSale!)");
//			System.out.println();
//			
//		}
		

	}

}
