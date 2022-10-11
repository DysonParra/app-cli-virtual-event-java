/*
 * @fileoverview {Tester} se encarga de realizar tareas especificas.
 *
 * @version             1.0
 *
 * @author              Dyson Arley Parra Tilano <dysontilano@gmail.com>
 * Copyright (C) Dyson Parra
 *
 * @History v1.0 --- La implementacion de {Tester} fue realizada el 31/07/2022.
 * @Dev - La primera version de {Tester} fue escrita por Dyson A. Parra T.
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
