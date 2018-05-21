Git Cheat Sheet
===

1.CONFIGURE TOOLING
---
**Configure user information for all local repositories**

```
$ git config --global user.name "[name]"
Sets the name you want to attach to your commit transections
```

```
$ git config --global user.email "[user-email-address]"
Sets the email you want to attach to your commit transection
```

2.CREATE REPOSITORIES
---
**Start a new repository or obtain one from an existing URL**

```
$ git init [project-name]
Create a new local repository with the specified name
```

```
$ git clone [url]
Download the project and its entire version history
```

3.MAKE CHANGES
---
**Review edits and craft commit transection**

```
$ git status
List all new or modified files to be commited
```

```
$ git diff
Shows all the file differences which are not yet staged
```

```
$ git add [file]
Snapshot the files in preparation for version control
```

```
$ git diff --staged
Shows all the file differences between staging and last file version
```

```
$ git reset [file]
Unstages the file, but preserve its contents
```

```
$ git commit -m "[descriptive message]"
Records file snapshots permanently in version history
```

4.GROUP CHANGES
---
**Names a series of commits and combined completed efforts**

```
$ git branch
Lists all local brances in the current repository
```

```
$ git branch [branch-name]
Creates a new branch
```

```
$ git checkout [branch-name]
Switches to the specified branch and updates the working directory
```

```
$ git merge [branch-name]
Combines the specified branches history into the current branch
```

```
$ git branch -m [oldName] [newName]
Rename the branch while pointing to any other branch

$ git branch -m [newName]
Rename the current branch
```

```
$ git branch -d [branch-name]
Deletes the specified branch
```

5.REFACTOR FILENAMES
---
**Relocate and remove versioned files**

```
$ git rm [file-name]
Deletes the file from the working directory and stages the deletion
```

```
$ git rm --cached [file-name]
Removes the file from version control but preserves the file locally
```

```
$ git mv [file-original-name] [file-new-name]
Changes the file name and prepares it for commit
```

6.SUPPRESS TRACKING
---
**Exclude temporary files and paths**

```
*.log
build/
temp-*
A text file named .gitignore suppresses accidental version controling of files and paths matching the specified patterns
```

```
$ git ls-files --other --ignored --exclude-standard
Lists all the ignored files in the project
```

7.SAVE FRAGMENTS
---
**Shelve and restore incomplete changes**

```
$ git stash
Temporarily stores all modified tracked files
```

```
$ git stash pop
Restores the most recent stashed files
```

```
$ git stash list
Lists all stashed changesets
```

```
$ git stash drop
Discards the most recently stashed changesets
```

8.REVIEW HISTORY
---
**Browse and inspect the evolution of project files**

```
$ git log
Lists version history for the current branch
```

```
$ git log --follow [file]
Lists version history for a file, including renames
```

```
$ git diff [first-branch]...[second-branch]
Shows contents difference between two branches
```

```
$ git show [commit]
Outputs metadata and content changes of the specified commit
```

9.REDO COMMITS
---
**Erase mistakes and craft replacement history**

```
$ git reset [commit]
Undoes all commits after [commit], preserving changes locally
```

```
$ git reset --hard [commit]
Discards all history and changes back to the specified [commit]
```

10.SYNCHRONIZE CHANGES
---
**Register a repository bookmark and exchange version history**

```
$ git fetch [bookmark]
Downloads all history from the repository bookmark
```

```
$ git merge [bookmark]/[branch]
Combines bookmark's branch into current local branch
```

```
$ git push [alias] [branch]
Uploads all local branch commits to GitHub
```

```
$ git pull
Downloads bookmark history and incorporates changes
```

---------------------------------------------------------------------------------------------

Git Tutorial
===

1.Git Intro, How to download and install
---

Git is a software that is used for maintaining the copies of the code, documents, text etc  
It is simple and helps mostly for version control of the source code

**Download and install Git from internet**

While downloading the software keep all the defaults and pay attention to the details (at least this is what I did)
1. For the path environment select -> Use Git from Git Bash only
2. Configure the line ending conversions select -> Checkout Windows -style, commit Unix -style line endings

And run the Git Bash and to help us test the working

Open the Git Bash and run command

```
git --version
```

If it gives the version number then its up and running or else there is a problem and we will have to configure it again

---------------------------------------------------------------------------------------------

2.Having an account, configure our username and email
---

Before starting with anything in Git we have to have an account with Git and put up a username and email

Whenever we are working on a Git project with a group of people making changes to the same source code, this is a way to sort things out of who did what, thats why everyone need their own account

**First we will set up our username**

```
git config --global user.name "Abhijeet Yaduwanshi"
```

This just means that take the configuration file and change the name to Abhijeet Yaduwanshi

Global is used at the computer system level that we are working on, all the commits for all the projects worked on this computer will have name Abhijeet Yaduwanshi and not for one particular project

