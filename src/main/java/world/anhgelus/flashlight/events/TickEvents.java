package world.anhgelus.flashlight.events;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import world.anhgelus.flashlight.keybinds.FlashlightKey;
import world.anhgelus.flashlight.keybinds.Keybinds;

public class TickEvents {
    private static int counter = 0;
    private static Block lastBlock = null;
    public static void onTick() {
        if (Keybinds.FLASHLIGHT.isKeyDown() && counter == 0) {
            FlashlightKey.isEnabled = !FlashlightKey.isEnabled;
            counter++;
        } else if (Keybinds.FLASHLIGHT.isKeyDown() && counter > 0) {
            counter++;
        } else if (counter > 0) {
            counter = 0;
        }
        if (FlashlightKey.isEnabled) {
            flashlight();
        }
    }

    private static void flashlight() {
        final Minecraft mc = Minecraft.getMinecraft();
        final EntityPlayerSP player = mc.player;
        if (player == null) {
            return;
        }
        final World world = player.world;
        if (world == null) {
            return;
        }

        // get the block who is in front of the player
        // IT WORKS, THANKS COPILOT
        final RayTraceResult rayTraceResult = player.rayTrace(5, 1);
        if (rayTraceResult == null) {
            return;
        }
        final Block block = world.getBlockState(rayTraceResult.getBlockPos()).getBlock();
        if (block != lastBlock) {
            if (lastBlock != null) {
                lastBlock.setLightLevel(0);
            }
            lastBlock = block;
        }
        block.setLightLevel(1);
    }
}
