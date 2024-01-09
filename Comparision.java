public class Comparision {

  public static void main(String[] args) {
    //numbers
    int[] nums = {1, 2, 3, 4, 5, 6};
    
    float sum = 0;
    
    //compute sum
    int i=0;
    while(i < nums.length) {
      sum += nums[i];
      i++;
    }
    
    //compute average
    float average = (sum / nums.length); 
    
    System.out.println("Average : "+average);
  }
}