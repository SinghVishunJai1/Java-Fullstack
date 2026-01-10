import java.util.Scanner;
class ArrayPractice {
 public
  static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size: ");
    int size = sc.nextInt();
    double[] arr = new double[size];  // Size can be Integer Max value
                                      // 2147483647
    System.out.println("Enter the elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextDouble();
    }

    System.out.println("Elements are: ");
    for (double j : arr) {
      System.out.print(j + " ");
    }
    System.out.println();

    System.out.print("Sum of Elements are : ");
    double sum = 0.0;
    for (int i = 0; i < size; i++) {
      sum += arr[i];
    }
    System.out.println(sum);

    double avg = sum / size;
    System.out.printf("Average of arr is : %.3f%n", avg);
  }
}
