package me.i509.fabric.bulkyshulkies.mixin.core.block;

import me.i509.fabric.bulkyshulkies.api.block.entity.ShulkerBoxBlockEntity;
import me.i509.fabric.bulkyshulkies.registry.ShulkerComponents;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.DyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

@Mixin(AbstractBlock.AbstractBlockState.class)
abstract class AbstractBlockStateMixin {
	@Inject(method = "getMapColor", at = @At("HEAD"), cancellable = true)
	private void getDynamicMapColor(BlockView world, BlockPos pos, CallbackInfoReturnable<MapColor> info) {
		final BlockEntity blockEntity = world.getBlockEntity(pos);

		if (blockEntity instanceof ShulkerBoxBlockEntity) {
			ShulkerComponents.SHULKER_BOX_COLOR.maybeGet(blockEntity).ifPresent(component -> {
				final DyeColor dyeColor = component.getColor().toDyeColor();

				MapColor mapColor;

				if (dyeColor == null) {
					mapColor = MapColor.PURPLE; // Uncolored appears as purple
				} else {
					mapColor = dyeColor.getMapColor();
				}

				info.setReturnValue(mapColor);
			});
		}
	}
}
