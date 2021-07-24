
package net.mcreator.minecrafttravelerssausage.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.minecrafttravelerssausage.itemgroup.MTSTOOLItemGroup;
import net.mcreator.minecrafttravelerssausage.MinecrafttravelerssausageModElements;

@MinecrafttravelerssausageModElements.ModElement.Tag
public class KatanaItem extends MinecrafttravelerssausageModElements.ModElement {
	@ObjectHolder("minecrafttravelerssausage:katana")
	public static final Item block = null;
	public KatanaItem(MinecrafttravelerssausageModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 225;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 1.5f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 3;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -1.8000000000000003f, new Item.Properties().group(MTSTOOLItemGroup.tab)) {
		}.setRegistryName("katana"));
	}
}
