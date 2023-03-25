package com.example.mycalculatorjetpackcompose.ui

import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

sealed class ButtonAction(val text: String) {
  companion object {
    private val colorSurface: ButtonColors
      @Composable
      get() = ButtonDefaults.buttonColors(
        containerColor = MaterialTheme.colorScheme.surfaceVariant,
        contentColor = MaterialTheme.colorScheme.onSurfaceVariant
      )

    private val colorPrimary: ButtonColors
      @Composable
      get() = ButtonDefaults.buttonColors(
        containerColor = MaterialTheme.colorScheme.primaryContainer,
        contentColor = MaterialTheme.colorScheme.onPrimaryContainer
      )

    private val colorSecondary: ButtonColors
      @Composable
      get() = ButtonDefaults.buttonColors(
        containerColor = MaterialTheme.colorScheme.secondaryContainer,
        contentColor = MaterialTheme.colorScheme.onSecondaryContainer
      )

    private val colorTertiary: ButtonColors
      @Composable
      get() = ButtonDefaults.buttonColors(
        containerColor = MaterialTheme.colorScheme.tertiaryContainer,
        contentColor = MaterialTheme.colorScheme.onTertiaryContainer
      )

    @Composable
    fun ButtonAction.getColorByButton(): ButtonColors = when (this) {
      is Button1, Button2, Button3, Button4, Button5, Button6, Button7, Button8, Button9, Button0, ButtonDot, ButtonRemove -> colorSurface
      is ButtonOpenBracket, ButtonCloseBracket, ButtonDivide, ButtonMultiply, ButtonMinus, ButtonPlus -> colorSecondary
      is ButtonEqual -> colorPrimary
      is ButtonClear -> colorTertiary
    }

    private fun rowButtons1() = listOf(
      ButtonClear,
      ButtonOpenBracket,
      ButtonCloseBracket,
      ButtonDivide,
    )

    private fun rowButtons2() = listOf(
      Button7,
      Button8,
      Button9,
      ButtonMultiply,
    )

    private fun rowButtons3() = listOf(
      Button4,
      Button5,
      Button6,
      ButtonMinus,
    )

    private fun rowButtons4() = listOf(
      Button1,
      Button2,
      Button3,
      ButtonPlus,
    )

    private fun rowButtons5() = listOf(
      Button0,
      ButtonDot,
      ButtonRemove,
      ButtonEqual,
    )

    fun getButtons() = listOf(
      rowButtons1(),
      rowButtons2(),
      rowButtons3(),
      rowButtons4(),
      rowButtons5()
    )
  }

  object Button1 : ButtonAction("1")
  object Button2 : ButtonAction("2")
  object Button3 : ButtonAction("3")
  object Button4 : ButtonAction("4")
  object Button5 : ButtonAction("5")
  object Button6 : ButtonAction("6")
  object Button7 : ButtonAction("7")
  object Button8 : ButtonAction("8")
  object Button9 : ButtonAction("9")
  object Button0 : ButtonAction("0")
  object ButtonDot : ButtonAction(".")
  object ButtonRemove : ButtonAction("B")
  object ButtonClear : ButtonAction("AC")
  object ButtonOpenBracket : ButtonAction("(")
  object ButtonCloseBracket : ButtonAction(")")
  object ButtonEqual : ButtonAction("=")
  object ButtonPlus : ButtonAction("+")
  object ButtonMinus : ButtonAction("-")
  object ButtonMultiply : ButtonAction("*")
  object ButtonDivide : ButtonAction("/")
}
