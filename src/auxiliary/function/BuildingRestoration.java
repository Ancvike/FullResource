package auxiliary.function;

import arc.scene.ui.layout.Table;
import auxiliary.dialogs.Dialogs;
import mindustry.game.Team;
import mindustry.gen.Building;
import mindustry.gen.Icon;
import mindustry.ui.dialogs.BaseDialog;

import static auxiliary.dialogs.Dialogs.dialog_no;
import static mindustry.Vars.state;

public class BuildingRestoration extends Function {
    private static final BaseDialog dialog_restoration = new BaseDialog("确认页面");

    public BuildingRestoration() {
        super("building-restoration", Icon.refresh1, "建筑修复");

        Table table = new Table();
        table.add("你确定要修复所有建筑吗?").size(200f, 50f).row();
        table.button("确定", this::click_yes).size(120f, 50f);
        table.button("取消", this::click_no).size(120f, 50f);

        Dialogs.setDialog_yes(dialog_restoration, table);
    }

    @Override
    public void onClick() {
        if (!state.rules.waves && state.isCampaign()) {
            dialog_restoration.show();
        } else {
            dialog_no.show();
        }
    }

    private void click_no() {
        dialog_restoration.hide();
    }

    private void click_yes() {
        restoration();
        click_no();
    }

    private void restoration() {
        for (Building building : Team.sharded.data().buildings) {
            building.health = building.maxHealth;
        }
    }
}