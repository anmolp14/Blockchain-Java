public class BinarySearchTree {

Node root;

public void addNode(int key, String value)
{
Node insertNode = new Node(key, value);
if(root == null)
{
	root = insertNode;
}
else
{
Node currentNode = root;Node father;
while(true)
{ 
father = currentNode;
 if (key > currentNode.key)
{
currentNode = currentNode.rightChild;
if (currentNode == null)
{father.rightChild = insertNode;return;}
}
else if (key < currentNode.key)
{currentNode = currentNode.leftChild;
if (currentNode == null)
{ 	father.leftChild = insertNode;return;} } 
else
{System.out.println("The value already exists in the BST !!!");return;}
}
}
}

public void inOrderTraversal(Node givenNode)
{
if(givenNode != null)
{
inOrderTraversal(givenNode.leftChild);
System.out.print(givenNode + " ");
inOrderTraversal(givenNode.rightChild);
}
}

public void preOrderTraversal(Node givenNode) 
{
if(givenNode != null)
{
System.out.print(givenNode + " ");
preOrderTraversal(givenNode.leftChild);
preOrderTraversal(givenNode.rightChild);
}
}

public void postOrderTraversal(Node givenNode) 
{
if(givenNode != null)
{
postOrderTraversal(givenNode.leftChild);
postOrderTraversal(givenNode.rightChild);
System.out.print(givenNode + " ");
}
}

public void reverseInOrderTraversal(Node givenNode)
{
if(givenNode != null)
{
reverseInOrderTraversal(givenNode.rightChild);
System.out.print(givenNode + " ");
reverseInOrderTraversal(givenNode.leftChild);
}
}

public Node findNode(int key) 
{
Node tempNode = root;
while(tempNode.key != key) 
{
if (key < tempNode.key) 
{
	tempNode = tempNode.leftChild;}
else 
{
	tempNode = tempNode.rightChild;
}
if(tempNode == null)
{
	return null;
}
}
return tempNode;
	}

public static void main(String[] args) 
{
BinarySearchTree tree = new BinarySearchTree();
tree.addNode(1, "1");
tree.addNode(6, "6");
tree.addNode(7, "7");
tree.addNode(2, "2");
tree.addNode(4, "4");
tree.addNode(3, "3");
tree.addNode(5, "5");
tree.addNode(9, "8");
tree.addNode(10, "8");
tree.addNode(8, "8");
tree.inOrderTraversal(tree.root);
System.out.println('\n');
tree.preOrderTraversal(tree.root);
System.out.println('\n');
System.out.println(tree.findNode(6));
System.out.println('\n');
tree.postOrderTraversal(tree.root);
System.out.println('\n');
tree.reverseInOrderTraversal(tree.root);
System.out.println('\n');
tree.inOrderTraversal(tree.root);
System.out.println('\n');
	}

}

class Node {
	int key;
	String value;
	
	Node leftChild;
	Node rightChild;
	
	Node(int key, String value) {
		this.key = key;
		this.value = value;
	}
	
	public String toString() {
		return "" + key;
	}
}
