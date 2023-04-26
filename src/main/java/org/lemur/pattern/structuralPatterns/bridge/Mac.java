package org.lemur.pattern.structuralPatterns.bridge;

/**
 * 扩展抽象化角色(mac操作系统)
 */
public class Mac extends OperatingSystem {
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
