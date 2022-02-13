import java.util.Scanner;

public class main {
    public static book[] listBook;

    public static void main(String[] args) {
        book[] listBook = new book[5];

        listBook[0] = new book("Naruto","author1",50,5,0.6);
        listBook[1] = new book("Conan", "author2", 40, 4, 0.5);
        listBook[2] = new book("Dragon ball", "author3", 30, 3, 0.4);
        listBook[3] = new book("Attack on Titan", "author4", 40, 3, 0.3);
        listBook[4] = new book("New life", "author5", 40, 4, 0.4);

        int sum = getSumQuantity(listBook);
        System.out.println(sum);

        int totalPrice = getSumPrice(listBook);
        System.out.println("Tổng giá tiền của sách (đơn vị k): " + totalPrice);

        double totalWeight = getSumWeight(listBook);
        System.out.println("Tổng trọng lượng của sách (đơn vị kg): " + totalWeight);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Name: ");
        String bookName = sc.nextLine();
        searchBook(bookName);

    }
    public static int getSumQuantity(book[] books){
        int sum=0;
        for (int i = 0; i < books.length; i++) {
            sum+=books[i].getQuantity();
        }
        return sum;
    }

    public static int getSumPrice(book[] books){
        int total = 0;
        for (int i = 0; i <books.length ; i++) {
            total += books[i].getTotalPrice();
        }
        return total;

    }

    public static double getSumWeight(book[] books){
        int total = 0;
        for (int i = 0; i < books.length ; i++) {
            total += books[i].getTotalWeight();
        }
        return total;
    }


    public static void searchBook(String bookName){
        int index = indexOfBook(bookName);
        if (index==-1){
            System.out.println("Not Found");
        } else {
            System.out.printf("%s have been found. Price : %d k .Quantity: %d left.Weight: " + listBook[index].getWeight() ,bookName,listBook[index].getPrice(),listBook[index].getQuantity());
        }
    }


    public  static int indexOfBook(String bookName){
        int index = -1;
        for (int i = 0; i < listBook.length; i++) {
            if (bookName.equals(listBook[i].getName())){
                index= i;
                break;
            }
        } return index;
    }

}

