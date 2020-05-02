import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        BinaryTree obj = new BinaryTree();
        int ch;
        do{
            System.out.println("\n1.Create \n2.Insert \n3.Search an element \n4.LevelOrderTraversal \n5.PreOrderTraversal \n6.InOrderTraversal \n7.PostOrderTraversal \n8.Delete the element \n9.Delete the entire Binary tree \n10.Exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    obj.create();
                    break;

                case 2:
                    System.out.println("Enter the element");
                    int element=sc.nextInt();
                    obj.insert(element);
                    break;

                case 3:
                    System.out.println("Enter the element to search");
                    int value=sc.nextInt();
                    obj.search(value);
                    break;

                case 4:
                    obj.levelOrderTraversal();
                    break;

                case 5:
                    obj.preOrderTraversal(BinaryTree.index);
                    break;

                case 6:
                    obj.inOrderTraversal(BinaryTree.index);
                    break;


                case 7:
                    obj.postOrderTraversal(BinaryTree.index);
                    break;

                case 8:
                    System.out.println("Enter the element you want to delete");
                    int key=sc.nextInt();
                    obj.delete(key);
                    break;

                case 9:
                    obj.deleteBinaryTree();
                    break;

                case 10:
                    System.out.println("Exit!!");
                    break;
            }
        }while(ch!=10);


    }
}
