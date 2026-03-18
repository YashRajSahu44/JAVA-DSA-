class main{
    public static void main(String[] args) {
        String name = "Yash";
        char target = 's';
        boolean ans = LinarSearch(name, target);
        System.out.println(ans);
    }
    static boolean LinarSearch(String str , char target ){
        if(str.length()==0){
            return false ;
        }
        for(int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;

    }
}
