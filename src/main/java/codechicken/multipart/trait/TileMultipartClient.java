package codechicken.multipart.trait;

import codechicken.multipart.block.TileMultipart;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;

/**
 * Manual trait implemented on every client side TileMultiPart.
 */
public class TileMultipartClient extends TileMultipart {

    @Override
    public boolean isClientTile() {
        return true;
    }

    @Override
    public void markRender() {
        if (getLevel() instanceof ClientLevel) {
            BlockPos pos = getBlockPos();
            Minecraft.getInstance().levelRenderer.setBlocksDirty(pos.getX(), pos.getY(), pos.getZ(), pos.getX(), pos.getY(), pos.getZ());
        }
    }
}
