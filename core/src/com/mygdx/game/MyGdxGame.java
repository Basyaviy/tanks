package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Tank tank;

	@Override
	public void create () {
		batch = new SpriteBatch();
		tank = new Tank();
	}

	@Override
	public void render () {
		float dt = Gdx.graphics.getDeltaTime();
		update(dt);
		ScreenUtils.clear(0, 0, 0.5f, 1);
		batch.begin();
		tank.render(batch);
		batch.end();
	}

	public void update(float dt){
		tank.update(dt);
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
