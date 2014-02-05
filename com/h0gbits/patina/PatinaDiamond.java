package com.h0gbits.patina;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PatinaDiamond extends Block {
	
	public PatinaDiamond(int par1, Material par2Material) {
		super(par1, par2Material);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconReg){
		this.blockIcon = iconReg.registerIcon("patina:patina_diamond");
	}

}
