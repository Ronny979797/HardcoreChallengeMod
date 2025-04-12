package net.hardcorechallenge;

import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;

import java.util.HashMap;
import java.util.Map;

public class QuestManager {
    private static final Map<Integer, String> dailyQuests = new HashMap<>();

    static {
        dailyQuests.put(1, "Nur Holztools erlaubt");
        dailyQuests.put(2, "Crafting Table verboten");
        dailyQuests.put(3, "Kein Wasserkontakt erlaubt");
        dailyQuests.put(4, "Kein Essen erlaubt");
        dailyQuests.put(5, "Schlafen verboten");
        // … du kannst hier beliebig weitermachen oder später von JSON laden
    }

    public static void showQuestToPlayer(ServerPlayerEntity player, int day) {
        String quest = dailyQuests.getOrDefault(day, "Keine Quest heute.");
        player.sendMessage(Text.literal("§6Tag " + day + " - §e" + quest), false);
    }

    public static void runDailyCheck(ServerPlayerEntity player, int day) {
        // Hier wird z. B. pro Tag Effekte, Einschränkungen, etc. ausgelöst
        showQuestToPlayer(player, day);
    }
}
