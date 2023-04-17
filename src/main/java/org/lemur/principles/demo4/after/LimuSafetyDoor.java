package org.lemur.principles.demo4.after;

/**
 * limu安全门
 */
public class LimuSafetyDoor implements AntiTheft, FireProof {
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }
}
