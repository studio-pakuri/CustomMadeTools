package io.github.studiopakuri.custommadetools.api.tool.part;

import io.github.studiopakuri.custommadetools.api.tool.part.material.ToolPartMaterial;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import org.jspecify.annotations.NonNull;

import java.util.Optional;

public abstract class ToolPartType<T> {
    public abstract Optional<T> ability(@NonNull Holder<ToolPartMaterial> material, HolderLookup.@NonNull Provider provider);
}
