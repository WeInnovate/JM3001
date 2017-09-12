package com.jm3001.learn.spring.carapp.v5_ann;

import org.springframework.stereotype.Component;

@Component
public class BoseMusicSystem implements MusicSystem {

	
	public BoseMusicSystem(){
		System.out.println(this.getClass().getSimpleName()+" is being constructed.");
	}
	
	@Override
	public void playMusic() {
		System.out.println("Playing music on " + this.getClass().getSimpleName());
	}

}
