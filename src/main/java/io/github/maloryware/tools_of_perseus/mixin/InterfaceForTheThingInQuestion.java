package io.github.maloryware.tools_of_perseus.mixin;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ItemStack.class)
public interface InterfaceForTheThingInQuestion {
	// this is bullshit
	@Accessor("nbt")
    NbtCompound getNbt();
}
