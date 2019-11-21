/*
 * MIT License
 *
 * Copyright (c) 2019 i509VCB
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package me.i509.fabric.cursedshulkerboxes.api.block.material;

import me.i509.fabric.cursedshulkerboxes.api.block.base.AbstractShulkerBoxBlock;
import me.i509.fabric.cursedshulkerboxes.api.block.base.AbstractShulkerBoxBlockEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.EntityContext;
import net.minecraft.util.DyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractMaterialBasedShulkerBoxBlock extends AbstractShulkerBoxBlock {
    protected AbstractMaterialBasedShulkerBoxBlock(Settings settings, int slotCount, @Nullable DyeColor color) {
        super(settings, slotCount, color);
    }

    @Override
    public Box getOpenBox(Direction facing) {
        // VoxelShapes.fullCube()
        //                .getBoundingBox()
        //                .stretch(0.5F * direction.getOffsetX(), 0.5F * direction.getOffsetY(), 0.5F * direction.getOffsetZ());
        return VoxelShapes.fullCube().getBoundingBox()
                .stretch(0.5F * facing.getOffsetX(), 0.5F * facing.getOffsetY(), 0.5F * facing.getOffsetZ())
                .shrink(facing.getOffsetX(), facing.getOffsetY(), facing.getOffsetZ());
    }

    /*
    Box box = VoxelShapes.fullCube().getBoundingBox()
                        .stretch(0.5F * facing.getOffsetX(), 0.5F * facing.getOffsetY(), 0.5F * facing.getOffsetZ())
                        .shrink(facing.getOffsetX(), facing.getOffsetY(), facing.getOffsetZ());
     */

    @Override
    public VoxelShape getOutlineShape(BlockState blockState, BlockView blockView, BlockPos blockPos, EntityContext entityContext) {
        // TODO Outline Shape machine broke
        BlockEntity blockEntity = blockView.getBlockEntity(blockPos);
        return blockEntity instanceof AbstractShulkerBoxBlockEntity ? VoxelShapes.cuboid(((AbstractShulkerBoxBlockEntity)blockEntity).getBoundingBox(blockState)) : VoxelShapes.fullCube();
    }

    @Override
    public boolean canSuffocate(BlockState blockState, BlockView blockView, BlockPos blockPos) {
        return true;
    }
}
