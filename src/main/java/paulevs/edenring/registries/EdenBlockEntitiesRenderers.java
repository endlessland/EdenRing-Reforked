package paulevs.edenring.registries;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import paulevs.edenring.blocks.entities.renderers.EdenPortalBlockEntityRenderer;

@Environment(EnvType.CLIENT)
public class EdenBlockEntitiesRenderers {
	public static void init() {
		BlockEntityRenderers.register(EdenBlockEntities.EDEN_PORTAL, EdenPortalBlockEntityRenderer::new);
	}
}
