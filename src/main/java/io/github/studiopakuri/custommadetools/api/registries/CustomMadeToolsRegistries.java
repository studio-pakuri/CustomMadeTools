package io.github.studiopakuri.custommadetools.api.registries;

import io.github.studiopakuri.custommadetools.api.CustomMadeToolsApi;
import io.github.studiopakuri.custommadetools.api.tool.part.ToolPartType;
import io.github.studiopakuri.custommadetools.api.tool.part.material.ToolPartMaterial;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.neoforged.neoforge.registries.RegistryBuilder;

public final class CustomMadeToolsRegistries {
    public static final Registry<ToolPartType<?>> TOOL_PART_TYPE = new RegistryBuilder<>(Key.TOOL_PART_TYPE)
        .sync(true)
        .create();
    public static final Registry<ToolPartMaterial> TOOL_PART_MATERIAL = new RegistryBuilder<>(Key.TOOL_PART_MATERIAL)
        .sync(true)
        .create();
    private CustomMadeToolsRegistries(){}
    public static final class Key{
        public static final ResourceKey<Registry<ToolPartType<?>>> TOOL_PART_TYPE = ResourceKey.createRegistryKey(
            create("tool_part_type")
        );
        public static final ResourceKey<Registry<ToolPartMaterial>> TOOL_PART_MATERIAL = ResourceKey.createRegistryKey(
            create("tool_part_material")
        );
        private Key(){}
        private static Identifier create(String path){
            return Identifier.fromNamespaceAndPath(CustomMadeToolsApi.MODID, path);
        }
    }
}
