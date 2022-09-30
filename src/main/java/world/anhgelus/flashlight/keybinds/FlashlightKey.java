package world.anhgelus.flashlight.keybinds;

import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

public class FlashlightKey extends KeyBinding {
    public static boolean isEnabled = false;
    public FlashlightKey() {
        super("key.flashlight", Keyboard.KEY_F, "key.categories.flashlight");
    }
}
