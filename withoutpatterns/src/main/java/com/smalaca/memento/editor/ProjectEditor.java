package com.smalaca.memento.editor;

import com.smalaca.memento.domain.CodeBase;
import com.smalaca.memento.domain.Project;
import com.smalaca.memento.domain.ProjectRepository;

import java.util.LinkedList;

public class ProjectEditor {
    private final LinkedList<CodeBase> codeBases = new LinkedList<>();
    private final ProjectRepository projectRepository;
    private final Project project;

    public ProjectEditor(ProjectRepository projectRepository, Project project) {
        this.projectRepository = projectRepository;
        this.project = project;
    }

    public void snapshot() {
        codeBases.add(project.getCodeBase().deepCopy());
    }

    public void revert() {
        project.setCodeBase(codeBases.removeLast());
    }

    public void save() {
        projectRepository.save(project);
        codeBases.clear();
    }
}
