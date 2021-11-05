import java.util.ArrayList;

public class MyMain {

    // Counts the number of words that starts with 'a' or 'A'
    public static int startsWithA(ArrayList<String> list) {
        int count = 0;
        for (int i = 0; i<list.size();i++){
            if (list.get(i).charAt(0) == 'a' || list.get(i).charAt(0) == 'A')
                count++;
        }
        return count;
    }

    // Adds a ! to each element in the ArrayList, returns an ArrayList
    public static ArrayList<String> makeExciting(ArrayList<String> list) {
        for (int i = 0; i<list.size();i++){
            list.set(i, list.get(i)+"!");
        }
        return list;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i = 0; i< list1.size(); i++){
            for (int j = 0; j<list2.size(); j++){
                if (list1.get(i) == list2.get(j)){
                    return true;
                }
            }
        }
        return false;
    }


    // METHODS FOR THE HOMEWORK:

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) {
        int count = 0;
        for (int i = 0; i<list.size();i++){
            if(list.get(i)%2 != 0){
                count++;
            }

        }
        return count;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    // Unlike the other methods, the input is an array!
    public static ArrayList<Integer> convertToArrayList(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i<arr.length;i++){
            list.add(arr[i]);
        }
        return list;
    }

    // Takes two **sorted** ArrayLists and merges them together into one big sorted ArrayList
    // (Hint: you may find it useful to use a while loop, as well as the remove() method).
    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // REPLACE WITH YOUR CODE
        return null;
    }



    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list.add("apple");
        list.add("Apple");
        list.add("ardvark");
        list.add("chicken");
        list.add("animal");

        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);

        list2.add(11);
        list2.add(12);
        list2.add(13);
        list2.add(8);
        list2.add(9);
        list2.add(10);

        int [] intArray = {5,6,7,8,9};

        System.out.println(startsWithA(list));
        System.out.println(makeExciting(list));
        System.out.println(checkDuplicates(list1, list2));
        System.out.println(countOdd(list1));
        System.out.println(countOdd(list2));
        System.out.println(convertToArrayList(intArray));





    }
}
