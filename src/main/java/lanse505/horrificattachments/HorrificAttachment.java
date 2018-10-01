package lanse505.horrificattachments;

import lanse505.horrificattachments.common.CommonProxy;
import lanse505.horrificattachments.utils.HAConstants;
import lanse505.horrificattachments.utils.configs.HAConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = HAConstants.MOD_ID, name = HAConstants.MOD_NAME, version = HAConstants.VERSION, acceptedMinecraftVersions = HAConstants.MCVER)
public class HorrificAttachment {

    @SidedProxy(clientSide = HAConstants.PROXY_CLIENT, serverSide = HAConstants.PROXY_COMMON, modId = HAConstants.MOD_ID)
    public static CommonProxy PROXY;
    public static Logger LOGGER;

    @Mod.Instance(value = HAConstants.MOD_ID)
    public static HorrificAttachment horrificAttachment;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER = event.getModLog();
        PROXY.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        PROXY.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        HAConfig.postInit(event);
        PROXY.postInit(event);
    }
}
