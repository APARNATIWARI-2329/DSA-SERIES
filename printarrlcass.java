class Array{
    int[] num = {1 , 2 ,3 , 4};
    int length(){
        return num.length;
    }

    int get(int index){
        return num[index];
    }

    int remove(int index){
        int[] num = {1,2,3,4,5};
        int removedElement = num[index];
        for(int i=index; i<num.length-1; i++){
            num[i] = num[i+1];
        }
        return removedElement;
    }
}


public class printarrlcass {
    public static void main(String[] args) {
        Array arr = new Array();

        System.out.println("length of arr: " + arr.length());
        
        System.out.println("Element at index 0: " + arr.get(0));

        System.out.println("removing and printing the last element: " + arr.remove(arr.length()-1));
    }
}
