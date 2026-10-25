package io.github.studiopakuri.custommadetools;

import io.github.studiopakuri.custommadetools.api.CustomMadeToolsApi;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(CustomMadeTools.MODID)
public class CustomMadeTools {
    public static final String MODID = CustomMadeToolsApi.MODID;
    public static final Logger LOGGER = LogUtils.getLogger();

    public CustomMadeTools(IEventBus modEventBus, ModContainer modContainer) {
    }
}
