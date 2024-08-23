package io.github.maloryware.tools_of_perseus.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ItemStack.class)
public abstract class MixinThatDoesTheThing implements InterfaceForTheThingInQuestion{

	// ItemStack runs shouldPreventDamage
	// UnbreakingEnchantement declares shouldPreventDamage

	// lol, better yet; just set isDamageable to false on enchantment by default

	// nevermind don't do that you fucking moron just return false on damage() if the item has enchantements
	// it's not fucking rocket science
	// get your shit together

	@Unique
	public NbtCompound nbt = getNbt();

	@ModifyReturnValue(
		method = "isDamageable",
		at = @At(
			value = "RETURN")
	)
	public boolean damage(boolean original){

		return original | !this.nbt.contains("Enchantments", NbtElement.LIST_TYPE);
	}



}
