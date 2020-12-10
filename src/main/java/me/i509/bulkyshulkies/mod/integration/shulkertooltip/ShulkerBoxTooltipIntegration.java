/*
 * MIT License
 *
 * Copyright (c) 2019, 2020 i509VCB
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

package me.i509.bulkyshulkies.mod.integration.shulkertooltip;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.misterpemodder.shulkerboxtooltip.api.ShulkerBoxTooltipApi;
import com.misterpemodder.shulkerboxtooltip.api.provider.PreviewProvider;
import me.i509.bulkyshulkies.api.ShulkerBoxType;
import me.i509.bulkyshulkies.mod.BulkyShulkiesImpl;
import me.i509.bulkyshulkies.mod.BulkyShulkiesMod;

import net.minecraft.item.Item;

import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;

/**
 * A hook to allow the Bulky Shulker Boxes to support Shulker Box Tooltips.
 */
public final class ShulkerBoxTooltipIntegration implements ShulkerBoxTooltipApi {
	@Override
	public String getModId() {
		return BulkyShulkiesMod.MODID;
	}

	@Override
	public void registerProviders(Map<PreviewProvider, List<Item>> providers) {
		for (ShulkerBoxType type : BulkyShulkiesImpl.SHULKER_BOX_TYPE) {
			providers.put(new ShulkerBoxPreviewProvider(), Collections.singletonList(type.getItem()));
		}

		RegistryEntryAddedCallback.event(BulkyShulkiesImpl.SHULKER_BOX_TYPE).register((rawId, id, object) -> {
			providers.put(new ShulkerBoxPreviewProvider(), Collections.singletonList(object.getItem()));
		});
	}
}
