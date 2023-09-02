package empproject1;

public class product {
	private int id;
	private String name;
	private String company;
    private int price;
     
    void setid(int id) {
    	this.id=id;
    	
    }
    int getid() {
    	return id;
    }
    void setname(String name) {
    	this.name=name;
    }
    String getname() {
    	return name;
    }
    void setprice(int price) {
    	this.price=price;	
    }
    int getprice() {
    	return price;
    }
    void setcompany(String company) {
    	this.company=company;
    }
    String getcompany() {
    	return company;
    }

}
