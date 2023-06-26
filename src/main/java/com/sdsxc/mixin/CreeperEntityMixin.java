package com.sdsxc.mixin;

import net.minecraft.entity.mob.CreeperEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CreeperEntity.class)
public class CreeperEntityMixin {
    @Shadow private int explosionRadius;
    @Inject(at = @At("HEAD"), method = "explode")
    private void explode(CallbackInfo info){
        this.explosionRadius=0;
    }
}
