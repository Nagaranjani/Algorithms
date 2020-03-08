class TreeNode{
	TreeNode leftNode;
	TreeNode rightNode;
	int data;
	TreeNode(int data){
		this.data = data;
	}
	TreeNode(){}

}
public class MergeBST {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t1 = new TreeNode(1);
		t1.leftNode = new TreeNode(3);
		t1.rightNode = new TreeNode(2);
		t1.leftNode.leftNode = new TreeNode(5);
		
		TreeNode t2 = new TreeNode(2);
		t2.leftNode = new TreeNode(1);
		t2.rightNode = new TreeNode(3);
		t2.leftNode.rightNode = new TreeNode(4);
		t2.rightNode.rightNode = new TreeNode(7);
		
		TreeNode t3 = mergeTrees(t1, t2);
		inorder(t3);
	}
    static void inorder(TreeNode node) 
    { 
        if (node == null) 
            return; 
       
        /* first recur on left child */
        inorder(node.leftNode); 
       
        /* then print the data of node */
        System.out.printf("%d ", node.data); 
       
        /* now recur on right child */
        inorder(node.rightNode); 
    } 

	public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) return null;
		if(t1 == null && t2 != null) return t2;
		if(t1 != null && t2 == null) return t1;
        
        int val = (t1 == null ? 0 : t1.data) + (t2 == null ? 0 : t2.data);
        TreeNode newNode = new TreeNode(val);
        
        newNode.leftNode = mergeTrees(t1 == null ? null : t1.leftNode, t2 == null ? null : t2.leftNode);
        newNode.rightNode = mergeTrees(t1 == null ? null : t1.rightNode, t2 == null ? null : t2.rightNode);
        return newNode;
	}
}
