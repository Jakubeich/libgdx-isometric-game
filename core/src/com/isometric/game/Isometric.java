package com.isometric.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Isometric extends Game {
	
	private SpriteBatch batch;
	private GameScreen gScreen;
	
	public void create () {
		batch = new SpriteBatch();
		gScreen = new GameScreen(batch);
		setScreen(gScreen);
	}

	public void render () {
		super.render();
	}
	
	public void dispose () {
		batch.dispose();
		super.dispose();
	}
}
