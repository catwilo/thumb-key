@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

// AliceBoard — single-finger shell-first layout
// Grid: 1x8 main + 1x8 control
// Source of truth: aliceboard/layout.json v0.1.0

val KB_ALICE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("y"),
                    bottom = KeyC("c"),
                    left = KeyC("w"),
                    right = KeyC("h"),
                    topLeft = KeyC("!", color = MUTED),
                    topRight = KeyC("d"),
                    bottomLeft = KeyC("x", color = MUTED),
                    bottomRight = KeyC(".", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("é", color = MUTED),
                    bottom = KeyC("f"),
                    left = KeyC("`", color = MUTED),
                    right = KeyC("~", color = MUTED),
                    topLeft = KeyC("'", color = MUTED),
                    topRight = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("_", color = MUTED),
                    bottomRight = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("q"),
                    bottom = KeyC("z"),
                    left = KeyC("@", color = MUTED),
                    right = KeyC("%", color = MUTED),
                    topLeft = KeyC("á", color = MUTED),
                    topRight = KeyC("à", color = MUTED),
                    bottomLeft = KeyC("&", color = MUTED),
                    bottomRight = KeyC("—", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("u"),
                    bottom = KeyC("ó", color = MUTED),
                    left = KeyC("v"),
                    right = KeyC("p"),
                    topLeft = KeyC("ö", color = MUTED),
                    topRight = KeyC("ú", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("í", color = MUTED),
                    bottom = KeyC("k"),
                    left = KeyC("j"),
                    right = KeyC("g"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("ñ", color = MUTED),
                    bottom = KeyC("m"),
                    left = KeyC("b"),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("/", color = MUTED),
                    bottom = KeyC("|", color = MUTED),
                    left = KeyC(";", color = MUTED),
                    right = KeyC("d"),
                    topLeft = KeyC("#", color = MUTED),
                    topRight = KeyC("\\", color = MUTED),
                    bottomLeft = KeyC("$", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = EIGHT_WAY,
                    bottom = KeyC("l"),
                    left = KeyC("+", color = MUTED),
                    right = KeyC("=", color = MUTED),
                    bottomLeft = KeyC("?", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                        action = ToggleShiftMode(true),
                        swipeReturnAction = ToggleCurrentWordCapitalization(true),
                        color = MUTED,
                    ),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC(
                        action = ToggleShiftMode(false),
                        swipeReturnAction = ToggleCurrentWordCapitalization(false),
                    ),
                ),
                BACKSPACE_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
                EMOJI_KEY_ITEM,
                NUMERIC_KEY_ITEM,
            ),
        ),
    )

val KB_ALICE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("Y"),
                    bottom = KeyC("C"),
                    left = KeyC("W"),
                    right = KeyC("H"),
                    topLeft = KeyC("!", color = MUTED),
                    topRight = KeyC("D"),
                    bottomLeft = KeyC("X", color = MUTED),
                    bottomRight = KeyC(".", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("É", color = MUTED),
                    bottom = KeyC("F"),
                    left = KeyC("`", color = MUTED),
                    right = KeyC("~", color = MUTED),
                    topLeft = KeyC("'", color = MUTED),
                    topRight = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("_", color = MUTED),
                    bottomRight = KeyC(",", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("Q"),
                    bottom = KeyC("Z"),
                    left = KeyC("@", color = MUTED),
                    right = KeyC("%", color = MUTED),
                    topLeft = KeyC("Á", color = MUTED),
                    topRight = KeyC("À", color = MUTED),
                    bottomLeft = KeyC("&", color = MUTED),
                    bottomRight = KeyC("—", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("U"),
                    bottom = KeyC("Ó", color = MUTED),
                    left = KeyC("V"),
                    right = KeyC("P"),
                    topLeft = KeyC("Ö", color = MUTED),
                    topRight = KeyC("Ú", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("Í", color = MUTED),
                    bottom = KeyC("K"),
                    left = KeyC("J"),
                    right = KeyC("G"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("Ñ", color = MUTED),
                    bottom = KeyC("M"),
                    left = KeyC("B"),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    swipeType = EIGHT_WAY,
                    top = KeyC("/", color = MUTED),
                    bottom = KeyC("|", color = MUTED),
                    left = KeyC(";", color = MUTED),
                    right = KeyC("D"),
                    topLeft = KeyC("#", color = MUTED),
                    topRight = KeyC("\\", color = MUTED),
                    bottomLeft = KeyC("$", color = MUTED),
                    bottomRight = KeyC(":", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = EIGHT_WAY,
                    bottom = KeyC("L"),
                    left = KeyC("+", color = MUTED),
                    right = KeyC("=", color = MUTED),
                    bottomLeft = KeyC("?", color = MUTED),
                ),
            ),
            listOf(
                KeyItemC(
                    center = KeyC(
                        display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                        action = ToggleCapsLock,
                        color = MUTED,
                    ),
                    swipeType = TWO_WAY_VERTICAL,
                    bottom = KeyC(
                        action = ToggleShiftMode(false),
                        swipeReturnAction = ToggleCurrentWordCapitalization(false),
                    ),
                ),
                BACKSPACE_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
                EMOJI_KEY_ITEM,
                NUMERIC_KEY_ITEM,
            ),
        ),
    )

val KB_ALICE =
    KeyboardDefinition(
        title = "aliceboard",
        modes =
            KeyboardDefinitionModes(
                main = KB_ALICE_MAIN,
                shifted = KB_ALICE_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
    )
