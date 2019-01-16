package com.smalaca.memento.editor;

import com.smalaca.memento.domain.Project;
import com.smalaca.memento.domain.ProjectRepository;
import com.smalaca.memento.domain.ProjectSnapshot;

import java.util.LinkedList;

public class ProjectEditor {
    private final LinkedList<ProjectSnapshot> snapshots = new LinkedList<>();
    private final ProjectRepository projectRepository;
    private final Project project;

    public ProjectEditor(ProjectRepository projectRepository, Project project) {
        this.projectRepository = projectRepository;
        this.project = project;
    }

    public void snapshot() {
        snapshots.add(project.snapshot());
    }

    public void revert() {
        project.apply(snapshots.removeLast());
    }

    public void save() {
        projectRepository.save(project);
        snapshots.clear();
    }
}
