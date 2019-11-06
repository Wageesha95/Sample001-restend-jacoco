package Demo;

public class MyClass {

	public int max (int x, int y){
		
		if(x>y) {
			
			System.out.println("Upper branch executing....");
			return x;
	
		}else
			System.out.println("Lower branch executing....");
			return y;
		
		
		
	}
	
	public int min(int x, int y)
	{
		return Math.min(x, y);
	}

}
