package com.mcmoddev.poweradvantage.item.tool.gem;

import com.mcmoddev.poweradvantage.item.tool.BaseAxe;
import com.mcmoddev.poweradvantage.misc.Crystal;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GemPickaxe extends ItemPickaxe implements IItemColor {
    private Crystal crystal;
    public GemPickaxe(Crystal crystal) {
        super(ToolMaterial.DIAMOND);
        this.crystal = crystal;
        setRegistryName("pickaxe_" + crystal.getOreDict().toLowerCase());
        setUnlocalizedName("poweradvantage.pickaxe_" + crystal.getOreDict().toLowerCase());
        GameRegistry.register(this);
    }

    @Override
    public int getColorFromItemstack(ItemStack stack, int tintIndex) {
        if (tintIndex == 1)
            return this.crystal.getRGB();
        return 0xFFFFFF;
    }
}
