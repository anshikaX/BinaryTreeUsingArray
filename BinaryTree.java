import java.util.Scanner;
public class BinaryTree
{
    static int binaryTree[];
    static int index=1;
    static int lastUsedIndex=0;
    boolean flag=false;

    Scanner sc = new Scanner(System.in);

    //Creating a Binary Tree
    public void create()
    {
        System.out.println("Enter the size");
        int size=sc.nextInt();
        binaryTree=new int[size];

    }

    //Insert the element in Binary Tree
    public void insert(int element)
    {
        if(lastUsedIndex==binaryTree.length-1)
        {
            System.out.println("Array is full");
        }
        else
        {
            lastUsedIndex++;
            binaryTree[lastUsedIndex]=element;
        }
    }

    //To search for an element
    public void search(int element)
    {
        if(!(lastUsedIndex<index))
        {
            for (int i = index; i <= lastUsedIndex; i++)
            {
                if (binaryTree[i] == element)
                {
                    flag=true;
                    break;
                }

            }
            if(flag)
            {
                System.out.println("Element exists");
            }
            else
            {
                System.out.println("Element doesn't exist.");
            }
        }

    }

    //Level Order Traversal
    public void levelOrderTraversal()
    {
        if(!(lastUsedIndex<index))
        {
            for (int i = index; i <= lastUsedIndex; i++)
            {
                System.out.print(binaryTree[i] + " ");
            }
        }
    }

    //PreOrder Traversal
    public void preOrderTraversal(int index)
    {
        if(lastUsedIndex>=index)
        {
            System.out.print(binaryTree[index] + " ");
            preOrderTraversal(2 * index);
            preOrderTraversal(2 * index + 1);
        }

    }

    //InOrder Traversal
    public void inOrderTraversal(int index)
    {
        if(!(lastUsedIndex<index))
        {
            inOrderTraversal(2 * index);
            System.out.print(binaryTree[index] + " ");
            inOrderTraversal(2 * index + 1);
        }
    }


    //Post Order Traversal
    public void postOrderTraversal(int index)
    {
        if(!(lastUsedIndex<index))
        {
            postOrderTraversal(2 * index);
            postOrderTraversal(2 * index + 1);
            System.out.print(binaryTree[index] + " ");
        }

    }

    //Delete the element from the Binary Tree
    public void delete(int element)
    {
        if(lastUsedIndex<index)
        {
            System.out.println("Tree is empty");
        }
        else
        {
            for(int i=index;i<=lastUsedIndex;i++)
            {
                if(binaryTree[i]==element)
                {
                    binaryTree[i]=binaryTree[lastUsedIndex];
                    flag=true;
                    break;

                }
            }
            if(flag)
            {
                lastUsedIndex--;

            }
            else
            {
                System.out.println("Value doesn't exist.");
            }

        }

    }

    //To delete the entire Binary Tree
    public void deleteBinaryTree()
    {
        binaryTree=null;
    }



}
