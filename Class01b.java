package Class01b.java;
class CRectangle   
		{
		  private int width;
		  private int height;
		   
       public CRectangle  ()
		{ 
			width =10 ;
			height = 8;
		}
       public void show ()
       {
    	   System.out.println("width="+width+",height="+height);
    	   
       }
	}
public class Class01b{

	public static void main(String[] args) {
		CRectangle a =new CRectangle();
		a.show();
	}
}
