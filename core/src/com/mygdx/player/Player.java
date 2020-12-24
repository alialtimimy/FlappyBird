package com.mygdx.player;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Player {
    private Texture img;
    private Sprite monkey;
    private SpriteBatch batch;
    private float x, y;

    public Player(){
        img = new Texture("Assets/icon.jpg");
        monkey = new Sprite(img);
        monkey.setSize(100,100);
    }
    public Player(float x, float y){
        this();
        this.x = x;
        this.y = y;

    }

    public void createBody(){
        
    }

    public void moveBody(){

    }

    public void render(SpriteBatch batch){
        monkey.draw(batch);// drawing the monkey onto the scren
    }

    public void update(SpriteBatch batch){

    }
}
