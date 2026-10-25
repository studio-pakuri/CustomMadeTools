package io.github.studiopakuri.custommadetools.api.tool.part;

import io.github.studiopakuri.custommadetools.api.tool.part.material.ToolPartMaterial;
import net.minecraft.core.Holder;

public record ToolPartInstance(Holder<ToolPartType<?>> type, Holder<ToolPartMaterial> material) {
}
