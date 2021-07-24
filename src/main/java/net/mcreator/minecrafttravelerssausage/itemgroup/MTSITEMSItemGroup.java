
package net.mcreator.minecrafttravelerssausage.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.minecrafttravelerssausage.MinecrafttravelerssausageModElements;

@MinecrafttravelerssausageModElements.ModElement.Tag
public class MTSITEMSItemGroup extends MinecrafttravelerssausageModElements.ModElement {
	public MTSITEMSItemGroup(MinecrafttravelerssausageModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmtsitems") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Items.STICK, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
