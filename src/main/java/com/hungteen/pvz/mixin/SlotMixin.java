package com.hungteen.pvz.mixin;

import com.hungteen.pvz.common.item.spawn.card.PlantCardItem;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.SlotItemHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({Slot.class, SlotItemHandler.class})
public class SlotMixin {

	@Inject(method = "mayPlace", at = @At("HEAD"), cancellable = true)
	private void pvz_blockChallengeBound(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
		Slot self = (Slot) (Object) this;

		if(! (self.container instanceof Inventory) && PlantCardItem.getChallengeUuid(stack) != null) {
			cir.setReturnValue(false);
		}
	}
}