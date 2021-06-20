class Swap
{    
     
     public void mswap(int x, int y){
	 x=x+y;
	 y=x-y;
	 x=x-y;
	 System.out.println("Swapped values are "+x+"  "+y);
     }
    
    
     public static void main(String args[]){
	
	 Swap myswap= new Swap();
	 myswap.mswap(5,6);
	 
    }
}
