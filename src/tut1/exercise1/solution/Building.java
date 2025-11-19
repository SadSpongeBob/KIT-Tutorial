package tut1.exercise1.solution;

class Building {
    // Attributes
    String name;
    int capacity;
    Room[] rooms;

    int openingTime;
    int closingTime;
    boolean isOpen;

    // Methods
    boolean isBuildingOpen(int currentTime) {
        // Check if currentTime is inside of working hours
        return true;
    }

    void closeBuilding() {
        // Close the building if necessary
    }
}