**Next is setting up our email**

```
git config --global user.email "abhi@gmail.com"
```

This has the same meaning as that of the name peoperty

**Checking the changes that we made in the configuration**

Now to check if the settings are saved and we are good to go we will have to check the config settings

```
git config --list
```

This will give us list of all the config settings, we have to go and check for the user.name and user.email

If we want to check for a particular setting for say user.name

```
git config user.name
```

This will give us the user.name setting only

**Git help**

If in the way we face some problem and have to get some help, just ask Git

```
git help
```

This will give us a list of resources that can really help us big time  
And if we want to learn more about a resource from the list in the help section then take help with the resource name for example we have a resource in the list named "commit" and we want to learn more about this commit resource

```
git help commit
```

This will probably open the HTML in the default browser explaining in deep about commit

---------------------------------------------------------------------------------------------

3.Creating our very first repository
---

To make a new Git project, create a new folder on our local machine say "FirstLove" and in this folder we will have all of our files for the project

Now we want Git to manage the project and the changes that we make  
But how the hell is Git going to know what is the folder to our project and what files we want Git to manage?

To do that we want to point Git to the "FirstLove" Folder with GitBash

But first we have to make sure where is Git currently pointing at

```
pwd
```

This will show us the directory that Git is looking

```
cd ~
```

This will take us and point to the home directory

```
cd ..
```

This will take us a and point to folder up (back)

```
ls
```

This will show us the list of all the files and folders in the directory we are currently pointing at

```
cd <folder name>
```

Selecting the folder's name from the list and using `cd` will take us and point in the folder

Once we reach to the folder we want Git to manage our project we will have to specifically tell Git that this is the folder where we want you to manage project or repository (repository is a technical term for project), now start your business

```
git init
```

This will initialize the Git management and convert folder to a Git project

---------------------------------------------------------------------------------------------

4.First commit
---

In order to do the first commit we first have to make sure that we are in the Git project, if not navigate to the Git project folder

Make sure that we are in our project folder which is a Git project, to do that list all the files and folders in the Git project using `ls` but if we use `-la`, meaning all with `ls`, then this will show all the hidden files and folders as well. These hidden files and folders are mostly the system or admin files

```
ls -la
```

We will notice that there is a .git hidden folder, this is the one that helps the Git to manage the project and the changes that we make

**Now lets start**

Before starting anything we have to first make files and filder maybe code files or some graphic designs. So as we will have something to add our repository

Now we know that Git is keeping track of all the changes in our local directory  
We can always keep a track of the current condition of our projct

```
git status
```

This will give us the current condition of our project, basically this compares the local directory to the repository in Git and show if there are any changes  
If we make any changes and check the status then all the untracked files will be shown in red color

Now we have to add these new files to Git

```
git add .
```

This means that Git please add all the changes to our project, the dot in the end is the project reference

This will tell Git that we have made some changes and Git now knows this  
In order for GIT to keep track of all the changes we have to go ahead and commit these changes

**Commit is a two step process**

Whenever we make a commit to Git, what we are telling Git is save the changes in THIS POINT OF TIME

Meaning that Git save a image of everything what is there in project at this point of time  
And anytime later you mess up we can come back to this point of time and redoing things

Also give a message along with saving an image of the current situation of the project and the changes that we did

```
git commit -m "message here"
```

Git save the image with "-m" a message and the message is in the quotes  
Message is there for the work that we have finished so that if we have to go back in time we can look for message and pull that image of the project

---------------------------------------------------------------------------------------------

5.View all previous commits
---

How to view all our previous commits?  
To do this first make sure that we are in our Git project folder  
And we have to check the commits log

```
git log
```

This will give us the list of all the previous commits from the past along with the dates and the author

If we are working in a team and we want to view commits from a particular author then

```
git log --author="name"
```

This is cool because we dont have to write author's full name, their firstName or lastName can do the work

---------------------------------------------------------------------------------------------

6.Adding files to repository
---

Now if we have made any changes in the local directory and checked the status then we can see the untracked files in red color

```
git status
```

**Now at this stage we will have to push these files to the GIT repository, which is a three step process**

working directory > staging area > repository

When we work with any files in our project its on our local machine called the working directory  
When we "add" the files that goes to the staging area *added files are the only files that can be commited*  
When we "commit" with a given message that goes to the repository which is our end goal

Again, to add the files to the staging area we have to add them

```
git add .
```

This will add all the untracked files to the staging area and now all the added files are ready to be commited

Again, if we have to add a single file to the staging area, we have to add the file with its name with its extension

```
git add second.txt
```

Now this second.txt is in the staging area and now only this file is ready to be commited

Adding the files will reach to the staging area, now if we check the status then the files name will be in green color that means that the files are in the staging area. If we still see the files in red color then that means that the files are not processed to the staging area

