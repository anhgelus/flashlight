package world.anhgelus.flashlight.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class LightBlock extends Block {
    public LightBlock() {
        super(Material.ROCK);
        setRegistryName("light_block");
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setLightLevel(1.0F);
    }
}
