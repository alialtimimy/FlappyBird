package com.mygdx.player;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.*;

import static com.mygdx.game.Main.world;

public class Player {
    private Texture img;
    private Sprite monkey;
    private SpriteBatch batch;
    private float x, y;
    private Rectangle rect;
    private Body body;
    
    public Player(){
        img = new Texture("Assets/icon.jpg");
        monkey = new Sprite(img);
        monkey.setSize(100,100);
        createBody();
    }
    public Player(float x, float y ){
        this();
        this.x = x;
        this.y = y;
    }

    public void createBody(){
        monkey.setPosition(x, y);
        rect = new Rectangle((int)monkey.getX(),(int)monkey.getY(),(int)monkey.getWidth(), (int)monkey.getHeight());
        BodyDef bodyDef = new BodyDef();
        bodyDef.type = BodyDef.BodyType.DynamicBody; //a body which moves is of type dynamic(static means doesnt move)
        body = world.createBody(bodyDef);
        FixtureDef fixtureDef = new FixtureDef();
        PolygonShape polygonShape = new PolygonShape();
        fixtureDef.shape = polygonShape;
        polygonShape.setAsBox(rect.getX(), rect.getY());

    }

    public void moveBody(){

    }

    public void render(SpriteBatch batch){
        monkey.draw(batch);// drawing the monkey onto the scren
    }

    public void update(SpriteBatch batch){
        monkey.setPosition(body.getPosition().x, body.getPosition().y);
        render(batch);

    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
