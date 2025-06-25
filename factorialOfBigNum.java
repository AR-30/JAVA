//Find factorial of a large number

/*Method 1 - using BigInteger class
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




//Method 2 -
