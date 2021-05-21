package dev.stashy.extrasounds.mixin.inventory.item;

import dev.stashy.extrasounds.InventorySound;
import dev.stashy.extrasounds.ItemSoundContainer;
import net.minecraft.item.PotionItem;
import net.minecraft.sound.SoundEvents;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(PotionItem.class)
public class BottleItemSound implements ItemSoundContainer
{
    InventorySound snd = new InventorySound(SoundEvents.ITEM_BOTTLE_FILL, 1f);

    @Override
    public InventorySound getInventorySound()
    {
        return snd;
    }
}
