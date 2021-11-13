package Class01c.java;
class CRectangle   
		{
		  private int width;
		  private int height;
		   
       public CRectangle  ()
		{   
    	   this (10,8);
		}
       public CRectangle  (int a,int b)
		{   
   	        width= a;
   	        height= b;
		}
       public void show ()
       {
    	   System.out.println("width="+width+",height="+height);
    	   
       }
	}
public class Class01c{

	public static void main(String[] args) {
		CRectangle a =new CRectangle();
		a.show();
	}
}
