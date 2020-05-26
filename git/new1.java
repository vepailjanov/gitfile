package git;

class Main1 {

    public static int[] append(int [] array1, int [] array2){
        int [] newarray = new int[array1.length+array2.length];
        for(int i = 0; i <array1.length; i++){
            newarray[i]=array1[i];
        }
        for(int i = 0; i < array2.length;i++){
            newarray[array1.length]=array2[i];
        }
        return newarray;
    }
}
