public class PrimeNumber { 
     public static boolean primenumber(int  n){
    if (n < 1){
        return false;
    }
    for (int i =2; i < n; i++){
        if (n % i == 0){
            return false;
        }
        
    }
return true;
   }
   public static void main (String args []){
   
    System.out.println(primenumber(13) );
   }
    

        
    }

    
    

    
