package org.example;

public class StudentTreeNode {
    private Student student;
    private StudentTreeNode left;
    private StudentTreeNode right;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentTreeNode getLeft() {
        return left;
    }

    public void setLeft(StudentTreeNode left) {
        this.left = left;
    }

    public StudentTreeNode getRight() {
        return right;
    }

    public void setRight(StudentTreeNode right) {
        this.right = right;
    }
}
