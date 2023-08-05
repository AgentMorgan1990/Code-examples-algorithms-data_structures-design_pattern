package ru.examples.algorithms.recursion;

import java.io.File;

public class ShowFiles {

    public static void main(String[] args) {
        File file = new File("/home/sergei/IdeaProjects/Educational projects/algorithm");
        viewFiles(file);
    }

    private static void viewFiles(File file, int level) {
        StringBuilder prefix = new StringBuilder().append("\t".repeat(level));
        if (file.isFile()) {
            System.out.println(prefix + "File: " + file.getName());
        } else {
            System.out.println(prefix + "Dir: " + file.getName());
            level++;
            for (File listFiles : file.listFiles()) {
                viewFiles(listFiles, level);
            }
        }
    }

    private static void viewFiles(File file) {
        viewFiles(file, 0);
    }

}
