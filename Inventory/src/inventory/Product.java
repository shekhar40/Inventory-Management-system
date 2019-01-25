
package inventory;


public class Product {
    
    private int id;
    private String name;
    private float price;
    private String addDate;
    private byte[] image;
    
    public Product(int pid,String pname,float pprice,String paddDate,byte[]pimage)
    {
       
        this.id= pid;
        this.name=pname;
        this.addDate=paddDate;
        this.price=pprice;
        this.image=pimage;
    }
      public int getId(){return id;}
      public String getName(){return name;}
      public float getPrice(){return price;}
      public String getAddDate(){return addDate;}
      public byte[] getImage(){return image;} 
}
