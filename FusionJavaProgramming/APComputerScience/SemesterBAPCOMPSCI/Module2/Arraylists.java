import java.util.ArrayList;
public class Arraylists{
    public static void main(String[] args) {
        /*
            **Arraylists must be imported
                import java.util.ArrayList;
            
            Arraylists vs Arrays:

            1. Arraylists are dynamic data structures. While Arrays are static.
                *Arraylists are able to change size, while Arrays are NOT

            2. Arraylists can only store objects/classes. Arrays can store both objects/classes but also primitive data types.
                *Arraylists can store things like ints, doubles, and other primitives but they must be done by using their respective class.

            3. Arraylists have useful methods that can be used to manipulate the list.


            Useful Functions:
                1. Add: 
                    .add(Element e)             - adds a new element to the list at the end
                    .add(int index, Element e)  - adds a new element at a specific index
                2. Remove:
                    .remove(int index)          - removes element at indicated index
                    .remove(Element e)          - removes the first instance of that element
                    .removeAll(Element e)       - removes all instances of that element from the list
                3. Set:
                    .set(int index, Element e)  - sets the value at the indicated index to the new element
                4. Get:
                    .get(int index)             - returns element at given index
                5. Size:
                    .size()                     - returns the size of the ArrayList
                6. IndexOf:
                    .indexOf(Element e)         - returns the index of the first instance of element e
                7. Replace:
                    .replaceAll(Element e)      - replaces all instances of that element
                
        */

        //Creating an ArrayList
        ArrayList<Integer> grades = new ArrayList<Integer>();
        ArrayList<String> names = new ArrayList<String>();
        
        names.add("Bob");
        names.add("Charlie");
        names.add("Bob");

        grades.add(94);
        grades.add(100);
        grades.add(87);
        grades.add(100);
        
        names.remove("Bob");

        for(String s: names){
            System.out.println(s);
        }

        int[] x = new int[5];

    }
}