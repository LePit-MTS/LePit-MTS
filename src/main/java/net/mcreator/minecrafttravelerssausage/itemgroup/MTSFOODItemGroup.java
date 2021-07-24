
package net.mcreator.minecrafttravelerssausage.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.minecrafttravelerssausage.item.SausageItem;
import net.mcreator.minecrafttravelerssausage.MinecrafttravelerssausageModElements;

@MinecrafttravelerssausageModElements.ModElement.Tag
public class MTSFOODItemGroup extends MinecrafttravelerssausageModElements.ModElement {
	public MTSFOODItemGroup(MinecrafttravelerssausageModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmtsfood") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SausageItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
