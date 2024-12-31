package auxiliary.ui;

import arc.scene.ui.layout.Table;
import auxiliary.core.BuildingRestoration;
import auxiliary.core.FullResource;
import mindustry.Vars;
import mindustry.gen.Icon;
import mindustry.ui.Styles;
import mindustry.ui.dialogs.BaseDialog;

public class HugUI {
    static BaseDialog dialog = new BaseDialog("");
    static Table table = new Table();
    public static void init() {
        Vars.ui.hudGroup.fill(t -> {
            t.button(Icon.fill, FullResource::onClick).size(40f).tooltip(tt -> {
                tt.setBackground(Styles.black6);
                tt.label(() -> "资源全满").pad(2f);
            });
            t.top();
            t.x = 300;
        });
        Vars.ui.hudGroup.fill(t -> {
            t.button(Icon.refresh1, BuildingRestoration::onClick).size(40f).tooltip(tt -> {
                tt.setBackground(Styles.black6);
                tt.label(() -> "建筑修复").pad(2f);
            });
            t.top();
            t.x = 350;
        });
        load();
        Vars.ui.hudGroup.fill(t -> {
            t.button(Icon.editorSmall, dialog::show).size(40f).tooltip(tt -> {
                tt.setBackground(Styles.black6);
                tt.label(() -> "编辑器").pad(2f);
            });
            t.top();
            t.x = 400;
        });
    }

