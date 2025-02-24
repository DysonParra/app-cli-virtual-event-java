/*
 * @fileoverview    {Tester}
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementation done.
 * @version 2.0     Documentation added.
 */
package com.project.dev.wirelessjoystick.desktop;

import com.project.dev.wirelessjoystick.desktop.nativecode.*;

/**
 * TODO: Description of {@code Tester}.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
public class Tester {

    /**
     * Entrada principal del sistema.
     *
     * @param args argumentos de la linea de comandos.
     */
    public static void main(String[] args) {
        VirtualEvent virtualEvent = new VirtualEvent();

        virtualEvent.runVirtualKeyEvent(91);

        //virtualEvent.runVirtualMouseClicEvent(VirtualEvent.VK_MOUSE_CLIC_EVENT_LEFT);
        //virtualEvent.runVirtualMouseClicEvent(VirtualEvent.VK_MOUSE_CLIC_EVENT_RIGHT);
        //virtualEvent.runVirtualMouseClicEvent(VirtualEvent.VK_MOUSE_CLIC_EVENT_MIDDLE);
        //virtualEvent.runVirtualMouseClicEvent(VirtualEvent.VK_MOUSE_CLIC_EVENT_LEFT_DOUBLE);

        //virtualEvent.runVirtualMouseMoveEvent(VirtualEvent.VK_MOUSE_MOVE_EVENT_LEFT,  20);
        //virtualEvent.runVirtualMouseMoveEvent(VirtualEvent.VK_MOUSE_MOVE_EVENT_RIGHT, 20);
        //virtualEvent.runVirtualMouseMoveEvent(VirtualEvent.VK_MOUSE_MOVE_EVENT_UP,    20);
        //virtualEvent.runVirtualMouseMoveEvent(VirtualEvent.VK_MOUSE_MOVE_EVENT_DOWN,  20);
    }
 }
