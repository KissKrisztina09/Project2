package labor6_2;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String name = new String("Kiss Krisztina");
        StackInheritance stack1 = new StackInheritance(name.length());
        for(int i=0; i<name.length();++i){
            stack1.push(name.charAt(i));
        }
        while(!stack1.isEmpty()){
            System.out.print(stack1.top());
            stack1.pop();
        }
        System.out.println();
        StackInheritance stack2 = new StackInheritance(10);
        for(int i=10; i<=100; i+=10){
            stack2.push(i);
        }
        //igy tudunk torolni az arrayList kozeperol is, de a stack tipusnal ezt nem lehetseges
        stack2.remove(5);
        stack2.remove(6);

        while(!stack2.isEmpty()){
            System.out.print(stack2.top()+" ");
            stack2.pop();
        }
        System.out.println();

    }
}
