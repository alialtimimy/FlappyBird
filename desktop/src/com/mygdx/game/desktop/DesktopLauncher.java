package com.mygdx.game.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.Main;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new Main(), config);
		config.width = 145 * 4;
		config.height = 256 * 3;
		config.title = "FlappyMonkey";
		config.addIcon("Assets/icon.png", Files.FileType.Internal);
		config.foregroundFPS = 60;
	}
}
