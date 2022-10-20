package array_stack;

import java.util.Stack;

/**
 *
 * @author Jared Gamutin
 */
public class stack_room {

    Stack  array = new Stack();


public stack_room (){
    
}

void push(int numbers){
    array.add(numbers);
}
 void pull(){
   array.pop();
 } 
         
void view_stack (){
    System.out.println(array);
}
}
