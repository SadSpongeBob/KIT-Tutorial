package tut6.exercise2.solution;

class ModuleAlgebra extends Module {
    private boolean passed;

    @Override
    public boolean passed() {
        return passed;
    }

    @Override
    public float getCredits() {
        return 9;
    }
}
