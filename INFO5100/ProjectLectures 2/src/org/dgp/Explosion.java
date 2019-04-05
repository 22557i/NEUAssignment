package org.dgp;

public class Explosion extends AbstractExplosionAPI {
	public void explode() {
		System.out.println("Explosion (EXPLODE)");
	}
	public static void demo() {
		System.out.println("\t" + Explosion.class.getName() + ".demo() starting...\n");
		Explosion obj = new Explosion();
		obj.explode();
		System.out.println(Explosion.class.getName() + ".demo() done!\n");
	}
}
