package com.lumenhollow;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class LumenPortalBlock extends Block {
    public LumenPortalBlock(Properties properties) {
        super(properties);
    }

    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        return handleUse(state, level, pos, player, hand, hitResult);
    }

    public InteractionResult onUse(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        return handleUse(state, level, pos, player, hand, hitResult);
    }

    private InteractionResult handleUse(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if (!level.isClientSide && player instanceof ServerPlayer serverPlayer) {
            ServerLevel targetWorld = serverPlayer.server.getLevel(ModDimensions.LUMEN_HOLLOW);
            if (targetWorld != null) {
                serverPlayer.teleportTo(targetWorld, pos.getX() + 0.5, targetWorld.getMinBuildHeight() + 8, pos.getZ() + 0.5, player.getYRot(), player.getXRot());
                serverPlayer.playSound(SoundEvents.END_PORTAL_FRAME_FILL, 1.0f, 1.2f);
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 300, 0, false, false));
            }
        }
        return InteractionResult.sidedSuccess(level.isClientSide);
    }
}
