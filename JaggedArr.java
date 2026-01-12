import java.util.Scanner;
class JaggedArr {
 public
  static void main(String[] ars) {
    Scanner sc = new Scanner(System.in);
    int[][] arr = new int[3][];
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Enter the column for " + i + " row : ");
      int col = sc.nextInt();
      arr[i] = new int[col];
      System.out.print("Enter the " + col + " elements: ");
      for (int j = 0; j < col; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    System.out.println("Elements are : ");

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
