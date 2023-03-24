package ru.education.data_structures.tree;




public class Test {
    public static void main(String[] args)  {


        Tree<Integer>tree = new TreeImpl<>();

        tree.add(60);
        tree.add(55);
        tree.add(78);
        tree.add(123);
        tree.add(90);
        tree.add(45);
        tree.add(67);
        tree.add(79);
        tree.add(156);

        tree.display();

        tree.traverse(Tree.TraversMode.PRE_ORDER);
        tree.traverse(Tree.TraversMode.IN_ORDER);
        tree.traverse(Tree.TraversMode.POST_ORDER);

    }
}
