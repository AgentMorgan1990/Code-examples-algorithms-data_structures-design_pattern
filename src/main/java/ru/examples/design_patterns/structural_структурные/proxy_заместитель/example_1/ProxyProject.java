package ru.examples.design_patterns.structural_структурные.proxy_заместитель.example_1;

public class ProxyProject implements Project {

    private String url;
    private RealProject project;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (project == null) {
            project = new RealProject(url);
        }
        System.out.println("Start project ...");
    }
}
