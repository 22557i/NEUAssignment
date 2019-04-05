package org.dgp;

import java.util.ArrayList;
import java.util.List;

public class ExplosionModel {
	List<Explosion> explosions = new ArrayList<>();
	
	public void load(Explosion e) {
		explosions.add(e);
	}
	public void start() {
		System.out.println(explosions.size() + " explosions to explode.");
		for (Explosion e : explosions) {
			e.explode();
		}
	}
	public static void demo() {
		System.out.println("\n\t" + ExplosionModel.class.getName() + ".demo() starting...\n");
		ExplosionModel obj = new ExplosionModel();
		obj.load(new Explosion());
		obj.load(new GunShot());
		obj.load(new Grenade());
		obj.load(new ABomb());
		obj.start();
		System.out.println("\n\t" + ExplosionModel.class.getSimpleName() + ".demo() starting...\n");
	}
}
