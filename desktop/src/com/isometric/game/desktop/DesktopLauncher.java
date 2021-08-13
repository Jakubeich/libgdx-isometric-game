package com.isometric.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.isometric.game.GameScreen;
import com.isometric.game.Isometric;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new Isometric(), config);
		
		config.width = GameScreen.WIDTH;
		config.height = GameScreen.HEIGHT;
	}
}
