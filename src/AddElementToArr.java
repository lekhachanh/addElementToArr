import java.util.Scanner;

public class AddElementToArr {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap vao so phan tu cua mang: ");
            size = scanner.nextInt();
        } while (size < 0);
        int arr[] = new int[size];
        System.out.println("nhap cac phan tu cua mang: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("\nMang ban dau: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        int x, index;
        System.out.println("Nhap vao so muon chen: ");
        x = scanner.nextInt();
        System.out.println("nhap vao vi tri muon chen: ");
        index = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (index <= 0 || index >= arr.length - 1) {
                System.out.println("Khong chen duoc phan tu vao mang");
                break;
            } else if (i == index) {
                arr[i] = x;
            }
            System.out.println(arr[i] + " ");
        }

    }
}
