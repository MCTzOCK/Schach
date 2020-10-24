package net.craftions.schach.music;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Moderator extends Thread{

    @Override
    public void run() {
        doPlay("/assets/Player1_won.wav");
        super.run();
    }
    Clip clip;

    public void doPlay(final String url) {
        try {
            stopPlay();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(getClass().getResourceAsStream(url));
            clip = AudioSystem.getClip();
            clip.open(inputStream);
            clip.start();
        } catch (Exception e) {
            stopPlay();
            e.printStackTrace();
        }
    }

    public void stopPlay() {
        if (clip != null) {
            clip.stop();
            clip.close();
            clip = null;
        }
    }
}

