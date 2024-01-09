public class logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Logical AND (&&)
        boolean resultAnd = a && b; 
        System.out.println("a && b: " + resultAnd);

        // Logical OR (||)
        boolean resultOr = a || b; 
        System.out.println("a || b: " + resultOr);

        // Logical NOT (!)
        boolean resultNotA = !a; 
        System.out.println("!a: " + resultNotA);

        boolean resultNotB = !b; 
        System.out.println("!b: " + resultNotB);

        // Combining logical operators
        boolean resultCombination = (a && b) || (!a);  
        System.out.println("(a && b) || (!a): " + resultCombination);
    }
}