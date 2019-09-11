public class bt {
    bnode root = null;

    public class bnode {
        bnode lchild;
        bnode rchild;
        bnode parent;
        int value;
        public bnode (int val){ 
            this.value = val;
        }
    }

    public void add_tree(int val){
        bnode newn = new bnode(val);
        if(root == null){ // Empty
            root = newn;
        }
        else{ // traverse the btree
            bnode temp = root;
            while(true){
                if(newn.value >= temp.value && temp.rchild == null){
                    temp.rchild = newn;
                    newn.parent = temp;
                    break;
                }
                else if(newn.value < temp.value && temp.lchild == null){
                    temp.lchild = newn;
                    newn.parent = temp;
                    break;
                }
                else if(newn.value >= temp.value && temp.rchild != null){
                    temp = temp.rchild;
                }
                else if(newn.value < temp.value && temp.lchild != null){
                    temp = temp.lchild;
                }
            }
        }
    }

    public void postorder (bnode node) {
        if(node == null){
            return;
        }
        postorder(node.lchild);
        postorder(node.rchild);
        System.out.println(node.value);
    }

    public void preorder (bnode node) {
        if(node == null){
            return;
        }
        System.out.println(node.value);
        preorder(node.lchild);
        preorder(node.rchild);
    }

    public void inorder (bnode node){
        if(node == null){
            return;
        }
        inorder(node.lchild);
        System.out.println(node.value);
        inorder(node.rchild);
    }
}
