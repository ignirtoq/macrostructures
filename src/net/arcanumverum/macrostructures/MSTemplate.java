package net.arcanumverum.macrostructures;

import java.util.ArrayList;

import org.bukkit.Material;

public class MSTemplate {
	private int xwidth, zwidth, height;
	private ArrayList<Material> blockTypes;
	
	public MSTemplate(int xWidth, int zWidth, int Height) {
		xwidth = xWidth;
		zwidth = zWidth;
		height = Height;
	}

}
