# CSC402 Semester App — Part 1

## StudyPlanner

This project is the first part of the CSC402 Semester App.

##### &#x20;Features

* Displays a greeting
* Shows total study tasks
* Shows completed tasks
* Displays progress such as 3 of 7 done
* Allows the user to mark one task as done
* Uses a stateless PlannerHomeScreen
* State is owned by PlannerHomeRoute
* Includes two different Compose previews

## Submission Evidence

The required screenshots are available in:

docs/Screenshots

* P1\_1\_Sketch.png
* P1\_5\_Preview\_NothingDone.png
* P1\_5\_Preview\_AllDone.png
* P1\_6\_RunningApp\_AfterTap.png

## Technologies

* Kotlin
* Jetpack Compose
* Material 3
* Android Studio



## Semester App — Part 2



##### &#x20;Features Added

\- Added a Task Detail screen

\- Added Navigation Compose between Planner Home and Task Detail

\- Added typed routes using @Serializable

\- Passed the selected task title to the detail screen

\- Added Share functionality using ACTION\_SEND

\- Added Back navigation using popBackStack()

\- Added two Task Detail previews



#### Part 2 Submission Evidence

The screenshots are available in:



docs/Screenshots



\- P2\_1\_SketchAndMap.png

\- P2\_HomeScreen.png

\- P2\_TaskDetailScreen.png

\- P2\_ShareSheet.png

\- P2\_DetailPreview1.png

\- P2\_DetailPreview2.png



## AI Use \& Disclosure Log



##### Lab 4 — Semester App Part 1



Date: 12/10/2026

AI Tool: ChatGPT



###### How AI was used:

I used ChatGPT to help me understand the Lab 4 requirements and guide me step by step while building Semester App Part 1. It helped me create the PlannerUiState, organize the stateless PlannerHomeScreen, create the Route that owns the state, prepare two different previews, and understand how the state and events should flow between the Route and the Screen.



###### Changes and work completed by me:

I created and edited the project files in Android Studio, tested the application on the emulator, tested the button that marks a task as done, created the hand-drawn screen sketch and state notes, captured the required screenshots, created the README documentation, and uploaded the project and evidence to GitHub.





##### Lab 5 — Semester App Part 2



Date: 19/10/2026

AI Tool: ChatGPT



###### How AI was used:

I used ChatGPT to help me understand the Lab 5 requirements and guide me step by step while implementing Semester App Part 2. It helped me add Navigation Compose and Kotlin serialization, create typed routes using @Serializable, update PlannerHomeScreen to send task click events, create the TaskDetailScreen, implement navigation between Planner Home and Task Detail, and add the Share intent.



###### Changes and work completed by me:

I created and edited the files in Android Studio, added the task list and navigation, tested the Home and Task Detail screens on the emulator, tested the Back button and Share sheet, created and adjusted the Task Detail sketch and navigation map, captured the required screenshots and previews, updated the README, and pushed the completed Part 2 project to GitHub.







##### Lab 6 — Study Planner Route, Screen and ViewModel



Date: 26/10/2026

AI Tool: ChatGPT



###### How AI was used:

I used ChatGPT to help me understand the Lab 6 guide and complete the TODOs step by step. It helped me add the ViewModel Compose dependency, connect the ViewModel to the Route, manage the draft text using rememberSaveable, implement adding new tasks, display the task list, and connect the text field and Add button events.



###### Changes and work completed by me:

I copied the provided starter files into my existing StudyPlanner project, updated the package names, completed the TODOs in Android Studio, connected StudyPlannerRoute to my existing navigation setup, and tested the application. I tested adding tasks, empty input, rotation while typing, rotation after adding tasks, and closing the application from Recents. I confirmed that the draft and task list survive rotation and that the task list resets after the app is fully closed. I then committed and pushed the completed Lab 6 work to GitHub.

