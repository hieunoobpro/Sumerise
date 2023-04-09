package handle;

import entity.Product;

import java.util.Scanner;
public class ProductHandle {
    public Product createProduct(Scanner scanner, int i){
        System.out.println("Mời b nhập vào tên sp thứ "+(i+1));
        String name = scanner.nextLine();
        System.out.println("Nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap mo ta: ");
        String discription = scanner.nextLine();
        System.out.println("Nhap so luong: ");
        int number = Integer.parseInt(scanner.nextLine());
        return new Product(i,number,name,discription,price);
    }

    public void displayAllProducts(Product[] products){
        for (Product p: products) {
            System.out.println(p);
        }
    }
    public String findProductByName(Product[] products, String name){
        boolean check = false;
        for (Product product: products) {
            if (product.getName().equalsIgnoreCase(name)){
                System.out.println(product);
                check = true;
            }
        }
        if(!check){
            return "Không tìm thấy sản phẩm có tên là: "+name;
        }
        return "Đã tìm thấy sản phẩm";
    }
    public void findByNumber(Product[] products) {
        for (Product product : products) {
            if (product.getNumber() < 5) {
                System.out.println(product);
            } else {
                System.out.println(" ");
            }
        }
    }
    public Product searchID(Product[] products, int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.println(product);
                return product;
            }
        }
        return null;
    }
    public boolean updateProductById(Product product, int number){
        if(product == null) return false;
        else {
            product.setNumber(number);
            return true;
        }
    }
    public void filterByPrice(Product[] products, int option){
        for (Product p: products) {
            if(p.getPrice()<50000 && option==1) System.out.println("San pham can tim la: \n"+p);
            else if(p.getPrice()>=50000 && p.getPrice()<100000 && option==2) System.out.println("San pham can tim la: \n"+p);
            else if(p.getPrice()>100000 && option==3) System.out.println("San pham can tim la: \n"+p);
            else{
                System.out.println("Khong co sp nao");
            }
        }
    }

    public void sortByPrice(Product[] products){
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products.length -1; j++) {
                if(products[j].getPrice() > products[j+1].getPrice()){
                    Product temp =  products[j];
                    products[j] = products[j+1];
                    products[j+1] = temp;
                }
            }
        }
        System.out.println("After Sorting: ");
        for (Product p : products) {
            System.out.println(p);
        }
    }

}
