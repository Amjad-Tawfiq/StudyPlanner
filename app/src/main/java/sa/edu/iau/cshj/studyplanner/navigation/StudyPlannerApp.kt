package sa.edu.iau.cshj.studyplanner.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import sa.edu.iau.cshj.studyplanner.PlannerHomeRoute
import sa.edu.iau.cshj.studyplanner.TaskDetailRoute
import sa.edu.iau.cshj.studyplanner.StudyPlannerRoute



@Composable
fun StudyPlannerApp() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = PlannerHome
    ) {
        composable<PlannerHome> {
            StudyPlannerRoute()
        }

        composable<TaskDetail> { backStackEntry ->
            val detail: TaskDetail = backStackEntry.toRoute()

            TaskDetailRoute(
                title = detail.title,
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}