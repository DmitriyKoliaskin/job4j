package ru.job4j.condition;

public class TruckerJob {
    public static void main(String[] args) {
        Drive steve = new Drive();
        System.out.println("Steve wants the trucker job.");
        if (!steve.hasLicense()) {
            System.out.println("Steve need to get a license!");
            steve.passExamOn('B');
        }
        if (steve.canDrive('A')) {
            System.out.println("Steve works on truckers!");
        } else if (steve.canDrive('C')) {
            System.out.println("Steve works in taxi.");
        } else {
            System.out.println("Steve does not have a job, but ride on motorbike!");
        }

    }
}
