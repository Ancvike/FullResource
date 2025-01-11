package auxiliary.ui;

import arc.Core;
import arc.input.KeyCode;
import arc.scene.event.InputEvent;
import arc.scene.event.InputListener;
import arc.scene.ui.Dialog;
import arc.struct.Seq;
import auxiliary.binding.MyKeyBind;
import mindustry.Vars;
import mindustry.graphics.Pal;
import mindustry.ui.Styles;
import mindustry.ui.dialogs.BaseDialog;

import static auxiliary.binding.MyKeyBind.*;

public class SettingUI {
    private static final BaseDialog dialog_setting = new BaseDialog("确认页面");
    public static final Seq<MyKeyBind> keys = new Seq<>();

    public static void init() {
        setDialog_setting();
        keys.addAll(CONVEYOR_CHANGE, RECOVERY_BUDDING, RECOVERY_UNIT);
        Vars.ui.settings.addCategory("AuxiliaryMod设置", t -> {
            if (Core.app.isDesktop()) {
                for (MyKeyBind key : keys) {
                    t.add(key.getName()).left().padRight(40).padLeft(8);
                    t.label(() -> key.nowKeyCode.value).color(Pal.accent).left().minWidth(90).padRight(20);

                    t.button("重新绑定", Styles.defaultt, () -> openDialog(key)).width(130f);
                    t.button("恢复默认", Styles.defaultt, () -> resetKeyBind(key)).width(130f).pad(2f).padLeft(4f);
                    t.row();
                }
            } else {
                dialog_setting.show();
            }
        });
    }

    private static void openDialog(MyKeyBind key) {
        Dialog rebindDialog = new Dialog("请按一个键…");
        rebindDialog.titleTable.getCells().first().pad(4);
        rebindDialog.addListener(new InputListener() {
            @Override
            public boolean keyDown(InputEvent event, KeyCode keycode) {
                rebindDialog.hide();
                update(key, keycode);
                return false;
            }
        });
        rebindDialog.show();
    }

    private static void setDialog_setting() {
        dialog_setting.cont.add("当前Mod设置只有电脑端的更改键盘键位设置,其他端无需该功能").row();
        dialog_setting.addCloseButton();
    }
}