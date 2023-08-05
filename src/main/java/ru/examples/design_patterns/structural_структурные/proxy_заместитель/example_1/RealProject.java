package ru.examples.design_patterns.structural_структурные.proxy_заместитель.example_1;

public class RealProject implements Project{

    private String url;

    public RealProject(String url) {
        this.url = url;
        System.out.println("Loading project by url "+ url + " ...");
    }


    @Override
    public void run() {
        System.out.println("Start project");
    }
}
