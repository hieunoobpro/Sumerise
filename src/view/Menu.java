package view;
import java.util.Scanner;
public class Menu {
    public int menuSelectByPrice(Scanner scanner){
        System.out.println("Bạn muốn tìm sản phẩm theo mức giá nào? ");
        System.out.println("""
                1: Dưới 50.000
                2: Từ 50.000 đến dưới 100.000
                3: Từ 100.000 trở lên""");
        System.out.println("Mời b chọn");
        return Integer.parseInt(scanner.nextLine());
    }
}
