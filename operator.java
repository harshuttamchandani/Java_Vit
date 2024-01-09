public class operator {

  public static void main(String args[]) {
    int a = 10, b = 5;
    Integer aa = new Integer(a);
    Integer bb = new Integer(b);

    System.out.println("a > b : " + (a > b)); // true
    System.out.println("a < b : " + (a < b)); // false
    System.out.println("a >= b : " + (a >= b)); // true
    System.out.println("a <= b : " + (a <= b)); // false
    System.out.println("a == b : " + (a == b)); // false
    System.out.println("a != b : " + (a != b)); // true
		
    // objects support == and != operators
    System.out.println(aa == bb); // false
    System.out.println(aa != bb); // true
  }
}