Now the files which are in the staging area **even if there are multiple files, a single commit can push them all to the repository.** But the files which are in the staging area only those files will make it to the repo with a single commit

```
git commit -m "message here"
```

---------------------------------------------------------------------------------------------

7.Editing files
---

Now by this point of time we might have the files uploaded to Git and our repository is pretty stable

Now if we review the files in the local directory and make a mind to change some of the files in the local directory and save them then the local directory and the repository will have same files but different contents in them

To let Git know about the changes, go the project directory and check the status

```
git status
```

This is going to show the files which are modified in the local directory and are different from the repository

**Editing single file**

Now we will have to add the changes to the file in the repository as well, so again add the file

```
git add <file name with extension>
```

This will add the changed file to the staging area

Now we have to commit the changes to the repository

```
git commit -m "file modified"
```

This will commit the changes to the repo

Now if we check the status we will get the clean directory

**Editing multiple files**

To make changes in multiple files we do the (.) ie period to add all the files in the staging area and push them in the repo with a single commit

```
git add .
git commit -m "modified multiple files"
```

---------------------------------------------------------------------------------------------

8.How to view the differences b/t working copy and Git repository
---

How to view the differences in the working copy and the Git repository?  
This is basically to see what changes are we making and how is it going to effect project in the repository

To see the changes first go to the project and make some changes and then check the status `git status` of the project  
That should show the modified files, that is the files that are different in the working copy and the Git repository

**View differences in single file**

Now to check the modifications or the difference between the file in the local copy and the Git repository we use diff command

```
git diff
```

This is going to show all the differences  
The lines removed from the file in the local directory will be shown in red color and the line added to the file in the local directory will be shown in green color

After we see the differences in the files and we are satisfied with all the changes then we can go and add the files and commit the changes with a message and finally check the status and verify the working copy clean status

```
git add <file name with extension>
git commit -m "modified file"
git status
```

Now after the commit if we check the differences `git diff` we will not get anything because everything is up to date

**View differences in multiple files**

If we made changes to multiple files and then check the status `git status` of the project  
That should show the modified files, these are the files that are different in the working copy and the Git repository  
Now to check the modifications or the difference between the files in the local copy and the Git repository we use diff command

```
git diff
```

This will show all files one by one with the differences in the working copy and all the corresponding file in the repository

Again the differentiation in the lines changed are done in respect to the local directory  
The lines removed from the files in the local directory will be shown in red color and the lines added to the files in the local directory will be shown in green color

Now the changes that are done to the files are in ordered to the order the files are been changed  
eg: file two is changed and then file one is changed the order of the display will be file two and then file one

After we see the differences in the files and we are satisfied with all the changes then we can go and add the files and commit the changes with a message and finally check the status and verify the working copy clean status

```
git add .
git commit -m "modified multiple files"
git status
```

Now after the commit if we check the differences `git diff` we will not get anything because everything is up to date

---------------------------------------------------------------------------------------------

9.How to view the differences b/t staging area and Git repository
---

A little more about diff

If we make some changes in the project files and then check the status `git status` of the project  
This shows the modified status  
Now if we check the difference `git diff`  
This will show us the differences between the files in the working copy and the repository

Very well, add the files to the staging area

```
git add .
```

Which will push the files in the staging area

Now if we check the differences 

```
git diff
```

We expect to see the differences

But what the `git diff` does is it only shows the differences between our working copy and the repository and **NOT** between the staging area and the repository

Since this file is in the staging area its not comparing it against the repository so thats why it look like everything is up to date even though we have the files that are different then the one in our repository

Now if we want to see the differences between the files in the staging area and the repository we have to add the `--staged` ie

```
git diff --staged
```

This additional `--staged` will compare the difference in the files and show the different files in staging area and the repository

So again

```
git diff
```

Working copy and the repository

```
git diff --staged
```

staging area and the repository

---------------------------------------------------------------------------------------------

10.Deleting files in Git
---

**DO NOT FORGET TO COMMIT AFTER YOU DELETE A FILE**

If we have to delete the files that we accidently added to the repository and want to simply delete the file then the most easiest way is to remove the file

To remove the file we have to use the `rm` command with the file name and extension

**BE VERY CAREFUL IN DELETING THE FILES**  
Because deleting the file does not only delete the file from the repository but also from the working copy (local directory) as well

```
git rm <file name with ext>
```
*eg: we have to delete home.html*

```
git rm home.html
rm home.html
```

The second line is the confirmation as to tell the user that home.html has been removed

Now if we check status `git status`

This will show us  
```
deleted:	home.html
```

Now its time to commit

```
git commit -m "home page deleted"
```

Commit is required at this point of time because we might have accidently deleted a file, so we can come here and look the file that we deleted

---------------------------------------------------------------------------------------------