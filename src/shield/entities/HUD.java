package shield.entities;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import shield.entities.creatures.Player;

public class HUD {

	private Player player;

	private BufferedImage image;
	private Font font;

	public HUD(Player p) {
		player = p;
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/textures/side green no bg.gif"));
			font = new Font("Arial", Font.PLAIN, 16);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void draw(Graphics g) {

		g.drawImage(image, 0, 10, null);

		g.setFont(font);
		g.setColor(Color.WHITE);
		g.drawString(player.getHealth()+"" , 26, 25);
		g.drawString(player.getMagic() / 100 + "/" + player.getMaxMagic() / 100, 26, 45);
		g.drawString(Player.getCoinCollection() + "/" + "300", 26, 87);
		g.drawString(player.getKeyCollection() + "/" + "3", 26, 67);

	}

}