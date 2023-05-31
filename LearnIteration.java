package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnIteration {
    public static void main(String args[])
    {
        // TO traverse the list
        List<Integer> newerlist = new ArrayList<>();
        newerlist.add(10);
        newerlist.add(20);
        newerlist.add(30);
        newerlist.add(50);
        newerlist.add(60);
        newerlist.add(100);
        // Using For Loop
        for(int i=0;i<newerlist.size();i++) //list.size() : tell no of size of the list
        {
            System.out.println(" The List element are : "+ newerlist.get(i));
        }
        //Using for Each Loop
        for(Integer element : newerlist)
        {
            System.out.println("List element using for each :"+ element);
        }

        //Using Iterator
        //list.Iterator return us the iterator and it has alot of functionality
        Iterator<Integer> it = newerlist.iterator();
        while(it.hasNext()) //hasnext() whether there is next element or not it tell us
        {
            System.out.println("Iterator element "+ it.next());
        }



    }

}
