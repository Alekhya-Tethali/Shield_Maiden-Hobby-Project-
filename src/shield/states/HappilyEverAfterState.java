package shield.states;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.HashMap;

import Audio.AudioPlayer;
import TileMap.Background;
import shield.game;
import shield.entities.creatures.Player;

public class HappilyEverAfterState extends state {
	private HashMap<String,AudioPlayer> sfx;
	public HappilyEverAfterState(game Game) {
		super(Game);
		try {
			bg = new Background("/textures/Happy1.png", 1);
			font = new Font("Copper Black", Font.BOLD, 40);
			sfx=new HashMap<String,AudioPlayer>();
			

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	private Background bg;
	private Font font;

	@Override
	public void tick() {
		getInput();

	}

	public void getInput() {
		if (Game.getKeyManager().r)
			state.setState(Game.gameoverstate);
		if (Game.getKeyManager().enter)
			state.setState(Game.menustate);
	}

	@Override
	public void render(Graphics g) {
		bg.draw(g);
		g.setFont(font);
		g.setColor(Color.orange);
		g.drawString("Your Score:"+ Player.getCoinCollection(),796 ,400 );
		g.setColor(Color.CYAN);
		g.drawString("Press Enter to got to Main Menu", 550, 650);
	}
}