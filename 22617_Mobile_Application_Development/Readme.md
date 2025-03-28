1 . Locally Clone the Entire Repository and change directory there 

![image](https://github.com/user-attachments/assets/9353971f-e541-4f57-b2ba-f84358d57933)

2. Create file where u want to push ,the emptier the better not even a README.MD or only .gitkeep

       mkdir foldername

3.MOVE with CMD or manually ,the files you want to push onto Github in the locally cloned repository 

Example : on my github (online) i wanted to push android studio projects into a folder named 22617_Mobile_Application_Development
 
 so i had to first clone the repository LOCALLY ,then move the files i wanted to the folder 22617_Mobile_Application_Development OFFLINE 

 and then push it online ( that made perfect sense , im sure )

 4 .Now move to repository name not the folder of where your folder is and say git add .

 ![image](https://github.com/user-attachments/assets/ba08b193-e767-471c-b966-e5bf0d5093f9)

 5. Can write a commit msg (optional)

  ![image](https://github.com/user-attachments/assets/ab4f0788-ce78-4048-83aa-f1f9d30d0104)

  ![image](https://github.com/user-attachments/assets/1a6acf3b-1cbf-4c0c-9431-99ea98965b19)


git add . tells Git to track all new or modified files inside the repository.

The . means “add everything” in the current folder and subfolders.

✅ Effect: Git now recognizes the Android Studio project files as changes to be committed.

git commit saves the changes locally (but not on GitHub yet).

-m "Added Android Studio projects" → The commit message helps you remember what was changed.

✅ Effect: Creates a local snapshot of the changes before pushing them to GitHub.

Push the Changes to GitHub

    git push origin main
    
What It Does?

git push sends your committed changes to GitHub.

origin is the name of your remote GitHub repository.

main is the branch you’re working on.

✅ Effect: Your Android Studio project files are now uploaded to
https://github.com/bagwanmisbah/MSBTE-Lab-Practicals-I-Scheme/tree/main/22617_Mobile_Application_Development

Summary of What Happened

Navigated to the local Git repository (cd command).

Moved the Android Studio project files into the correct Git folder (move command).

Told Git to track the new files (git add .).

Saved the changes locally with a commit message (git commit -m ...).

Uploaded everything to GitHub (git push origin main).

Now, your files are successfully inside 22617_Mobile_Application_Development on GitHub

 


 

 
 


