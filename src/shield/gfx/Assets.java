package shield.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	public static int f;
	public static BufferedImage standleft, standright, runright4, runright6, runleft3, runright2, runright3, runright5,
			shiright, runleft4, attackright, runright1, runleft1, runleft2, runleft5, runleft6, shileft, attackleft;
	public static final int width = 71, height = 106;
	public static BufferedImage[] player_rightwalk;
	public static BufferedImage[] player_leftwalk;
	public static BufferedImage[] player_idle;
	public static BufferedImage[] player_jump;
	public static BufferedImage[] player_shield;
	public static BufferedImage[] player_attack;
	public static BufferedImage[] player_fall;
	public static BufferedImage[] player_glide;
	public static BufferedImage[] witch;
	public static BufferedImage[] medusa;
	public static BufferedImage[] noface;
	public static BufferedImage[] key;
	public static BufferedImage[] coin;
	public static BufferedImage[] door;
	public static BufferedImage[] heart;
	public static BufferedImage[] ball, hitSprites;

	public static int b;

	public static void init() {

		noface = new BufferedImage[2];
		key = new BufferedImage[1];
		coin = new BufferedImage[1];
		door = new BufferedImage[1];
		heart = new BufferedImage[1];
		player_idle = new BufferedImage[1];
		player_rightwalk = new BufferedImage[5];
		player_leftwalk = new BufferedImage[6];
		player_jump = new BufferedImage[2];
		player_shield = new BufferedImage[1];
		player_attack = new BufferedImage[1];
		player_fall = new BufferedImage[2];
		player_glide = new BufferedImage[1];
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/spritesheet1.png"));
		standleft = sheet.crop(0, 0, width, height);
		standright = sheet.crop(width, 0, width, height);
		runright4 = sheet.crop(width * 2, 0, width, height);
		runleft6 = sheet.crop(width * 3, 0, width, height);
		runleft3 = sheet.crop(width * 4, 0, width, height);
		runright2 = sheet.crop(0, height, width, height);
		runright3 = sheet.crop(width, height, width, height);
		runright5 = sheet.crop(width * 2, height, width, height);
		shiright = sheet.crop(width * 3 + 1, height, width, height);
		runleft4 = sheet.crop(width * 4, height, width, height);
		attackright = sheet.crop(0, height * 2, width, height);
		runright1 = sheet.crop(width, height * 2, width, height);
		runleft1 = sheet.crop(width * 2, height * 2, width, height);
		runleft2 = sheet.crop(width * 3, height * 2, width, height);
		runleft5 = sheet.crop(width * 4, height * 2, width, height);
		runright6 = sheet.crop(0, height * 3, width, height);
		shileft = sheet.crop(width, height * 3, width, height);
		attackleft = sheet.crop(width * 2, height * 3, width, height);

		/*
		 * if (f == 1) { SpriteSheet sheet1 = new
		 * SpriteSheet(ImageLoader.loadImage("/textures/witch1nobg.png")); witch
		 * = new BufferedImage[3]; witch[2] = sheet1.crop(0, 415, 110, 82);
		 * witch[0] = sheet1.crop(111, 415, 110, 82); witch[1] =
		 * sheet1.crop(222, 415, 110, 82);
		 * 
		 * } else if (f == 2) { SpriteSheet sheet6 = new
		 * SpriteSheet(ImageLoader.loadImage("/textures/mess.png")); witch = new
		 * BufferedImage[3]; witch[1] = sheet6.crop(0, 0, 100, 100); witch[2] =
		 * sheet6.crop(100, 0, 100, 100); witch[0] = sheet6.crop(200, 0, 100,
		 * 100); } else if (f == 3) { SpriteSheet sheet7 = new
		 * SpriteSheet(ImageLoader.loadImage("/textures/nfss1.png")); witch =
		 * new BufferedImage[2]; witch[0] = sheet7.crop(0, 0, 105, 140);
		 * witch[1] = sheet7.crop(105, 0, 105, 140); }
		 */

		if (f == 1 ) {
			SpriteSheet sheet1 = new SpriteSheet(ImageLoader.loadImage("/textures/witch1nobg.png"));

			b = 1;
			witch = new BufferedImage[3];

			witch[0] = sheet1.crop(0, 415, 110, 82);

			witch[1] = sheet1.crop(111, 415, 110, 82);
			witch[2] = sheet1.crop(222, 415, 110, 82);
		} else if (f == 3) {
			SpriteSheet sheet6 = new SpriteSheet(ImageLoader.loadImage("/textures/nfss3.png"));
			witch = new BufferedImage[2];
			b = 3;
			witch[0] = sheet6.crop(0, 0, 85, 95);
			witch[1] = sheet6.crop(85, 0, 85, 95);

		} else if (f == 2) {
			SpriteSheet sheet7 = new SpriteSheet(ImageLoader.loadImage("/textures/mess.png"));
			witch = new BufferedImage[3];
			b = 2;
			witch[1] = sheet7.crop(0, 0, 100, 100);
			witch[2] = sheet7.crop(100, 0, 100, 100);
			witch[0] = sheet7.crop(200, 0, 100, 100);

		}

		if (b == 1) {
			SpriteSheet sheet9 = new SpriteSheet(ImageLoader.loadImage("/textures/witchfireballnobg.gif"));
			ball = new BufferedImage[4];
			hitSprites = new BufferedImage[3];
			ball[0] = sheet9.crop(0, 0, 30, 30);
			ball[1] = sheet9.crop(30, 0, 30, 30);
			ball[2] = sheet9.crop(60, 0, 30, 30);
			ball[3] = sheet9.crop(90, 0, 30, 30);
			hitSprites[0] = sheet9.crop(0, 30, 30, 30);
			hitSprites[1] = sheet9.crop(30, 30, 30, 30);
			hitSprites[2] = sheet9.crop(60, 30, 30, 30);
		} else if (b == 3) {
			SpriteSheet sheet11 = new SpriteSheet(ImageLoader.loadImage("/worlds/medusaballwithoutbg.gif"));

			ball = new BufferedImage[4];
			hitSprites = new BufferedImage[3];
			ball[0] = sheet11.crop(0, 0, 30, 30);
			ball[1] = sheet11.crop(30, 0, 30, 30);
			ball[2] = sheet11.crop(60, 0, 30, 30);
			ball[3] = sheet11.crop(90, 0, 30, 30);
			hitSprites[0] = sheet11.crop(0, 30, 30, 30);
			hitSprites[1] = sheet11.crop(30, 30, 30, 30);
			hitSprites[2] = sheet11.crop(60, 30, 30, 30);
		} else if (b == 2) {
			SpriteSheet sheet10 = new SpriteSheet(ImageLoader.loadImage("/textures/nffbnobgfinal.gif"));

			ball = new BufferedImage[4];
			hitSprites = new BufferedImage[3];
			ball[0] = sheet10.crop(0, 0, 30, 30);
			ball[1] = sheet10.crop(30, 0, 30, 30);
			ball[2] = sheet10.crop(60, 0, 30, 30);
			ball[3] = sheet10.crop(90, 0, 30, 30);
			hitSprites[0] = sheet10.crop(0, 30, 30, 30);
			hitSprites[1] = sheet10.crop(30, 30, 30, 30);
			hitSprites[2] = sheet10.crop(60, 30, 30, 30);
		}
		player_rightwalk[0] = runright1;
		player_rightwalk[1] = runright2;
		player_rightwalk[2] = runright3;
		player_rightwalk[3] = runright4;
		player_rightwalk[4] = runright5;
		player_glide[0] = shileft;

		player_leftwalk[0] = runleft1;
		player_leftwalk[1] = runleft2;
		player_leftwalk[2] = runleft3;
		player_leftwalk[3] = runleft4;
		player_leftwalk[4] = runleft5;
		player_leftwalk[5] = runleft6;

		player_idle[0] = standright;

		player_fall[0] = runright5;
		player_fall[1] = runright5;

		player_jump[0] = runright3;
		player_jump[1] = runright3;

		player_attack[0] = attackright;
		player_shield[0] = shiright;

		SpriteSheet sheet2 = new SpriteSheet(ImageLoader.loadImage("/textures/50(width)x45(height).png"));
		key[0] = sheet2.crop(0, 0, 50, 45);
		SpriteSheet sheet3 = new SpriteSheet(ImageLoader.loadImage("/textures/coinnobg.png"));
		coin[0] = sheet3.crop(0, 0, 41, 41);
		SpriteSheet sheet4 = new SpriteSheet(ImageLoader.loadImage("/textures/doornobg.png"));
		door[0] = sheet4.crop(0, 0, 97, 125);
		SpriteSheet sheet5 = new SpriteSheet(ImageLoader.loadImage("/textures/heartnobg.png"));
		heart[0] = sheet5.crop(0, 0, 33, 30);
	}

}