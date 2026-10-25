package io.github.studiopakuri.custommadetools.api.tool.part;

import io.github.studiopakuri.custommadetools.api.tool.part.material.ToolPartMaterial;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.neoforged.neoforge.registries.datamaps.DataMapType;
import org.jspecify.annotations.NonNull;

import java.util.Optional;

public class DataMapToolPartType<T> extends ToolPartType<T>{
    private final DataMapType<ToolPartMaterial, T> dataMapType;

    public DataMapToolPartType(DataMapType<ToolPartMaterial, T> dataMapType) {
        this.dataMapType = dataMapType;
    }

    @Override
    public Optional<T> ability(@NonNull Holder<ToolPartMaterial> material, HolderLookup.@NonNull Provider provider) {
        return Optional.ofNullable(material.getData(dataMapType));
    }
}
