package tut9.exercise1;

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
        // TODO: Implement me
        return Optional.empty();
    }
}
