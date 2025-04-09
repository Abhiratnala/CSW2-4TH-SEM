package trees;

class Node {
    int key;
    Node left, right;

    public Node(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}

class BST {
    Node root = null;

    public void insert(int key) {
        root = insert_rec(root, key);
    }

    public Node insert_rec(Node root, int key) {
       Node newnode=new Node(key);
        if (root == null) {
            return newnode;
        }

        
        if (key < root.key) {
            root.left = insert_rec(root.left, key);
        } else {
            root.right = insert_rec(root.right, key);
        }
        return root;
    }
public void inorder() {
        inorder_rec(root);
    }
    public void inorder_rec(Node root) {
        if (root != null) {
            inorder_rec(root.left);
            System.out.print(root.key + " "); // Print node value
            inorder_rec(root.right);
        }
    }
    public void minValue() {
         MinValue_rec(root);
    }
    public void MinValue_rec(Node root) {
    	 while (root.left != null) {
    	        root = root.left;
    	    }
    	  System.out.println(root.key);
      
    }
    void deleteKey(int key) {
    	root=delete_recursive(root,key);
    }
   public Node delete_recursive(Node root,int key) {
    	//tree is empty
    	if(root==null)
    		return root;
    	//traverse the tree
    	if(key<root.key)
    		root.left=delete_recursive(root.left,key);
    	else if(key>root.key)
    		root.right=delete_recursive(root.right,key);
    	else {
    		if(root.left==null && root.right==null)
    			return root=null;
    	//node with 1 child
    	if(root.left==null)
    		return root.right;
    	else if(root.right==null)
    		return root.left;
    	    	//node has 2 v
    	else {
    		root.key=minValue(root.right);
    		root.right=delete_recursive(root.right,root.key);
    	}
    	}
    	return root;
    	}
    	public int minValue(Node root) {
    		int min=root.key;
    		while(root.left!=null)
    		{
    			min=root.left.key;
    			root=root.left;
    		}
    		return min;
    	}
    public void insert_iterative(int key)
    {
    	Node newnode=new Node(key);
    	if(root==null) {
    		root=newnode;
    		return;
    	}
    	Node current=root,parent=null;
    	while(true) {
    		parent=current;
    		if(key<current.key) {
    			current=current.left;
    			if(current==null) {
    				parent.left=newnode;
    				return;
    			}
    		}
    		else { //key<current.key
    			current=current.right;
    			if(current==null) {
    				parent.right=newnode;
    				return ;
    			}
    			
    		}
    		
    	}
    
    }
}

public class BstApp {
    public static void main(String[] args) {
        BST a = new BST();
		/*
		 * a.insert(8); a.insert(4); a.insert(6); a.insert(10); a.insert(3);
		 * a.insert(2);
		 */
        a.insert_iterative(45);
        a.insert_iterative(10);
        a.insert_iterative(90);
        a.insert_iterative(7);
        a.insert_iterative(12);
        a.insert_iterative(50);

        a.inorder(); 
        a.deleteKey(45);
        System.out.println("after deletion");
        a.inorder();
        a.deleteKey(7);
        System.out.println("after deletion");
        a.inorder();
        a.deleteKey(10);
        System.out.println("after deletion");
        a.inorder();
    }
}
