package net.craftions.schach.music;


import net.craftions.schach.Main;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class BackgroundMusic extends Thread{

    @Override
    public void run() {
        doPlay("/assets/1.wav");
        super.run();
    }
    Clip clip;

    public void doPlay(final String url) {
        try {
            stopPlay();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(getClass().getResourceAsStream(url));
            clip = AudioSystem.getClip();
            clip.open(inputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        } catch (Exception e) {
            stopPlay();
            System.err.println(e.getMessage());
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
