package com.example.mycalculatorjetpackcompose.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.mycalculatorjetpackcompose.ui.theme.MyCalculatorJetpackComposeTheme

@Composable
fun ExpressionText(expression: String, modifier: Modifier = Modifier) {
  Text(
    text = expression,
    modifier = modifier
      .fillMaxWidth()
      .horizontalScroll(
        state = rememberScrollState(),
        reverseScrolling = true
      ),
    letterSpacing = 8.sp,
    textAlign = TextAlign.End,
    maxLines = 1,
    style = MaterialTheme.typography.displayLarge,
  )
}

@Preview(showBackground = true)
@Preview(
  showBackground = true,
  uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Composable
fun ExpressionTextPreview() {
  MyCalculatorJetpackComposeTheme {
    Surface {
      ExpressionText(expression = "3+2+2+2+2+2+2+2+2+2+2+2+2+2-2")
    }
  }
}