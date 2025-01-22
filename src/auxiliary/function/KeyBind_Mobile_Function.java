package auxiliary.function;

import arc.Events;
import arc.scene.ui.ImageButton;
import arc.scene.ui.layout.Table;
import mindustry.game.EventType;
import mindustry.gen.Icon;

import static mindustry.Vars.player;
import static mindustry.Vars.state;

public class KeyBind_Mobile_Function extends Function {
    public static boolean isClick = false;
    ImageButton button = new ImageButton(icon);

    public KeyBind_Mobile_Function() {
        super("mobile-building-repair", Icon.android, "建筑修复");
        Events.run(EventType.Trigger.update, () -> {
            button.setDisabled(!state.rules.waves && state.isCampaign());
            button.clicked(this::onClick);
        });
    }

    @Override
    public Table setTable() {
        return new Table(t -> {
            t.name = name;
            t.add(button).size(50);
        });
    }

    @Override
    public void onClick() {
        isClick = !isClick;
        player.shooting = false;
    }
}