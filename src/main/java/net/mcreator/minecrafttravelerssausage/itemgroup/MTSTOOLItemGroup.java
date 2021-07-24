
package net.mcreator.minecrafttravelerssausage.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.minecrafttravelerssausage.item.KatanaItem;
import net.mcreator.minecrafttravelerssausage.MinecrafttravelerssausageModElements;

@MinecrafttravelerssausageModElements.ModElement.Tag
public class MTSTOOLItemGroup extends MinecrafttravelerssausageModElements.ModElement {
	public MTSTOOLItemGroup(MinecrafttravelerssausageModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmtstool") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(KatanaItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
