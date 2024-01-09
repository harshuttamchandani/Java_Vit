	public class AutoInc {

    public static void main(String[] args) {
    
        int a = 5;
        System.out.println("Original value of a : " + a);
        System.out.println();

        System.out.println("After using pre-increment value of a : " + ++a); 
        System.out.println("After using post-increment value of a : " + a++);
        System.out.println();

        System.out.println("After completing post-increment operation value of a : " + a);
        System.out.println();

        System.out.println("After using pre-decrement value of a : " + --a); 
        System.out.println("After using pre-decrement value of a : " + a--); 
        System.out.println();

        System.out.println("After completing pre-decrement operation value of a : " + a);
    }
}
