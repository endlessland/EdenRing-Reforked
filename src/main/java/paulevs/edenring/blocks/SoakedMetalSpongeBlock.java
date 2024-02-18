package paulevs.edenring.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.MapColor;
import paulevs.edenring.BaseCTBlock;

public class SoakedMetalSpongeBlock extends BaseCTBlock {
    public SoakedMetalSpongeBlock() {
        super(FabricBlockSettings.copyOf(Blocks.WET_SPONGE).mapColor(MapColor.COLOR_PURPLE));
        registerDefaultState(defaultBlockState());
    }
}
