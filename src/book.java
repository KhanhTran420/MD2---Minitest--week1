public class book {
  String name;
  String author;
  int price;
  int quantity;
  double weight;

  public double getTotalPrice(){
      double result = price*quantity;
      return result;
  }
  public double getTotalWeight(){
      double result = weight*quantity;
      return  result;
  }

  public book(){

  }

  public book (String name, String author, int price, int quantity, double weight){
      this.name = name;
      this.author = author;
      this.price = price;
      this.quantity = quantity;
      this.weight = weight;
  }

  public String getName(){
      return name;
  }
  public void setName(String name){
      this.name = name;
  }

  public  String getAuthor(){
      return author;
  }
  public void SetAuthor(String author){
      this.author = author;
  }

  public int getQuantity() {
        return quantity;
  }
  public void setQuantity(int quantity){
      this.quantity = quantity;
  }

  public  int getPrice(){
      return  price;
  }
  public void setPrice(int price){
      this.price = price;
  }

  public double getWeight(){
      return weight;
  }
  public void setWeight(double weight){
      this.weight = weight;
  }



}
