package shield.states;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import TileMap.Background;
import shield.display;
import shield.game;

public class HelpState extends state {
	private Background bg;
	private Font font;

	public HelpState(game Game) {
		super(Game);
	}

	@Override
	public void tick() {
		getInput();

	}

	public void getInput() {
		if (Game.getKeyManager().r)
			state.setState(Game.menustate);
	}

	@Override
	public void render(Graphics g) {

		g.drawRect(0, 0, display.width, display.height);
		g.setColor(Color.DARK_GRAY);

		g.fillRect(0, 0, display.width, display.height);
		font = new Font("Ravie", Font.BOLD, 30);
		g.setColor(Color.blue);
		g.setFont(font);
		g.drawString("CONTROLS", 05, 45);
		font = new Font("Viner Hand ITC", Font.BOLD, 20);
		g.setColor(Color.cyan);
		g.setFont(font);
		g.drawString("Up:to make the player jump ", 05, 75);
		g.drawString("Left:to make the player walk towards the left direction ", 05, 105);
		g.drawString("Right:to make the player walk towards the right direction ", 05, 135);
		g.drawString(
				"Down:Shield the player from enemy attacks by holding the shield as a barrier.The shield must be held in the direction from which you are being  ",
				05, 165);
		g.drawString("attacked.", 05, 185);
		g.drawString("Spacebar:Attack the enemies with fireballs to kill them.", 05, 215);
		font = new Font("RAVIE", Font.BOLD, 30);
		g.setFont(font);
		g.setColor(Color.blue);
		g.drawString("INSTRUCTIONS", 05, 265);
		
		font = new Font("Viner Hand ITC", Font.BOLD, 20);
		g.setColor(Color.cyan);
		g.setFont(font);
		g.drawString(
				"Cross the three levels to save the prince and collect as many coins as possible for a good score.", 05,
				305);
		g.drawString("The player can cross a level only if you have collected all the three diamonds.", 05, 335);
		g.drawString("The player has only 5 lives to finish the game.Pick the hearts to increase the number of lives.",
				05, 365);
		g.drawString("The player can't attack your enemy and shield  yourself at the same time.", 05, 395);
		
		font = new Font("RAVIE", Font.BOLD, 45);
		g.setColor(Color.red);
		g.setFont(font);
		g.drawString("BEWARE!!", 05, 450);

		font = new Font("RAVIE", Font.BOLD, 30);
		g.setColor(Color.magenta);
		g.setFont(font);
		g.drawString("The boss enemies have a weak point. Only when they are ", 05, 490);
		g.drawString("hit at that point, they die!!", 05, 530);
		
		font = new Font("RAVIE", Font.BOLD, 45);
		g.setColor(Color.yellow);
		g.setFont(font);
		g.drawString("Press R to return to MenuState", 05, 600);
	}
}