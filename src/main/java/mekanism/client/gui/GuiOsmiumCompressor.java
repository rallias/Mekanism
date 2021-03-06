package mekanism.client.gui;

import mekanism.client.gui.GuiProgress.ProgressBar;
import mekanism.common.tile.TileEntityAdvancedElectricMachine;

import net.minecraft.entity.player.InventoryPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiOsmiumCompressor extends GuiAdvancedElectricMachine
{
	public GuiOsmiumCompressor(InventoryPlayer inventory, TileEntityAdvancedElectricMachine tentity)
	{
		super(inventory, tentity);
	}
	
	@Override
	public ProgressBar getProgressType()
	{
		return ProgressBar.RED;
	}
}
