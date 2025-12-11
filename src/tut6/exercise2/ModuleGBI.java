package tut6.exercise2;

class ModuleGBI extends Module {
    private boolean passed;

    @Override
    public boolean passed() {
        return passed;
    }

    @Override
    public float getCredits() {
        return 6;
    }
}
