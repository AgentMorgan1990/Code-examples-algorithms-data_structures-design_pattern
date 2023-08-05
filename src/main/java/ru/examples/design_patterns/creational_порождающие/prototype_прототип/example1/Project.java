package ru.examples.design_patterns.creational_порождающие.prototype_прототип.example1;

public class Project implements Copyable{

    private long id;
    private String projectName;
    private String sourceCode;

    public Project(long id, String projectName, String sourceCode) {
        this.id = id;
        this.projectName = projectName;
        this.sourceCode = sourceCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }


    @Override
    public Object copy() {
       Project project = new Project(id,projectName,sourceCode);
       return project;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }
}
