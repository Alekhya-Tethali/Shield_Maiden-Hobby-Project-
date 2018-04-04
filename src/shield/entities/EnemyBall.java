package shield.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import TileMap.TileMap;
import shield.game;
import shield.gfx.Assets;

public class EnemyBall extends MapObject {
	public boolean hit;
	public boolean remove;
	private BufferedImage[] sprites;
	private BufferedImage[] hitSprites;

	public EnemyBall(TileMap tm, boolean right) {

		super(tm);
		if (right)
			dx = moveSpeed;
		else
			dx = -moveSpeed;

		moveSpeed = 3.8;
		dx = -moveSpeed;

		width = 30;
		height = 30;
		cwidth = 14;
		cheight = 20;

		// load sprites
/*		try {
			BufferedImage spritesheet = null;
			
			if (Assets.f == 1) {
				spritesheet = ImageIO.read(getClass().getResourceAsStream("/textures/witchfireballnobg.gif"));
			} 
			else if (Assets.f == 2) {
				spritesheet = ImageIO.read(getClass().getResourceAsStream("/worlds/medusaballwithoutbg.gif"));
			} 
			else if (Assets.f == 3) {
				spritesheet = ImageIO.read(getClass().getResourceAsStream("/textures/nffbnobgfinal.gif"));
			}

			sprites = new BufferedImage[4];
			for (int i = 0; i < sprites.length; i++) {
				sprites[i] = spritesheet.getSubimage(i * width, 0, width, height);
			}

			hitSprites = new BufferedImage[3];
			for (int i = 0; i < hitSprites.length; i++) {
				hitSprites[i] = spritesheet.getSubimage(i * width, height, width, height);
			}    */
			animation = new Animation();
			animation.setFrames(Assets.ball);
			animation.setDelay(70);

	/*	}
		catch (Exception e) {
			e.printStackTrace();
		}
*/
	}

	public void setHit() {
		if (hit)
			return;
		hit = true;
		animation.setFrames(Assets.hitSprites);
		animation.setDelay(70);
		dx = 0;
	}

	public boolean shouldRemove() {
		return remove;
	}

	public void update() {

		checkTileMapCollision();

		setPosition(xtemp, ytemp);

		if (dx == 0 && !hit) {
			setHit();
		}

		animation.update();
		if (hit && animation.hasPlayedOnce()) {
			remove = true;
		}

	}

	public void draw(Graphics g) {

		setMapPosition();

		super.draw(g);

	}

}