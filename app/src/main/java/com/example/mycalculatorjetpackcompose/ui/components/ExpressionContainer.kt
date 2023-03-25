package com.example.mycalculatorjetpackcompose.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycalculatorjetpackcompose.ui.theme.MyCalculatorJetpackComposeTheme

@Composable
fun ExpressionContainer(expression: String, result: String, modifier: Modifier = Modifier) {
  Surface(
    modifier = modifier,
    shape = RoundedCornerShape(
      bottomStart = 30.dp,
      bottomEnd = 30.dp
    ),
    color = MaterialTheme.colorScheme.surfaceVariant
  ) {
    Column(
      modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp),
      verticalArrangement = Arrangement.Bottom,
      horizontalAlignment = Alignment.End
    ) {
      ExpressionText(expression = expression)
      ExpressionResultText(result = result)
    }
  }
}

@Preview(showBackground = true)
@Preview(
  showBackground = true,
  uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun ExpressionContainerPreview() {
  MyCalculatorJetpackComposeTheme {
    Surface(color = MaterialTheme.colorScheme.secondaryContainer) {
      ExpressionContainer(
        expression = "2+2",
        result = "4"
      )
    }
  }
}