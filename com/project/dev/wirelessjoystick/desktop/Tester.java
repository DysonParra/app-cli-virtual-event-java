/*
 * @fileoverview    {Tester} se encarga de realizar tareas específicas.
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementación realizada.
 * @version 2.0     Documentación agregada.
 */
package com.project.dev.wirelessjoystick.desktop;

import com.project.dev.wirelessjoystick.desktop.nativecode.*;

/**
 * TODO: Definición de {@code Tester}.
 *
 * @author Dyson Parra
 * @since 1.8
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
