package test.java.binBeats;

import javax.sound.sampled.LineUnavailableException;

import org.junit.Test;

import main.java.binBeats.lib.Channel;
import main.java.binBeats.lib.MonoFrequencyPlayer;
import main.java.binBeats.lib.StereoFrequencyPlayer;

public class StereoFrequencyPlayerTest {

	@Test
	public void PlayStopTest() throws LineUnavailableException, InterruptedException {
		StereoFrequencyPlayer player = new StereoFrequencyPlayer();
		player.play(440, Channel.right);
		Thread.sleep(2000);
		player.stop();
	}
}
