class declearation{
    public static void main(String[] args) {
        
        // There are three ways of declearing an array 

        //1.Declearation + Memory allocation
        int[] arr = new int[5];

        // 2.Decleartion + Instialization
        int [] arr = {1,2,3,4,5};

        // 3.Seprate declearation and assignment
        int[]arr;
        arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30; 
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;
        
    }
}
