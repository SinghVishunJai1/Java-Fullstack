// code for printing Prime Numbers
class PrimeNumber {
  public static void main(String[] args) {
    int num = 10;
    int i = 2;

    System.out.println("Prime Numbers: ");

    while (i <= num) {
      int j = 2;
      while (j * j <= i) {
        if (i % j == 0) {
          break;
        }
      }

      System.out.println(i);
      j++;
      i++;
    }
  }
}



// code for Checking Prime Number
class PrimeNumber {
  public static void main(String[] args) {
    int num = 6;
    int i = 2;
    boolean check = true;

    while (i * i <= num) {
      if (num % i == 0) {
        System.out.println("Number is Not Prime ");
        check = false;
        break;
      }
      i++;
    }

    if (check == true)
      System.out.println("Number is Prime");
  }
}
