class strBuilder{
    public static void main(String[] args) {
        

        // Sring builder : It resolves the issues such as immutability and increase its performance 

        // Why is it used ?
        // In normal String we cannot change the word by their index But here We can do 

        // Construction of StringBuilder class 

        // 1.StringBuilder();
        // 2.StringBuilder(String str)
        // 3.StringBuilder(int capacity)

        // Declearation of StringBuilder 

        StringBuilder str = new StringBuilder("Hello World"); // Initial Capicity is 16 but can be changed by adding values inside the ()

        // i Want to add World after hello : append (same as javaScript)

        str.append("world");
        System.out.println(str); // Output : Hello world 

        // setCharAt(idx,ch)
        // hello -> mello 

        str.setCharAt(0 , 'm'); // Note : '' this quote should be used 


        //  insert(idx,ch)

        str.insert(1 , 'm');
        System.out.println(str);

        // Delete 
       str.deleteCharAt(2);
       System.out.println(str);


       // reverse

       StringBuilder str2 = new StringBuilder("Yashraj Sahu");
       str2.reverse();
       System.out.println(str2);

       // delete (i , j)

       str2.delete(2, 4);
       System.out.println(str2);
    }
}