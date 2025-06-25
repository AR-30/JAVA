//Find factorial of a large number

/*Method 1 - using BigInteger class
Time Complexity: O(N)
Auxiliary Space: O(1) 
=======================================
        Java BigInteger – Notes
=======================================

📦 Package:
- java.math.BigInteger

🔢 Purpose:
- Handles arbitrarily large integers (beyond int/long limits)

⚙️ Key Characteristics:
- Arbitrary Precision: Size limited only by memory
- Immutable: Any change results in a new BigInteger

🛠️ Initialization:
- From long:
    BigInteger bigInt = BigInteger.valueOf(123L);
- From String:
    BigInteger bigInt = new BigInteger("12345678901234567890");
- Constants:
    BigInteger.ZERO, BigInteger.ONE, BigInteger.TEN

➗ Arithmetic Operations:
- add(BigInteger val)
- subtract(BigInteger val)
- multiply(BigInteger val)
- divide(BigInteger val)
- remainder(BigInteger val)
- pow(int exponent)
- gcd(BigInteger val) // Greatest Common Divisor

🔁 Bitwise Operations:
- and(BigInteger val)
- or(BigInteger val)
- xor(BigInteger val)
- not()
- shiftLeft(int n)
- shiftRight(int n)

⚖️ Comparisons:
- compareTo(BigInteger val) // Returns -1, 0, or 1
- equals(Object obj)

🧮 Primality Utilities:
- isProbablePrime(int certainty)
- nextProbablePrime()

📌 Example:
    BigInteger a = new BigInteger("123456789");
    BigInteger b = new BigInteger("987654321");
    BigInteger sum = a.add(b);
    System.out.println("Sum: " + sum);
*/


import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
        int n = 100;
        BigInteger f = new BigInteger("1");
        for(int i=2; i<=n; i++){
            f = f.multiply(BigInteger.valueOf(i));
        }
        System.out.println(f);
    }
}


//--------------------------------------------------------------------------------------------------------------

/*Method 2 - using ARRAY to store the result
Time Complexity: O(N log (N!)), where O(N) is for loop and O(log N!) is for nested while loop
Auxiliary Space: O(max(digits in factorial))
*/

class Main {
    
    public static int multiply(int i, int[] res, int res_size){
        int carry = 0;
        for(int j=0; j<res_size; j++){
            int product = i*res[j] + carry;
            res[i] = product % 10;
            carry = product / 10;
        }
        while(carry != 0){
            res[res_size] = carry%10;
            carry = carry/10;
            res_size++;
        }
        return res_size;
    }
    
    public static void main(String[] args) {
        int n = 100;
        int[] res = new int[500];
        
        res[0] = 1;
        int res_size = 1;
        
        for(int i=2; i<=n; i++){
            res_size = multiply(i, res, res_size);
        }
        
         System.out.println("Factorial :");
        for (int i = res_size - 1; i >= 0; i--)
            System.out.print(res[i]);
    }
}
