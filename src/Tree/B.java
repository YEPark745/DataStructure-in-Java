package Tree;
import java.util.Scanner;
import java.util.Random;


public class B {
	static int flag;
	static class Tree_N{
		int data;
		Tree_N left;
		Tree_N right;
	}
	
	public static Tree_N maxElement(Tree_N maxNode) {
		if(maxNode.right==null) return maxNode;
		else return maxElement(maxNode.right);
	}
	
	public static Tree_N deleteNode(Tree_N root, int value) {
		flag=0;
		if(root==null) return null;
		if(value>root.data)root.right=deleteNode(root.right,value);
		else if(value<root.data)root.left=deleteNode(root.left,value);
		else if(value==root.data) {
			flag=1;
			if(root.left!=null && root.right!=null) {
				Tree_N temp=root;
				Tree_N maxNodeOfLeft=maxElement(temp.right);
				root.data=maxNodeOfLeft.data;
				root.right=deleteNode(root.right,maxNodeOfLeft.data);
			}
			else if(root.left!=null) root=root.left;
			else if(root.right!=null) root=root.right;
			else root=null;
		}
		return root;
		}
		
	public static void inOrder(Tree_N root) {
		if(root==null) return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	static Tree_N insert(Tree_N node, int data) {
		if(node==null) {
			Tree_N n=new Tree_N();
			n.data=data;
			n.left=null;
			n.right=null;
			return n;
		}
		if(data<=node.data) node.left=insert(node.left,data);
		else if(data>node.data)node.right=insert(node.right,data);
		return node;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Random rand=new Random();
		Tree_N node=null;
		
		boolean exit=true;
		System.out.print("1,2,3");
		do {
			System.out.print("What is your choice?: ");
			int choice=in.nextInt();
			switch(choice) {
			case 1: node=insert(node, rand.nextInt(99));
				System.out.println("\nValue inserted.");
				break;
			case 2:System.out.println("Binary tree.");
				inOrder(node);
				break;
			case 3:System.out.print("\nWhich value to delete?");
				inOrder(deleteNode(node,in.nextInt()));
				if(flag==0) 
					System.out.println("\nValue not found.");
				else
					System.out.println("\nValue deleted.");
					break;
			default:exit=!exit;
			}
		}
		while(exit);

	}

}
