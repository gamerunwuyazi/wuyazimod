package name.modid.item.custom;

import name.modid.item.ModArmorMaterials;
import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Arrays;
import java.util.Map;
import java.util.List;

public class ModArmorItem extends ArmorItem {
    public ModArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    private static final Map<ArmorMaterial, List<StatusEffectInstance>> MAP =
            (new ImmutableMap.Builder<ArmorMaterial, List<StatusEffectInstance>>())
                    .put(ModArmorMaterials.TEST_TOOL1,
                            Arrays.asList(
                                    new StatusEffectInstance(StatusEffects.REGENERATION, 30, 99, false, true, false),
                                    new StatusEffectInstance(StatusEffects.RESISTANCE, 30, 99, false, true, false)
                            )).build();



    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient()) {
            if (entity instanceof PlayerEntity player && hasFullSuitableArmor(player)) {
                evaluateArmorEffects(player);
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private void evaluateArmorEffects(PlayerEntity player) {
        for (Map.Entry<ArmorMaterial, List<StatusEffectInstance>> entry : MAP.entrySet()) {
            ArmorMaterial material = entry.getKey();
            List<StatusEffectInstance> statusEffectInstances = entry.getValue();

            if (hasCorrectMaterialArmorOn(material, player)) {
                for (StatusEffectInstance effect : statusEffectInstances) {
                    StatusEffect effect1 = effect.getEffectType();
                    if (!player.hasStatusEffect(effect1)) {
                        player.addStatusEffect(effect);
                    }
                }
            }
        }

    }

    private boolean hasCorrectMaterialArmorOn(ArmorMaterial material, PlayerEntity player) {
        for (ItemStack stack : player.getInventory().armor) {
            if (!(stack.getItem() instanceof ArmorItem)) {
                return false;
            }
        }

        ArmorItem helmet = (ArmorItem) player.getInventory().getArmorStack(3).getItem();
        ArmorItem chestplate = (ArmorItem) player.getInventory().getArmorStack(2).getItem();
        ArmorItem leggings = (ArmorItem) player.getInventory().getArmorStack(1).getItem();
        ArmorItem boots = (ArmorItem) player.getInventory().getArmorStack(0).getItem();

        return helmet.getMaterial() == material
                && chestplate.getMaterial() == material
                && leggings.getMaterial() == material
                && boots.getMaterial() == material;
    }

    private boolean hasFullSuitableArmor(PlayerEntity player) {
        ItemStack helmet = player.getInventory().getArmorStack(3);
        ItemStack chestplate = player.getInventory().getArmorStack(2);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack boots = player.getInventory().getArmorStack(0);

        return !helmet.isEmpty() && !chestplate.isEmpty() && !leggings.isEmpty() && !boots.isEmpty();
    }

}