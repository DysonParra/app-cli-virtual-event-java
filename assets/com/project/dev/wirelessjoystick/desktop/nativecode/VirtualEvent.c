/*
 * @fileoverview    {FileName}
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
#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
#include "VirtualEvent.h"

    // 16  VK_SHIFT
    // 17  VK_CONTROL
    // 18  VK_MENU
    // 91  VK_LWIN
    // 92  VK_RWIN
    // 160 VK_LSHIFT
    // 161 VK_RSHIFT
    // 162 VK_LCONTROL
    // 163 VK_RCONTROL
    // 164 VK_LMENU
    // 165 VK_RMENU

/**
 * FIXME: Definición de {@code runVirtualKeyEvent}.
 * Simula la pulsación de una tecla.
 */
JNIEXPORT void JNICALL Java_com_project_dev_wirelessjoystick_desktop_nativecode_VirtualEvent_runVirtualKeyEvent
(JNIEnv *env, jobject jobj, jint eventCode) {
    int eventCodeAux = 0;

    // Evalúa la tecla obtenida.
    switch (eventCode) {
        case VK_SHIFT:
            eventCodeAux = VK_LSHIFT;
            break;

        case VK_CONTROL:
            eventCodeAux = VK_LCONTROL;
            break;

        case VK_MENU:
            eventCodeAux = VK_LMENU;
            break;

        default:
            eventCodeAux = eventCode;
    }

    //printf("The event Code is %d\n", eventCodeAux);
    //Sleep(2000);
    keybd_event(eventCode,0,KEYEVENTF_EXTENDEDKEY,0);
    keybd_event(eventCode,0,KEYEVENTF_KEYUP,0);
}

#define VK_LBUTTON_DOUBLE 0x07

/**
 * FIXME: Definición de {@code runVirtualMouseClicEvent}.
 * Simula un evento de clic.
 */
JNIEXPORT void JNICALL Java_com_project_dev_wirelessjoystick_desktop_nativecode_VirtualEvent_runVirtualMouseClicEvent
(JNIEnv *env, jobject jobj, jint eventCode) {
    // Crea variable para almacenar las coordenadas actuales del mouse.
    POINT position;

    // Almacena las coordenadas actuales.
    GetCursorPos(&position);
    int positionX = position.x;
    int positionY = position.y;

    // Asignamos posición al mouse.
    // SetCursorPos(0,0);

    //printf("The event Code is %d\n", eventCode);

    // Evalúa el tipo de clic obtenido.
    switch (eventCode) {
        case VK_LBUTTON:                                                    // Clic.
            mouse_event(MOUSEEVENTF_LEFTDOWN,   positionX, positionY,0,0);
            mouse_event(MOUSEEVENTF_LEFTUP,     positionX, positionY,0,0);
            break;

        case VK_RBUTTON:                                                    // Clic derecho.
            mouse_event(MOUSEEVENTF_RIGHTDOWN,  positionX, positionY,0,0);
            mouse_event(MOUSEEVENTF_RIGHTUP,    positionX, positionY,0,0);
            break;

        case VK_MBUTTON:                                                    // Clic medio.
            mouse_event(MOUSEEVENTF_MIDDLEDOWN, positionX, positionY,0,0);
            mouse_event(MOUSEEVENTF_MIDDLEUP,   positionX, positionY,0,0);
            break;

        case VK_LBUTTON_DOUBLE:                                             // Doble clic.
            mouse_event(MOUSEEVENTF_LEFTDOWN,   positionX, positionY,0,0);
            mouse_event(MOUSEEVENTF_LEFTUP,     positionX, positionY,0,0);
            mouse_event(MOUSEEVENTF_LEFTDOWN,   positionX, positionY,0,0);
            mouse_event(MOUSEEVENTF_LEFTUP,     positionX, positionY,0,0);
            break;

        default:
            break;
    }
}

#define  VK_MOUSE_MOVE_EVENT_LEFT  10
#define  VK_MOUSE_MOVE_EVENT_RIGHT 20
#define  VK_MOUSE_MOVE_EVENT_UP    30
#define  VK_MOUSE_MOVE_EVENT_DOWN  40

/**
 * FIXME: Definición de {@code runVirtualMouseMoveEvent}.
 * Simula un evento de movimiento de mouse.
 */
JNIEXPORT void JNICALL Java_com_project_dev_wirelessjoystick_desktop_nativecode_VirtualEvent_runVirtualMouseMoveEvent
(JNIEnv *env, jobject jobj, jint eventCode, jint pixelQuantity) {
    // Crea variable para almacenar las coordenadas actuales del mouse.
    POINT position;

    // Almacena las coordenadas actuales.
    GetCursorPos(&position);
    int positionX = position.x;
    int positionY = position.y;

    // Evalúa el tipo de mover obtenido.
    switch (eventCode) {
        case VK_MOUSE_MOVE_EVENT_LEFT:                                              // Izquierda.
            SetCursorPos(positionX - pixelQuantity, positionY);                     // Asignamos posición al mouse.
            break;

        case VK_MOUSE_MOVE_EVENT_RIGHT:                                             // Derecha.
            SetCursorPos(positionX + pixelQuantity, positionY);                     // Asignamos posición al mouse.
            break;

        case VK_MOUSE_MOVE_EVENT_UP:                                                // Arriba.
            SetCursorPos(positionX, positionY - pixelQuantity);                     // Asignamos posición al mouse.
            break;

        case VK_MOUSE_MOVE_EVENT_DOWN:                                              // Abajo.
            SetCursorPos(positionX, positionY + pixelQuantity);                     // Asignamos posición al mouse.
            break;

        default:
            break;
    }
}

