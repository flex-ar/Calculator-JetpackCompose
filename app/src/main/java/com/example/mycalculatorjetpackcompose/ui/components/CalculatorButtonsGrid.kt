package com.example.mycalculatorjetpackcompose.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mycalculatorjetpackcompose.ui.ButtonAction
import com.example.mycalculatorjetpackcompose.ui.theme.MyCalculatorJetpackComposeTheme
import com.example.mycalculatorjetpackcompose.ui.theme.spacing

@Composable
fun CalculatorButtonsRow(row: List<ButtonAction>) {
  Row(
    modifier = Modifier
      .fillMaxWidth()
      .padding(
        start = MaterialTheme.spacing.default,
        end = MaterialTheme.spacing.default
      ),
    horizontalArrangement = Arrangement.spacedBy(
      space = MaterialTheme.spacing.default,
      alignment = Alignment.CenterHorizontally
    ),
    verticalAlignment = Alignment.CenterVertically
  ) {
    row.forEach {
      CalculatorButton(
        button = it,
        modifier = Modifier
          .weight(1f)
          .aspectRatio(1f)
      )
    }
  }
}

@Composable
fun CalculatorButtonsGrid(rows: List<List<ButtonAction>>, modifier: Modifier = Modifier) {
  Column(
    modifier = modifier
      .padding(
        bottom = MaterialTheme.spacing.medium,
        top = MaterialTheme.spacing.default
      ),
    verticalArrangement = Arrangement.spacedBy(
      space = MaterialTheme.spacing.default,
      alignment = Alignment.Bottom
    ),
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    rows.forEach {
      CalculatorButtonsRow(row = it)
    }
  }
}

@Preview(showBackground = true)
@Preview(
  showBackground = true,
  uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Composable
fun CalculatorButtonLayoutPreview() {
  MyCalculatorJetpackComposeTheme {
    Surface {
      CalculatorButtonsGrid(rows = ButtonAction.getButtons())
    }
  }
}
