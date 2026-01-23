package tut9.exercise1.solution;

import java.util.Optional;
import java.util.Set;

class CampusSystem {
    private StudentDatabase studentDatabase;
    private Set<Module> modules;

    public CampusSystem(StudentDatabase studentDatabase, Set<Module> modules) {
        this.studentDatabase = studentDatabase;
        this.modules = modules;
    }

    public Optional<Module> findModuleById(String moduleId) {
        for (Module module : modules) {
            if (module.getId().equals(moduleId)) {
                return Optional.of(module);
            }
        }
        return Optional.empty();
    }
}
