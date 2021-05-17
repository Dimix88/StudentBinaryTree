package org.example;

public class StudentTree {

    private StudentTreeNode root;

    public StudentTree() {
        this.root = null;
    }

    public void insert(Student value){
        root = insert(root,value);
    }

    public StudentTreeNode insert(StudentTreeNode root, Student value){
        if(root == null){
            root = new StudentTreeNode();
            root.setStudent(value);
            root.setLeft(null);
            root.setRight(null);
        }
        if (value.getName().compareTo(root.getStudent().getName()) > 0){
            StudentTreeNode left = insert(root.getLeft(), value);
            root.setLeft(left);
        }
        if (value.getName().compareTo(root.getStudent().getName()) < 0){
            StudentTreeNode right = insert(root.getRight(), value);
            root.setRight(right);
        }

        return root;
    }
    public void inorder(){
        inorder(root);
    }
    //printing LNR
    private void inorder(StudentTreeNode root){
        if(root != null) {
            inorder(root.getLeft());
            System.out.println(root.getStudent());
            inorder(root.getRight());
        }
    }
    public void delete(Student value){
        root = delete(root, value);
    }
    public StudentTreeNode delete(StudentTreeNode root,Student value){
        if(root == null){
            return root;
        }else if(value.getName().compareTo(root.getStudent().getName()) > 0){
                    root.setLeft(delete(root.getLeft(), value));
        }else if(value.getName().compareTo(root.getStudent().getName()) <0){
            root.setRight(delete(root.getRight(), value));
        }else if(root.getStudent().getName().equals(value.getName())){
                if(root.getLeft() != null){
                    root.setLeft(del(root, root.getLeft()));
                }else{
                    root = root.getRight();
                }
        }
        return root;
    }
    private StudentTreeNode del(StudentTreeNode p, StudentTreeNode r){
        if(r.getRight() != null){
            r.setRight(del(p, r.getRight()));
        }else{
            p.setStudent(r.getStudent());
            r = r.getLeft();
        }
        return r;
    }
    public void postOrder(){
        postOrder(root);
    }
    //printing LRN
    private void postOrder(StudentTreeNode root){
        if(root != null) {
            inorder(root.getLeft());
            inorder(root.getRight());
            System.out.println(root.getStudent());

        }
    }
    public void preOrder(){
        preOrder(root);
    }
    //printing NLR
    private void preOrder(StudentTreeNode root){
        if(root != null) {
            System.out.println(root.getStudent());
            inorder(root.getLeft());
            inorder(root.getRight());


        }
    }
    public void search(String value){
        System.out.println(root = search(root, value));
    }
    public StudentTreeNode search(StudentTreeNode root, String value){

        if(root == null ) {
            System.out.println("Name does not exist");
            return root;
        }
        if(root.getStudent().getName().equals(value)){
            System.out.println("This is the name your looking for:"+root.getStudent().getName());
            return root;
        }

        if(root.getStudent().getName().equals(value)) {

            return search(root.getRight(), value);
        }

        return search(root.getLeft(), value);
    }

}
