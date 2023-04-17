package org.lemur.principles.demo4.before;

public class Client {
    public static void main(String[] args) {
        LemurSafetyDoor lemurSafetyDoor = new LemurSafetyDoor();
        lemurSafetyDoor.antiTheft();
        lemurSafetyDoor.fireProof();
        lemurSafetyDoor.waterProof();
    }
}
