package com.p1nero.noworldgenwarning.mixin;

import net.minecraft.world.level.levelgen.DensityFunctions;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(DensityFunctions.TwoArgumentSimpleFunction.class)
public interface DensityFunctionsMixin {

    @Redirect(method = "create", at = @At(value = "INVOKE", target = "Lorg/slf4j/Logger;warn(Ljava/lang/String;)V"))
    private static void noworldgenwarning$warn(Logger instance, String s) {

    }

}
