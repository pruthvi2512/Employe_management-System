package empproject1;
import java.util.*;

public class productRepository {
	static ArrayList al=new ArrayList();
	 public boolean isaddproduct(product p) {
		 boolean b=al.add(p);
		 if(b) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	
      public ArrayList getproducts() {
    	  return al;
      }
      public int gettotalproductcount() {
    	  return al.size();
      }
      public  void showcompanywiseproductcount() {
    	  
      }
      public void  showprod(int ids) {
    	  for(Object obj:al) {
    		  product p=(product)obj;
    		  if((p.getid()==ids)||(p.getprice()==ids))
    		  {
    			  System.out.printf("%d\t\t%s\t\t%s\t\t%d\n",p.getid(),p.getname(),p.getcompany(),p.getprice());
    		  }
    	  }
    	  
      }
      public void showprod(String s) {
    	  for(Object obj:al) {
    		  product p=(product)obj;
    		  if((p.getcompany().equals(s))||(p.getname().equals(s)))
    		  {
    			  System.out.printf("%d\t\t%s\t\t%s\t\t%d\n",p.getid(),p.getname(),p.getcompany(),p.getprice());
    		  }
    	  }
    	  
      }
      
}
