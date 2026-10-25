package io.github.studiopakuri.custommadetools.event;

import io.github.studiopakuri.custommadetools.CustomMadeTools;
import io.github.studiopakuri.custommadetools.api.registries.CustomMadeToolsRegistries;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.registries.NewRegistryEvent;

@EventBusSubscriber(modid = CustomMadeTools.MODID)
public class NewRegistriesRegister {
    @SubscribeEvent
    public static void register(NewRegistryEvent event){
        event.register(CustomMadeToolsRegistries.TOOL_PART_TYPE);
        event.register(CustomMadeToolsRegistries.TOOL_PART_MATERIAL);
    }
}
