package sa.edu.iau.cshj.studyplanner.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import sa.edu.iau.cshj.studyplanner.PlannerHomeRoute
import sa.edu.iau.cshj.studyplanner.TaskDetailRoute

@Composable
fun StudyPlannerApp() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = PlannerHome
    ) {
        composable<PlannerHome> {
            PlannerHomeRoute(
                onTaskClick = { id ->
                    navController.navigate(TaskDetail(id))
                }
            )
        }

        composable<TaskDetail> { backStackEntry ->
            val detail: TaskDetail = backStackEntry.toRoute()

            val title = when (detail.id) {
                1 -> "Lab 7 Report"
                2 -> "Study for Exam"
                3 -> "Finish Assignment"
                4 -> "Review Lecture"
                5 -> "Prepare Notes"
                else -> "Study Task"
            }

            TaskDetailRoute(
                title = title,
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}