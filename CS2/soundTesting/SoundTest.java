import java.awt.event.*;
import javax.swing.*;
import javax.sound.sampled.*;
import java.net.URL;
import java.io.*;

class SoundTest
{
    public static void main(String[] args) throws Exception
    {
        //https://stackoverflow.com/questions/4871051/how-to-get-the-current-working-directory-in-java
        //https://stackoverflow.com/questions/64509691/how-can-i-add-some-sound-to-my-java-jframe
        URL file = new URL("file:///" + System.getProperty("user.dir") + "/Marcos%20H.%20Bolanos%20-%20A%20Simple%20Life.wav");

        AudioInputStream ais = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(ais);
        clip.setFramePosition(0);
        clip.start();

        try 
        {
            Thread.sleep(4000);
        }
        catch (InterruptedException ex)
        {
        }
    }
}