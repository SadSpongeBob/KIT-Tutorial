package tut6.exercise2;

class ModuleProgramming extends Module {
    private boolean passed;

    @Override
    public boolean passed() {
        return passed;
    }

    @Override
    public float getCredits() {
        return 5;
    }
}
