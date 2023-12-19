package project;

public class Process {
    
    private int ID;
    private int arrivingTime;
    private int runTime;
    private int priority;
    private int overTime;

    public int getOverTime() {
        return overTime;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }

    public int getArrivingTime() {
        return arrivingTime;
    }

    public void setArrivingTime(int arrivingTime) {
        this.arrivingTime = arrivingTime;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getId() {
        return ID;
    }

    public void setId(int id) {
        ID = id;
    }

    public Process(int[] array) {
        if(array.length >= 5) {
            this.ID = array[0];
            this.arrivingTime = array[1];
            this.priority = array[2];
            this.runTime = array[3];
            this.overTime = array[4];
        } else {
            // Handle the case where the array doesn't have enough elements
            throw new IllegalArgumentException("Array length should be at least 5");
        }
    }

    @Override
    public String toString() {
        return "Process [ID=" + ID + ", arrivingTime=" + arrivingTime + ", runTime=" + runTime +
               ", priority=" + priority + ", overTime=" + overTime + "]";
    }
}
