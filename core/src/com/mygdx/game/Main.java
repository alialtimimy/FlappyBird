package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.player.Player;

public class Main extends ApplicationAdapter {
	private SpriteBatch batch; //using sprite
	private Texture img; // texture
	private Player player;
	public static World world;
	private Box2DDebugRenderer b2dr;
	private OrthographicCamera camera;



	@Override
	public void create () {
		world = new World(new Vector2(0, -9.81f), true);
		batch = new SpriteBatch();
		img = new Texture("Assets/Sprite_Sheets/Mobile - Flappy Bird - General Sprites0.png");
		player = new Player(50, 256*3);
		b2dr = new Box2DDebugRenderer();
		camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
	}

	@Override
	public void render () {
		System.out.println(player.getX() + ", " + player.getY() + ", " + player.getBody().getPosition().x + ", " + player.getBody().getPosition().y);
		world.step(1/3f,6,2);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); // clear the screen
		Gdx.gl.glClearColor(51 / 255f, 245 / 255f, 219 / 255f, 1); // make background blue
		b2dr.render(world, camera.combined);
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
