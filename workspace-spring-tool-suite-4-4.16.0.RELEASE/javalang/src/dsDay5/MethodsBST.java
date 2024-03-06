package dsDay5;
//create class TreeNode
	class TreeNode{
		//data,left,right child
		int data;
		TreeNode left,right;
		//create constructor
		public TreeNode(int a) {
			data=a;
			left=right=null;
			System.out.print(data+",");
		}
	}
	public class MethodsBST{
		//member variables 
		private Object root;
		
		public MethodsBST(){
			root=null;
		}
		//insert method
		
		public void insert(int data) {
			root=insert(root,data);
		}
		private TreeNode insert(TreeNode root, int data) {
			// TODO Auto-generated method stub
			//check node is null
			if (root==null) {
				//initialize node=root
				root=new TreeNode(data);
			}
			if(data<root.data) {
				root.left=insert(root.left,data);
			}
			else if(data>root.data) {
				root.right=insert(root.right,data);
			}
			return root;
		}
		public void get(int data) {
	          root=get(root,data);
		}
        private MethodsBST get(TreeNode root, int data) {
        	if(root.data==data) {
        		return this;
        	}
        	if(data<root.data) {
        		return leftchild.data;
        	}
	
        	return get(root,data);
        		
        	}
        
        
       

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
