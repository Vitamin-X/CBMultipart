package codechicken.multipart.api.part;

import codechicken.multipart.api.annotation.MultiPartMarker;
import codechicken.multipart.api.part.MultiPart;
import codechicken.multipart.trait.TCapabilityTile;
import net.minecraft.core.Direction;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import org.jetbrains.annotations.Nullable;

/**
 * Created by covers1624 on 7/1/21.
 */
@MultiPartMarker (TCapabilityTile.class)
public interface CapabilityProviderPart extends MultiPart, ICapabilityProvider {

    boolean hasCapabilities(@Nullable Direction dir);
}
