package ru.examples.design_patterns.structural_структурные.facade_фасад.example_1;

public class Test {
    public static void main(String[] args) {
        WorkflowFacade workflowFacade = new WorkflowFacade();
        workflowFacade.startSprint();
        workflowFacade.finishSprint();
    }


}
