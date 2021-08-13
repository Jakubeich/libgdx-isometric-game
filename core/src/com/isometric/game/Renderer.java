package com.isometric.game;

import java.util.Random;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Renderer {
	
	public static final int TILE_WIDTH = 34;
	public static final int TILE_HEIGHT = 34;
	
	private int [][] map;
	private Texture grass;
	//private Texture sky;
	
	
	public Renderer() {
		grass = new Texture(Gdx.files.internal("grass.png"));
		//sky = new Texture(Gdx.files.internal("sky.png"));
		map = generateMap();
	}
	
	public void drawGround(SpriteBatch batch) {
		for(int row = map.length - 1; row >= 0; row--) {
			for(int col = map.length - 1; col >= 0; col--) {
				float x = (col - row) * (TILE_WIDTH / 2f);
				float y = (col + row) * (TILE_HEIGHT / 4f);
				
				if(map[row][col] == 1) {
					batch.draw(grass, x, y, TILE_WIDTH, TILE_HEIGHT);
				}else {
					
				}
			}
		}
		
		if(Gdx.input.isKeyJustPressed(Input.Keys.G)) {
			map = generateMap();
		}
	}
	
	private int[][] generateMap(){
		Random r = new Random();
		int rSize = r.nextInt(25);
		
		if(rSize < 10) {
			rSize = 10;
		}
		
		int[][] map = new int[rSize][rSize];
		
		for(int row = 0; row < map.length; row++) {
			for(int col = 0; col < map.length; col++) {
				int num = r.nextInt(10);
				
				if(num > 7) {
					map[row][col] = 0;
				}else {
					map[row][col] = 1;
				}
			}
		}
		
		return map;
	}
}
