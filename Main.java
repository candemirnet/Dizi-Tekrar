public class Main {
    static boolean isFind(int [] arr, int value){
        for(int i: arr){
            if(i ==value){
               return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] list = {3,7,3,3,2,9,10,21,1,33,9,1,2,4,4};
        int [] duplicate = new int[list.length];
        int startIndex = 0;

        for(int i =0; i<list.length; i++){
            for(int k = 0; k<list.length; k++){
                if(i!=k && (list[i] == list[k])){

                    if(!isFind(duplicate, list[i])){
                        if(list[i] %2 ==0){
                            duplicate[startIndex++] = list[i];
                        }
                    }
                    break;
                }
            }
        }
        for(int value: duplicate){
            if(value!=0){
                System.out.print("["+ value + "]");
            }
        }
    }
}