class CRectangle   
		{
		  private int width;
		  private int height;
		   
       public CRectangle  (int w, int h)
		{ 
			width = w;
			height = h;
		}
       public void show ()
       {
    	   System.out.println("width="+width+",height="+height);
    	   
       }
	}
public class Class01{

	public static void main(String[] args) {
		CRectangle a =new CRectangle(3,4);
		a.show();
	}
}
