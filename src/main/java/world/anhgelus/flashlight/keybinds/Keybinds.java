package world.anhgelus.flashlight.keybinds;

import net.minecraftforge.fml.client.registry.ClientRegistry;

public class Keybinds {
    public static final FlashlightKey FLASHLIGHT = new FlashlightKey();

    public static void register() {
        ClientRegistry.registerKeyBinding(FLASHLIGHT);
    }
}
