import java.util.Scanner;

class Str{
    public static void main(String[] args) {
        
        //  Initialisation and declearation
        String name = "Yash";
        System.out.println(name);

        //  Input And Output 

        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // Input : Yash sahu ....  Output : Yash .. It will not print after the space as it don,t read words after space..Therefor we use another method

        String str2 = sc.nextLine(); // will fix the problem 

        //  Lenght And charAt() Method...

        String str3 = "Insa2ne";
        int len = str3.length(); 
        System.out.println(len);  // OUTPUT : 6
    
        // Another method 
        System.out.println(str3.length());

        //   charAt()

        String str4 = "lnct";

        int s = str4.charAt(3);

        System.out.println(str4.charAt(3)); // Output : t

        // indexOf() 

        System.out.println(str4.indexOf('l')); // Output : 0


        // CompareTo()
//ASCII Table
//      0 → Both strings are equal.
//      Positive value (> 0) → str1 comes    after str2.
//      Negative value (< 0) → str1 comes before str2.

        String s1 = "Apple";
        String s2 = "Banana";

        System.out.println(s1.compareTo(s2)); // Output : -ve value (-1)

        //  Contains()

        System.out.println(str4.contains("ln")); // True

        // StartWith()

        System.out.println(str4.startsWith("l")); // True


        // lowercase and upercase 

        System.out.println(str4.toLowerCase()); //lnct

        System.out.println(str4.toUpperCase()); //LNCT

        // concat()

        String a = "abc";
        String b = "def";
        String c = a.concat(b);
        System.out.println(c); // Output : abcdef  



        // Addition of String + String / char /int

        String s5 = "abc";
        s5 += "def"; // s5+"def"
        System.out.println(s5);
        System.out.println("abc" + 10 + 30); // Output : abc1030 


        // Substring (i,j)  and  substring (i)
        // String str = "abcd" Subsets of it will be a,ab,abc,abcd,b,bc,bcd,c,cd,d

         String str6 = "Yashraj";
         System.out.println(str6.substring(0,3)); // Here 0th index will be included but 3rd index will not be included it will be (3-1) hence , Output : Yas
         System.out.println(str6.substring(3)); // Output : hraj

         // Que.  What will be output of the following code 

         //String s = "physics";
         //for(int i = 2; i < 4; i++){
         //System.out.print(s.substring(i));\
         // OUTPUT : ysics sics


         // Que 2.  Given a string S , print all the substrings of s 

         // input s = "abcd"
         //Output : a ab abc abcd b bc bcd c cd d

         String str7 = "abcd";

         for(int i = 0; i <= 3; i++){
            for(int j = i+1; j <= 4; j++){
                System.out.println(str7.substring(i , j) + " ");
            }
         }


         // Interning(pool) anb New
         //Immutability of strings

         //  Performance of String 
         //  performance of string is poor because of immutability , But it can be improved through StringBuilder

         // str.equals() and ==

         // == never use it in Strings , why?

         String st = "Hello";
         String st2 = "Hello";
         String st3 = new String("Hello");

         System.out.println(st == st2); // true : as Both their address are same

         System.out.println(st == st3); // false : Bcz of the different address

         // Equals 

         System.out.println(st.equals(st3)); // true

         }
    }

