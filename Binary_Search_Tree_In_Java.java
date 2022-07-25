
public class Binary_Search_Tree_In_Java {
private static TreeNode root;
public class TreeNode{
	public TreeNode right,left;
	public int data;
	public TreeNode(int data){
		this.data = data;
	}
}
public void insert(int value){
	root = Insert(root,value);
}
public TreeNode Insert(TreeNode root,int value){
	if(root==null){
		root = new TreeNode(value);
		return root;
	}
	if(value<root.data){
		root.left = Insert(root.left,value);
		
	}
	if(value>root.data)
	{
		root.right = Insert(root.right,value);
	}
	return root;
}
public void Inorder(){
	Inorder(root);
}
public void Inorder(TreeNode root){
	if(root==null){
		return;
	}
	Inorder(root.left);
	System.out.print(root.data+" " );
	Inorder(root.right);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_Search_Tree_In_Java b = new Binary_Search_Tree_In_Java();
		b.insert(7);
		b.insert(8);
		b.insert(1);
		b.insert(6);
		b.insert(3);
		b.Inorder();
	}
}
