
package net.mcreator.minecrafttravelerssausage.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import net.mcreator.minecrafttravelerssausage.procedures.GoldensausageeffectProcedure;
import net.mcreator.minecrafttravelerssausage.itemgroup.MTSFOODItemGroup;
import net.mcreator.minecrafttravelerssausage.MinecrafttravelerssausageModElements;

import java.util.Map;
import java.util.HashMap;

@MinecrafttravelerssausageModElements.ModElement.Tag
public class GoldensausageItem extends MinecrafttravelerssausageModElements.ModElement {
	@ObjectHolder("minecrafttravelerssausage:goldensausage")
	public static final Item block = null;
	public GoldensausageItem(MinecrafttravelerssausageModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(MTSFOODItemGroup.tab).maxStackSize(64).rarity(Rarity.RARE)
					.food((new Food.Builder()).hunger(14).saturation(0.3f).setAlwaysEdible().meat().build()));
			setRegistryName("goldensausage");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				GoldensausageeffectProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
