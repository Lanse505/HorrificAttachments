package lanse505.horrificattachments.utils.configs.defaults.chest;

import net.minecraftforge.common.config.Config;

public class WingsOfTheVampireConf {
    @Config.Comment("Decides if this item is loaded or not")
    public static boolean loaded = true;

    @Config.Comment("Sets the amounts of ticks you'll be able to fly with the Vampire Wings without having to land.")
    public static int flightTicks = 6000;
}
