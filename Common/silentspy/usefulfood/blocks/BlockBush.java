package silentspy.usefulfood.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import silentspy.usefulfood.*;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.*;

public class BlockBush extends Block{

	public BlockBush(int var1) {
		super(var1, Material.leaves);
		this.setCreativeTab(CreativeTabs.tabDeco);
		this.setHardness(0.2F);
		this.setLightOpacity(1);
		this.setStepSound(soundGrassFootstep);
	}
	
	public int getBlockTextureFromSideAndMetadata(int side, int metadata)
    {
		
		int texture = 14;
		
		switch (metadata) {
		
        case 0:  return 14;
		case 1:  return 15;
		
		}
		
        return texture;
    }
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
        par3List.add(new ItemStack(par1, 1, 1));
    }
	
	public int quantityDropped(Random random)
    {
        return 2 + random.nextInt(4);
    }
	
	public int idDropped(int par1, Random par2Random, int par3)
    {
        return UsefulFoodContent.blueberry.shiftedIndex;
    }
	
	public String getTextureFile()
    {
        return mod_usefulfood.blocktextures;
    }
	
	public int getFlammability(IBlockAccess world, int x, int y, int z, int metadata, int face)
    {
    	return 50;
    }
	
	public static void setBurnProperties(int id, int encouragement, int flammability)
    {
    	encouragement = 50;
        flammability = 100;
    }
}
