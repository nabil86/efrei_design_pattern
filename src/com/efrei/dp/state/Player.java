package com.efrei.dp.state;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private boolean playing = false;
	private final List<String> playlist = new ArrayList<>();
	private int currentTrack = 0;

	public Player() {
		setPlaying(true);
		for (var i = 1; i <= 12; i++) {
			playlist.add("Track " + i);
		}
	}

	public void setPlaying(boolean playing) {
		this.playing = playing;
	}

	public boolean isPlaying() {
		return playing;
	}

	public String startPlayback() {
		return "Playing " + playlist.get(currentTrack);
	}

	public String nextTrack() {
		currentTrack++;
		if (currentTrack > playlist.size() - 1) {
			currentTrack = 0;
		}
		return "Playing " + playlist.get(currentTrack);
	}

	public String previousTrack() {
		currentTrack--;
		if (currentTrack < 0) {
			currentTrack = playlist.size() - 1;
		}
		return "Playing " + playlist.get(currentTrack);
	}

	public void setCurrentTrackAfterStop() {
		this.currentTrack = 0;
	}
}
