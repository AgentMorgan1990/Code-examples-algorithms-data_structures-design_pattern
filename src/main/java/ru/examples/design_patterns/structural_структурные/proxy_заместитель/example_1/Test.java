package ru.examples.design_patterns.structural_структурные.proxy_заместитель.example_1;

public class Test {
    public static void main(String[] args) {
        Project project = new ProxyProject("https//:localhost:9090");
        project.run();
    }
}
