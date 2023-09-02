package empproject1;
import java.util.*;

public class productapp {

	public static void main(String[] args) {
		productRepository d1= null;
		do {
		Scanner x=new Scanner(System.in);
		System.out.println("1:add new product");
		System.out.println("2:show product");
		 System.out.println("3:show product count");
		 System.out.println("4:show company wise product count");
		System.out.println("enter your choice");
		int choice=x.nextInt();
		switch(choice) {
		case 1: System.out.println("enter the id ,name, company,price of product");
		        int id=x.nextInt();
		        String name=x.next();
		        String company=x.next();
		        int price=x.nextInt();
		        product p=new product();
		        p.setid(id);
		      p.setname(name);
		        p.setcompany(company);
		        p.setprice(price);
		         d1=new productRepository();
		        boolean b=d1.isaddproduct(p);
		        if(b) {
		        	System.out.println("product added succesfully....");
		        }
		        else{
		        	System.out.println("product not added");
		        }
		        
			   break;
		case 2:   
			     if (d1==null) {
			    	 System.out.println("ArrayList empty no data found for display");
			     }
			     else {
		          ArrayList al = d1.getproducts();
					
						for (Object obj : al) {
							p = (product)obj;
							System.out.println(p.getid() + "\t" + p.getname() + "\t" + p.getcompany() + "\t" + p.getprice());
						
					}}
					break;
		case 3:
			    if (d1==null)
			    {
			    	 System.out.println("product not added\n" );
			    }
			    else {
			    System.out.printf("total nuber of products=%d\n",d1.gettotalproductcount());
			    }
			    break;
		case 4:  if (d1==null) {
	    	             System.out.println("ArrayList empty no data found for display");
	                  }
	               else {
                           ArrayList al = d1.getproducts();
			                for(Object obj1:al) {
			                	product p1=(product)obj1;
			                //	System.out.printf("%s\n",p1.getcompany());
			                	int c=0;
				              for (Object obj : al) {
					                  p = (product)obj;
					                  System.out.println("p1 = "+p1.getcompany()+"p = "+p.getcompany());
					               if(p1.getcompany().equals(p.getcompany()))
					                       {
					            	  c++;
					            	  
					                     }
			                         
				              //System.out.println("company name   productcount ");
					                 // System.out.printf("%s",p.getcompany());
				              }
				              System.out.printf("%s=%d\n",p1.getcompany(),c);
			              }
	               }
			      break;	    
		case 5:  System.out.println("1:search product by id");
		         System.out.println("2:search product by company");
		         System.out.println("3:search product by name");
		         System.out.println("4:search product by price");
		         System.out.println("enter the choice2"); 
		         int choice2=x.nextInt();
		         switch(choice2){
		         case 1:System.out.println("eneter the id to search the priduct");
		                 int ids=x.nextInt();
		                 d1.showprod(ids);
		                 break;
		         case 2:System.out.println("eneter the company to search the priduct");
		                 String s=x.next();
		                 d1.showprod(s);
		                 break;
		         case 3:System.out.println("eneter the name to search the priduct");        
                         String s1=x.next();
                         d1.showprod(s1);
                         break;
		         case 4:System.out.println("eneter the price to search the priduct");
		                 int p1=x.nextInt();
		                 d1.showprod(p1);
		                 break;
                        		 
		         }
		          
		          
		          
		}
		          
		          
	
		
		}while(true);
	}

}
