package com.example.mycalculatorjetpackcompose.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycalculatorjetpackcompose.ui.ButtonAction
import com.example.mycalculatorjetpackcompose.ui.ButtonAction.Companion.getColorByButton
import com.example.mycalculatorjetpackcompose.ui.theme.MyCalculatorJetpackComposeTheme

@Composable
fun CalculatorButton(button: ButtonAction, modifier: Modifier = Modifier, onClick: () -> Unit = {}) {
  Button(
    onClick = onClick,
    modifier = modifier,
    colors = button.getColorByButton()
  ) {
    Text(
      text = button.text,
      style = MaterialTheme.typography.headlineMedium,
      textAlign = TextAlign.Center
    )
  }
}

@Preview(showBackground = true)
@Preview(
  showBackground = true,
  uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Composable
fun CalculatorButtonPreview() {
  MyCalculatorJetpackComposeTheme {
    CalculatorButton(
      button = ButtonAction.ButtonClear,
      modifier = Modifier.size(100.dp)
    )
  }
}