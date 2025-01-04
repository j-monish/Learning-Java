import java.util.*;
class PracticeArrayList {
    public static void main(String[] args){
       ArrayList<Integer> list_1 = new ArrayList<Integer>();
    //    ArrayList<String> list_2 = new ArrayList<String>();
    //    ArrayList<Boolean> list_3 = new ArrayList<Boolean>();

    // Add single element to the end of list
    list_1.add(0);
    list_1.add(3);
    System.out.println(list_1);

    // Get element at a specific index from the list
    int element =  list_1.get(0);
    System.out.println(element);

    // Add element to a specific index in the list
    list_1.add(2,4);

    // Add multiple elements to the list
    Collections.addAll(list_1, 1, 2, 3);
    // System.out.println(list_1);

    // Update a list element
    list_1.set(2,7);
    // System.out.println(list_1);

    // Remove element from the list by its index
    list_1.remove(2);
    System.out.println(list_1);

    // Get size of the list
    int size = list_1.size();
    System.out.println(size);



    }
    
}
