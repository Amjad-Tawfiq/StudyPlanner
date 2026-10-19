package sa.edu.iau.cshj.studyplanner

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import sa.edu.iau.cshj.studyplanner.ui.theme.StudyPlannerTheme
import android.content.Intent
import androidx.compose.ui.platform.LocalContext

data class TaskDetailUiState(
    val title: String = ""
)

@Composable
fun TaskDetailScreen(
    uiState: TaskDetailUiState,
    onShareClick: () -> Unit,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(uiState.title)

        Button(
            onClick = onShareClick
        ) {
            Text("Share")
        }

        OutlinedButton(
            onClick = onBackClick
        ) {
            Text("Back")
        }
    }
}
@Preview(showBackground = true, name = "Task Detail 1")
@Composable
private fun TaskDetailPreview1() {
    StudyPlannerTheme {
        TaskDetailScreen(
            uiState = TaskDetailUiState(
                title = "Lab 5 Report"
            ),
            onShareClick = {},
            onBackClick = {}
        )
    }
}

@Preview(showBackground = true, name = "Task Detail 2")
@Composable
private fun TaskDetailPreview2() {
    StudyPlannerTheme {
        TaskDetailScreen(
            uiState = TaskDetailUiState(
                title = "Study for CSC 402"
            ),
            onShareClick = {},
            onBackClick = {}
        )
    }
}

@Composable
fun TaskDetailRoute(
    title: String,
    onBackClick: () -> Unit
) {
    val context = LocalContext.current

    TaskDetailScreen(
        uiState = TaskDetailUiState(title = title),
        onShareClick = {
            val send = Intent(Intent.ACTION_SEND).apply {
                putExtra(
                    Intent.EXTRA_TEXT,
                    "Today I'm studying: $title"
                )
                type = "text/plain"
            }

            context.startActivity(
                Intent.createChooser(send, "Share via")
            )
        },
        onBackClick = onBackClick
    )
}