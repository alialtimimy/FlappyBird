package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Main extends ApplicationAdapter {
	SpriteBatch batch; //using sprite
	Texture img; // texture
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("Assets/Sprite_Sheets/Mobile - Flappy Bird - General Sprites0.png");

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin(); // when to start drawing
		batch.draw(img, 0,0,145*4 + 4, 256*3);
		batch.end(); // when to stop drawing
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
