package lanse505.horrificattachments.utils.configs;

import lanse505.horrificattachments.utils.HAConstants;
import lanse505.horrificattachments.utils.configs.defaults.GeneralConfigs;
import lanse505.horrificattachments.utils.configs.defaults.chest.CloakOfShadowsConf;
import lanse505.horrificattachments.utils.configs.defaults.chest.WingsOfTheGreatWaspConf;
import lanse505.horrificattachments.utils.configs.defaults.chest.WingsOfTheVampireConf;
import lanse505.horrificattachments.utils.configs.defaults.feet.FeetOfTheStampedeConf;
import lanse505.horrificattachments.utils.configs.defaults.head.EyesOfTheNightstalkerConf;
import lanse505.horrificattachments.utils.configs.defaults.head.MandiblesOfTheStagBeetleConf;
import lanse505.horrificattachments.utils.configs.defaults.misc.ClawsOfTheWerewolfConf;
import lanse505.horrificattachments.utils.configs.defaults.misc.FingerOfTheFireSpriteConf;
import lanse505.horrificattachments.utils.configs.defaults.misc.MittensOfTheMoleMonsterConf;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

public class HAConfig {
    public static void postInit(FMLPostInitializationEvent event) {

    }

    @Config(modid = HAConstants.MOD_ID, name = HAConstants.MOD_NAME)
    public static class HAConfigs {
        public static GeneralConfigs general;
        public static Items modItems;

    }

    public static class Items {
        // Head Pieces
        public static EyesOfTheNightstalkerConf eyesOfTheNightstalker;
        public static MandiblesOfTheStagBeetleConf mandiblesOfTheStagBeetle;

        // Chest Pieces
        public static WingsOfTheVampireConf wingsOfTheVampire;
        public static WingsOfTheGreatWaspConf wingsOfTheGreatWasp;
        public static CloakOfShadowsConf cloakOfShadows;

        // Leg Pieces

        // Foot Pieces
        public static FeetOfTheStampedeConf feetOfTheStampede;

        // Held Items
        public static ClawsOfTheWerewolfConf clawsOfTheWerewolf;
        public static FingerOfTheFireSpriteConf fingerOfTheFireSprite;
        public static MittensOfTheMoleMonsterConf mittensOfTheMoleMonster;
    }

}
