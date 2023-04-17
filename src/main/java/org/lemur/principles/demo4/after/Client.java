package org.lemur.principles.demo4.after;

public class Client {
    public static void main(String[] args) {
        LemurSafetyDoor lemurSafetyDoor = new LemurSafetyDoor();
        lemurSafetyDoor.antiTheft();
        lemurSafetyDoor.fireProof();
        lemurSafetyDoor.waterProof();

        System.out.println("===========================");

        LimuSafetyDoor limuSafetyDoor = new LimuSafetyDoor();
        limuSafetyDoor.antiTheft();
        limuSafetyDoor.fireProof();
    }
}
