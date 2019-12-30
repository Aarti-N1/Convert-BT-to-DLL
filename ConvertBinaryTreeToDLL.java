package geeks;

public class ConvertBinaryTreeToDLL {
	public static DNode prev = null, head = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DNode root = new DNode(5); 
        root.left = new DNode(3); 
        root.right = new DNode(6); 
        root.left.right = new DNode(4); 
        root.left.left = new DNode(1); 
        root.right.right = new DNode(8); 
        root.left.left.right = new DNode(2); 
        root.left.left.left = new DNode(0); 
        root.right.right.left = new DNode(7); 
        root.right.right.right = new DNode(9); 
  
        
		convertBtToDll(root);
		DNode cur = head;
		while(cur!=null) {
			System.out.println(cur.data + " ->");
			cur = cur.right;
		}
		
		
	}
	
	public static void convertBtToDll(DNode root) {
		if(root == null)
			return;
		convertBtToDll(root.left);
		if(head == null) {
			head = root;
			prev = head;
		}else {
			prev.right = root;
			root.left = prev;
			prev = root;
		}
		convertBtToDll(root.right);
		return;
	}
}
