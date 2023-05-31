package CollectionFramework;

import java.util.Stack;

public class LearnStack {
    public static void main(String args[])
    {
       /* Stack is first in Last out : Push to add the element
        pop is to make them come out  or remove the element */
        Stack<String> animals = new Stack<>();
        animals.push("Lion ");
        animals.push("Cat");
        animals.push("Horse ");
        animals.push("Dog");
        System.out.println(animals);
        System.out.println("Element at the top is : "+animals.peek());
        animals.pop(); // To delete the element
        System.out.println("Element at the top after Dog is pop : "+animals.peek());

git 
    }
}