    public static void load() {
        table.image(Icon.fileTextFillSmall).size(50);
        table.image(Icon.fileTextFill).size(50);
        table.image(Icon.fileSmall).size(50);
        table.image(Icon.file).size(50);
        table.image(Icon.fileTextSmall).size(50);
        table.image(Icon.fileText).size(50);
        table.image(Icon.leftSmall).size(50);
        table.image(Icon.left).size(50);
        table.image(Icon.rightSmall).size(50);
        table.image(Icon.right).size(50);
        table.image(Icon.upSmall).size(50);
        table.image(Icon.up).size(50);
        table.image(Icon.downSmall).size(50);
        table.image(Icon.down).size(50);
        table.image(Icon.homeSmall).size(50);
        table.image(Icon.home).size(50);
        table.image(Icon.okSmall).size(50);
        table.image(Icon.ok).size(50);
        table.image(Icon.imageSmall).size(50);
        table.image(Icon.image).size(50);
        table.image(Icon.starSmall).size(50);
        table.image(Icon.star).size(50);
        table.image(Icon.resizeSmall).size(50);
        table.image(Icon.resize).size(50);
        table.image(Icon.wrenchSmall).size(50);
        table.image(Icon.wrench).size(50);
        table.image(Icon.githubSquareSmall).size(50);
        table.image(Icon.githubSquare).size(50);
        table.image(Icon.fileImageSmall).size(50);
        table.image(Icon.fileImage).size(50);
        table.image(Icon.imageSmall).size(50);
        table.row();
        table.image(Icon.image).size(50);
        table.image(Icon.editSmall).size(50);
        table.image(Icon.edit).size(50);
        table.image(Icon.chartBarSmall).size(50);
        table.image(Icon.chartBar).size(50);
        table.image(Icon.planeOutlineSmall).size(50);
        table.image(Icon.planeOutline).size(50);
        table.image(Icon.filterSmall).size(50);
        table.image(Icon.filter).size(50);
        table.image(Icon.folderSmall).size(50);
        table.image(Icon.folder).size(50);
        table.image(Icon.steamSmall).size(50);
        table.image(Icon.steam).size(50);
        table.row();
        table.image(Icon.downOpenSmall).size(50);
        table.image(Icon.downOpen).size(50);
        table.image(Icon.leftOpenSmall).size(50);
        table.image(Icon.leftOpen).size(50);
        table.image(Icon.upOpenSmall).size(50);
        table.image(Icon.upOpen).size(50);
        table.image(Icon.mapSmall).size(50);
        table.image(Icon.map).size(50);
        table.image(Icon.rotateSmall).size(50);
        table.image(Icon.rotate).size(50);
        table.image(Icon.playSmall).size(50);
        table.image(Icon.play).size(50);
        table.image(Icon.pauseSmall).size(50);
        table.image(Icon.pause).size(50);
        table.image(Icon.listSmall).size(50);
        table.image(Icon.list).size(50);
        table.image(Icon.cancelSmall).size(50);
        table.row();
        table.image(Icon.cancel).size(50);
        table.image(Icon.moveSmall).size(50);
        table.image(Icon.move).size(50);
        table.image(Icon.terminalSmall).size(50);
        table.image(Icon.terminal).size(50);
        table.image(Icon.undoSmall).size(50);
        table.image(Icon.undo).size(50);
        table.image(Icon.redoSmall).size(50);
        table.image(Icon.redo).size(50);
        table.image(Icon.infoSmall).size(50);
        table.image(Icon.info).size(50);
        table.image(Icon.infoCircleSmall).size(50);
        table.image(Icon.infoCircle).size(50);
        table.image(Icon.rightOpenOutSmall).size(50);
        table.image(Icon.rightOpenOut).size(50);
        table.image(Icon.rightOpenSmall).size(50);
        table.image(Icon.rightOpen).size(50);
        table.image(Icon.wavesSmall).size(50);
        table.image(Icon.waves).size(50);
        table.image(Icon.filtersSmall).size(50);
        table.image(Icon.filters).size(50);
        table.image(Icon.layersSmall).size(50);
        table.image(Icon.layers).size(50);
        table.image(Icon.eraserSmall).size(50);
        table.image(Icon.eraser).size(50);
        table.image(Icon.bookOpenSmall).size(50);
        table.image(Icon.bookOpen).size(50);
        table.image(Icon.gridSmall).size(50);
        table.image(Icon.grid).size(50);
        table.image(Icon.flipXSmall).size(50);
        table.image(Icon.flipX).size(50);
        table.row();
        table.image(Icon.flipYSmall).size(50);
        table.image(Icon.flipY).size(50);
        table.image(Icon.diagonalSmall).size(50);
        table.image(Icon.diagonal).size(50);
        table.image(Icon.discordSmall).size(50);
        table.image(Icon.discord).size(50);
        table.image(Icon.boxSmall).size(50);
        table.image(Icon.box).size(50);
        table.image(Icon.redditAlienSmall).size(50);
        table.image(Icon.redditAlien).size(50);
        table.image(Icon.githubSmall).size(50);
        table.image(Icon.github).size(50);
        table.image(Icon.googleplaySmall).size(50);
        table.image(Icon.googleplay).size(50);
        table.image(Icon.androidSmall).size(50);
        table.image(Icon.android).size(50);
        table.image(Icon.trelloSmall).size(50);
        table.image(Icon.trello).size(50);
        table.image(Icon.logicSmall).size(50);
        table.image(Icon.logic).size(50);
        table.image(Icon.distributionSmall).size(50);
        table.image(Icon.distribution).size(50);
        table.image(Icon.hammerSmall).size(50);
        table.image(Icon.hammer).size(50);
        table.image(Icon.saveSmall).size(50);
        table.image(Icon.save).size(50);
        table.image(Icon.linkSmall).size(50);
        table.image(Icon.link).size(50);
        table.image(Icon.itchioSmall).size(50);
        table.image(Icon.itchio).size(50);
        table.image(Icon.lineSmall).size(50);
        table.row();
        table.image(Icon.line).size(50);
        table.image(Icon.adminSmall).size(50);
        table.image(Icon.admin).size(50);
        table.image(Icon.spray1Small).size(50);
        table.image(Icon.spray1).size(50);
        table.image(Icon.craftingSmall).size(50);
        table.image(Icon.crafting).size(50);
        table.image(Icon.fillSmall).size(50);
        table.image(Icon.fill).size(50);
        table.image(Icon.pasteSmall).size(50);
        table.image(Icon.paste).size(50);
        table.image(Icon.effectSmall).size(50);
        table.image(Icon.effect).size(50);
        table.image(Icon.bookSmall).size(50);
        table.image(Icon.book).size(50);
        table.image(Icon.liquidSmall).size(50);
        table.image(Icon.liquid).size(50);
        table.image(Icon.hostSmall).size(50);
        table.image(Icon.host).size(50);
        table.image(Icon.productionSmall).size(50);
        table.image(Icon.production).size(50);
        table.image(Icon.exitSmall).size(50);
        table.image(Icon.exit).size(50);
        table.image(Icon.modePvpSmall).size(50);
        table.image(Icon.modePvp).size(50);
        table.image(Icon.modeAttackSmall).size(50);
        table.image(Icon.modeAttack).size(50);
        table.image(Icon.refresh1Small).size(50);
        table.image(Icon.refresh1).size(50);
        table.image(Icon.noneSmall).size(50);
        table.image(Icon.none).size(50);
        table.row();
        table.image(Icon.pencilSmall).size(50);
        table.image(Icon.pencil).size(50);
        table.image(Icon.refreshSmall).size(50);
        table.image(Icon.refresh).size(50);
        table.image(Icon.modeSurvivalSmall).size(50);
        table.image(Icon.modeSurvival).size(50);
        table.image(Icon.commandRallySmall).size(50);
        table.image(Icon.commandRally).size(50);
        table.image(Icon.unitsSmall).size(50);
        table.image(Icon.units).size(50);
        table.image(Icon.commandAttackSmall).size(50);
        table.image(Icon.commandAttack).size(50);
        table.image(Icon.trashSmall).size(50);
        table.image(Icon.trash).size(50);
        table.image(Icon.chatSmall).size(50);
        table.image(Icon.chat).size(50);
        table.image(Icon.turretSmall).size(50);
        table.image(Icon.turret).size(50);
        table.image(Icon.playersSmall).size(50);
        table.image(Icon.players).size(50);
        table.image(Icon.editorSmall).size(50);
        table.image(Icon.editor).size(50);
        table.image(Icon.copySmall).size(50);
        table.image(Icon.copy).size(50);
        table.image(Icon.treeSmall).size(50);
        table.image(Icon.tree).size(50);
        table.image(Icon.lockOpenSmall).size(50);
        table.image(Icon.lockOpen).size(50);
        table.image(Icon.pickSmall).size(50);
        table.image(Icon.pick).size(50);
        table.image(Icon.exportSmall).size(50);
        table.row();
        table.image(Icon.export).size(50);
        table.image(Icon.downloadSmall).size(50);
        table.image(Icon.download).size(50);
        table.image(Icon.uploadSmall).size(50);
        table.image(Icon.upload).size(50);
        table.image(Icon.settingsSmall).size(50);
        table.image(Icon.settings).size(50);
        table.image(Icon.spraySmall).size(50);
        table.image(Icon.spray).size(50);
        table.image(Icon.zoomSmall).size(50);
        table.image(Icon.zoom).size(50);
        table.image(Icon.powerOldSmall).size(50);
        table.image(Icon.powerOld).size(50);
        table.image(Icon.powerSmall).size(50);
        table.image(Icon.power).size(50);
        table.image(Icon.menuSmall).size(50);
        table.image(Icon.menu).size(50);
        table.image(Icon.lockSmall).size(50);
        table.image(Icon.lock).size(50);
        table.image(Icon.eyeSmall).size(50);
        table.image(Icon.eye).size(50);
        table.image(Icon.eyeOffSmall).size(50);
        table.image(Icon.eyeOff).size(50);
        table.image(Icon.warningSmall).size(50);
        table.image(Icon.warning).size(50);
        table.image(Icon.terrainSmall).size(50);
        table.image(Icon.terrain).size(50);
        table.image(Icon.defenseSmall).size(50);
        table.image(Icon.defense).size(50);
        table.image(Icon.planetSmall).size(50);
        table.image(Icon.planet).size(50);
        dialog.cont.add(table);
        dialog.addCloseButton();
    }
}
