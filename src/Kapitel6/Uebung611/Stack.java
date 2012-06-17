/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel6.Uebung611;

/**
 *
 * @author Mario
 */
class Stack {

    private int[] stack;
    private int position;
    
    public Stack(int size) 
    {
        stack = new int[size];
        position = 0;
    }

    public int pop()
    {   
        position -= 1;
        return stack[position];
    }
    
    public void push(int number)
    {   
        stack[position] = number;
        position += 1;
    }
    
    public boolean isEmpty()
    {
        if (position == 0)
            return true;
        else
            return false;
    }
    
    public void stackPrint()
    {
        System.out.println("Stack:\n");
        for(int i = 0; i < stack.length; i++)
        {
            System.out.println(stack[i]);
        }
        
    }
}
