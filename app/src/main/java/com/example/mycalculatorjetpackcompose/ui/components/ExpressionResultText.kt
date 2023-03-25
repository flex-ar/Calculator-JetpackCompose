package com.example.mycalculatorjetpackcompose.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.example.mycalculatorjetpackcompose.ui.theme.MyCalculatorJetpackComposeTheme

@Composable
fun ExpressionResultText(result: String, modifier: Modifier = Modifier) {
  Text(
    text = result,
    modifier = modifier.fillMaxWidth(),
    textAlign = TextAlign.End,
    maxLines = 1,
    overflow = TextOverflow.Ellipsis,
    style = MaterialTheme.typography.displaySmall
  )
}

@Preview(showBackground = true)
@Preview(
  showBackground = true,
  uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun ExpressionResultTextPreview() {
  MyCalculatorJetpackComposeTheme {
    Surface {
      ExpressionResultText(result = "40000000000000000000000")
    }
  }
}