package ru.examples.design_patterns.structural_структурные.facade_фасад.example_1;

public class WorkflowFacade {
    private Job job = new Job();
    private Developer developer = new Developer();
    private SprintTracker sprintTracker = new SprintTracker();

    public void startSprint() {
        job.maleJob();
        sprintTracker.startSprint();
        developer.working(sprintTracker);
    }

    public void finishSprint() {
        sprintTracker.finishSprint();
        developer.working(sprintTracker);
    }
}
