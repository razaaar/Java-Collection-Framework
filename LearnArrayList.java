package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    /*
    ArrayList are like normal array but in ArrayList its have dynamic size
    Arraylist get from java.util ke under
    Arraylist make size of n and if n size is filled then it make again size of n + n/2 +1 and copy the element of n into n+n/2+1

     */
    public static void main(String args[])
    {
        List<Integer> list = new ArrayList<>(); // Define ArrayList
        //to add : add(element)
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("List is : " + list );
        //ArrayList always add element at the end of the list
        list.add(50);//This add element 50 at the end of the list
        System.out.println("List at the end  : " + list );

        list.add(1,1000); // TO add element at the particular index
        System.out.println("List element added at the particular index   : " + list );

        List<Integer> newlist = new ArrayList<>();
        newlist.add(10000);
        newlist.add(20000);
        newlist.add(30000);
        list.addAll(newlist); // This will add all the element of newlist to the list
        System.out.println("List added other list   : " + list );
        System.out.println("List element at index 2 : " + list.get(2)); // this will the element at the particular index
        list.remove(1); // This will remove the element at particular index
        System.out.println("List element after remove element at index 1  : " + list);
        list.remove(Integer.valueOf(40)); //This will remove at value at particular index
        System.out.println("List after remvoing the elemetn value 40 is  : " + list);
        list.set(1,1111); //Use to set the value at particular index
        System.out.println("List element after seting the value 011 at index 1   : " + list);
        System.out.println(list.contains(20000)); //Used to check the value is present or not  TC : O(N)
        list.clear(); //to clear the list
        System.out.println("List after clearing the list is " + list);

    }
}
