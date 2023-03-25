package com.example.mycalculatorjetpackcompose

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.mycalculatorjetpackcompose.ui.ButtonAction
import com.example.mycalculatorjetpackcompose.ui.components.CalculatorButtonsGrid
import com.example.mycalculatorjetpackcompose.ui.components.ExpressionContainer
import com.example.mycalculatorjetpackcompose.ui.theme.MyCalculatorJetpackComposeTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      AppContainer()
    }
  }
}

@Composable
fun AppContainer() {
  MyCalculatorJetpackComposeTheme {
    Surface(
      modifier = Modifier.fillMaxSize(),
      color = MaterialTheme.colorScheme.background
    ) {
      Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
      ) {
        ExpressionContainer(
          modifier = Modifier.weight(3f),
          expression = "2+2",
          result = "4",
        )
        CalculatorButtonsGrid(
          rows = ButtonAction.getButtons(),
          modifier = Modifier.weight(6f)
        )
      }
    }
  }
}

@Preview(
  showBackground = true,
  device = Devices.PIXEL_3A_XL
)
@Preview(
  showBackground = true,
  uiMode = Configuration.UI_MODE_NIGHT_YES,
  device = Devices.PIXEL_3A_XL
)
@Composable
fun AppPreview() {
  AppContainer()
}