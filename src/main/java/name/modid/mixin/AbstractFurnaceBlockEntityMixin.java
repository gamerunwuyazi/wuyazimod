package name.modid.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

@Mixin(AbstractFurnaceBlockEntityMixin.class)
public class AbstractFurnaceBlockEntityMixin {
    @Inject(at = @At("TAIL"),method = "createFuelTimeMap")
    private static void addFuelItems() {

    }
}
