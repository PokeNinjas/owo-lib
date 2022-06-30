package io.wispforest.owo.ui.inject;

import net.minecraft.client.gui.widget.ButtonWidget;

public interface ButtonWidgetExtension {

    default ButtonWidget onPress(ButtonWidget.PressAction pressAction) {
        throw new IllegalStateException("Interface default method called");
    }

}
