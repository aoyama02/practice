public abstract class TangibleAseet{
  private String name;
  private int price;
  private String color;

  public TangibleAseet(String name,int price,String coler){
    this.name = name;
    this.price = price;
    this.color = color;
  }

  public String getName(){ return this.name;}
  public int getPrice(){ return this.price;}
  public String getColor(){ return this.color;}
  
