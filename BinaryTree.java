
import  java.util.*;
class Node
{
    int a,b;

    public Node(int item,int key)
    {
        a = item;
        b=key;
    }
}


public class BinaryTree
{
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,i,flag=0;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        Node [] store=new Node[100];
        store[0]=new Node(a,b);
        for(i=0;i<40;i++) {
         store[2*i+1]=new Node(store[i].a+store[i].b,store[i].b);
        store[2*i+2]=new Node(store[i].a,store[i].a+store[i].b);
        }
        for(i=0;i<=80;i++) {
            if ((store[i].a == c) && (store[i].b == d)) {
                flag = 1;
                break;
            }
        }
        if(flag==0)
            System.out.println("false");
        else
            System.out.println("true");
    }
}