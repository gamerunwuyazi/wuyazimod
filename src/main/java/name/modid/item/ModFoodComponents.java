package name.modid.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CORN = new FoodComponent
            .Builder()
            .hunger(3)
            .saturationModifier(0.7f)
            .build();
    public static final FoodComponent STRAWBERRY = new FoodComponent
            .Builder()
            .hunger(1)
            .saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,9999999),0.8f)
            .build();
    public static final FoodComponent CHESS = new FoodComponent
            .Builder()
            .hunger(4)
            .saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,9999999),0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING,9999999),0.8f)
            .build();
}
