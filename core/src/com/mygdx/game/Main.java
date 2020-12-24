package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.player.Player;

public class Main extends ApplicationAdapter {
	private SpriteBatch batch; //using sprite
	private Texture img; // texture
	private Player player;
	public static World world;



	@Override
	public void create () {
		world = new World(new Vector2(0, 0), true);
		batch = new SpriteBatch();
		img = new Texture("Assets/Sprite_Sheets/Mobile - Flappy Bird - General Sprites0.png");
		player = new Player(50, 256*3);
	}

	@Override
	public void render () {
		world.step(1/60f,6,2);
		batch.begin(); // when to start drawing
		player.update(batch);
		batch.end(); // when to stop drawing


	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
