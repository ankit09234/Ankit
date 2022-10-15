import java.util.*;
public class product_recursion {

	int product2(int x, int y) {
		
		if(x<y)
			return product2(x,y);
		else if(y==0)
			return 0;
		else
			return (x+product2(x,y-1)); 
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		product a=new product();
		a.product2(5,6);
		

	}

}
