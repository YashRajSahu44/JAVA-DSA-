class MaxWealth{
    public static void main(String[] args) {
        
    }

    public int MaximumWealth(int [][]accounts){

        //person = row
        //Account = col
   
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person < accounts.length; person++){
            //When starting a new col take the new sum for that row

            int sum = 0;
            for(int account = 0; account < accounts[person].length; account++){
                sum += accounts[person][account];
            }

            //sum has been found now compare with the sum of previous
            if(sum > ans){
                ans = sum;;
            }
        }
        return ans;
    }
}