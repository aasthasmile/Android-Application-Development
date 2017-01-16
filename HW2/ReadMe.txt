Homework 2 - Zoo Directory
Overview
In this homework assignment, you will create an app for a fictional zoo. The app provides a listing of animals, details of each animal, and basic information about the zoo.
This homework will give familiarity with ListViews, adapters, menus, dialogs, and intents.
Requirements
The zoo app has the following requirements:
Activities
The app has 3 activities:
1. Animal listing activity
Your zoo should have at least 5 animals (you can pick them). Each row in the list should have:
• a thumbnail picture of the animal
• the name of the animal
This should be implemented as a ListView. When any part of a row is clicked, it should launch the details activity for the corresponding animal (described next).
2. Animal detail activity
The animal detail activity shows details on the animal chosen in the list. The activity should show:
• The name of the animal
• A large image of the animal
• A short description of the animal
The same detail activity should be reused for each animal.
3. Zoo information activity
The zoo information activity should have:
• The name of the zoo
• A phone number, represented as Button or a TextView. When clicked, the phone number of the zoo (888-8888) should be dialed. You can use the Intent.ACTION_CALL intent for this.
This activity should be triggered by one of the menu items (see the "Menu Items" section below).
Menu Items The ActionBar should remain persistent throughout the app. The overflow menu should have two items:
• Information. This should launch the zoo information activity (described above).
• Uninstall. This should call an intent to uninstall the app. You can use the Intent.ACTION_DELETE intent for this.
The menu items listed above should appear in the overflow menu and not as buttons in the action bar. This is because only frequent, important, or typical actions are supposed to appear as buttons in the ActionBar.
Dialog Box
When the user clicks on the last animal in the animal listing activity, an alert box should pop-up, warning the user that the animal is very scary and asking the user if they want to proceed. If the user clicks "Yes", then the app should proceed as normal. If the user clicks "No", then the app should remain on the same activity.