package sa.edu.iau.cshj.studyplanner

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

data class PlannerUiState(
    val greeting: String = "Hello, Amjad",
    val tasks: List<StudyTask> = emptyList()
)

@Composable
fun PlannerHomeScreen(
    uiState: PlannerUiState,
    onTaskClick: (Int) -> Unit,
    onDoneChange: (Int, Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Text(text = uiState.greeting)

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "${uiState.tasks.count { it.isDone }} of ${uiState.tasks.size} done"
        )

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(
                items = uiState.tasks,
                key = { it.id }
            ) { task ->
                TaskItem(
                    task = task,
                    onTaskClick = onTaskClick,
                    onDoneChange = onDoneChange
                )
            }
        }
    }
}

@Composable
fun PlannerHomeRoute(
    onTaskClick: (Int) -> Unit
) {
    var doneTaskIds by rememberSaveable {
        mutableStateOf(listOf<Int>())
    }

    val tasks = listOf(
        StudyTask(
            id = 1,
            title = "Lab 7 Report",
            course = "CSC 402",
            isDone = 1 in doneTaskIds
        ),
        StudyTask(
            id = 2,
            title = "Study for Exam",
            course = "CSC 402",
            isDone = 2 in doneTaskIds
        ),
        StudyTask(
            id = 3,
            title = "Finish Assignment",
            course = "Mobile Application",
            isDone = 3 in doneTaskIds
        ),
        StudyTask(
            id = 4,
            title = "Review Lecture",
            course = "CSC 402",
            isDone = 4 in doneTaskIds
        ),
        StudyTask(
            id = 5,
            title = "Prepare Notes",
            course = "CSC 402",
            isDone = 5 in doneTaskIds
        )
    )

    val uiState = PlannerUiState(
        tasks = tasks
    )

    PlannerHomeScreen(
        uiState = uiState,
        onTaskClick = onTaskClick,
        onDoneChange = { id, checked ->
            doneTaskIds =
                if (checked) {
                    doneTaskIds + id
                } else {
                    doneTaskIds - id
                }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun PlannerHomeScreenPreview() {
    PlannerHomeScreen(
        uiState = PlannerUiState(
            tasks = listOf(
                StudyTask(1, "Lab 7 Report", "CSC 402"),
                StudyTask(2, "Study for Exam", "CSC 402", true),
                StudyTask(3, "Finish Assignment", "Mobile Application"),
                StudyTask(4, "Review Lecture", "CSC 402", true),
                StudyTask(5, "Prepare Notes", "CSC 402")
            )
        ),
        onTaskClick = {},
        onDoneChange = { _, _ -> }
    )
}