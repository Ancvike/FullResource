package auxiliary;

import auxiliary.binding.KeyBind;
import auxiliary.dialogs.Dialogs;
import arc.Events;
import auxiliary.function.FunctionManager;
import auxiliary.ui.SettingUI;
import mindustry.game.EventType;
import mindustry.mod.Mod;

public class AuxiliaryMod extends Mod {
    public void init() {
        Events.on(EventType.ClientLoadEvent.class, e -> {
            Dialogs.init();
            SettingUI.init();
            KeyBind.init();
            FunctionManager.init();
        });
    }
}
