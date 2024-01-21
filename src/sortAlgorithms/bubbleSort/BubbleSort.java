package sortAlgorithms.bubbleSort;

/*
 * @created 16.01.2024/01/2024 - 12:42
 * @project data-structures-and-algorithms
 * @author serafettin.altuntas
 */
public class BubbleSort {

    public static void main(String[] args){

    }
    public static void swap(int[] array, int i, int j){
        if( i== j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
