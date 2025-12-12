package tut6.exercise2.solution;

import java.util.List;

class CsStudent extends Student {
    private static final String MAJOR = "Computer Science";
    private List<Module> modules;

    public CsStudent(String name, int id) {
        super(name, id);
        this.modules = List.of(
            new ModuleProgramming(),
            new ModuleAlgebra(),
            new ModuleGBI()
        );
    }

    @Override
    public String getMajor() {
        return MAJOR;
    }

    @Override
    public List<Module> getRequiredModules() {
        return List.copyOf(modules);
    }
}
