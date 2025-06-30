package expensive.util.visual.main.color.fonts;

import expensive.util.visual.main.color.ColorUtils;

import net.minecraft.util.text.Color;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;

public class GradientUtil {

    public static StringTextComponent gradient(String message) {

        StringTextComponent text = new StringTextComponent("");
        for (int i = 0; i < message.length(); i++) {
            text.append(new StringTextComponent(String.valueOf(message.charAt(i))).setStyle(Style.EMPTY.setColor(new Color(ColorUtils.getColor(i)))));
        }

        return text;

    }

}
