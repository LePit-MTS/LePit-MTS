
package net.mcreator.minecrafttravelerssausage.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

import net.mcreator.minecrafttravelerssausage.MinecrafttravelerssausageModElements;

@MinecrafttravelerssausageModElements.ModElement.Tag
public class MTSBLOCKItemGroup extends MinecrafttravelerssausageModElements.ModElement {
	public MTSBLOCKItemGroup(MinecrafttravelerssausageModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmtsblock") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.EMERALD_BLOCK, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
