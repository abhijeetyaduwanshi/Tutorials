Git tutorial
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

`git --version`

If it gives the version number then its up and running or else there is a problem and we will have to configure it again

---------------------------------------------------------------------------------------------

2.Having an account, configure our username and email
---

Before starting with anything in Git we have to have an account with Git and put up a username and email

Whenever we are working on a Git project with a group of people making changes to the same source code, this is a way to sort things out of who did what, thats why everyone need their own account

**First we will set up our username**

`git config --global user.name "Abhijeet Yaduwanshi"`

This just means that take the configuration file and change the name to Abhijeet Yaduwanshi

Global is used at the computer system level that we are working on, all the commits for all the projects worked on this computer will have name Abhijeet Yaduwanshi and not for one particular project

**Next is setting up our email**

`git config --global user.email "abhijeetyaduwanshi@gmail.com"`

This has the same meaning as that of the name peoperty

**Checking the changes that we made in the configuration**

Now to check if the settings are saved and we are good to go we will have to check the config settings

`git config --list`

This will give us list of all the config settings, we have to go and check for the user.name and user.email

If we want to check for a particular setting for say user.name

`git config user.name`

This will give us the user.name setting only

**Git help**

If in the way we face some problem and have to get some help, just ask Git

`git help`

This will give us a list of resources that can really help us big time  
And if we want to learn more about a resource from the list in the help section then take help with the resource name for example we have a resource in the list named "commit" and we want to learn more about this commit resource

`git help commit`

This will probably open the HTML in the default browser explaining in deep about commit

---------------------------------------------------------------------------------------------

3.Creating our very first repository
---

To make a new Git project, create a new folder on our local machine say "FirstLove" and in this folder we will have all of our files for the project

Now we want Git to manage the project and the changes that we make  
But how the hell is Git going to know what is the folder to our project and what files we want Git to manage?

To do that we want to point Git to the "FirstLove" Folder with GitBash

But first we have to make sure where is Git currently pointing at

`pwd`

This will show us the directory that Git is looking

`cd ~`

This will take us and point to the home directory

`cd ..`

This will take us a and point to folder up (back)

`ls`

This will show us the list of all the files and folders in the directory we are currently pointing at

`cd <folder name>`

Selecting the folder's name from the list and using `cd` will take us and point in the folder

Once we reach to the folder we want Git to manage our project we will have to specifically tell Git that this is the folder where we want you to manage project or repository (repository is a technical term for project), now start your business

`git init`

This will initialize the Git management and convert folder to a Git project

---------------------------------------------------------------------------------------------

4.First commit
---

In order to do the first commit we first have to make sure that we are in the Git project, if not navigate to the Git project folder

Make sure that we are in our project folder which is a Git project, to do that list all the files and folders in the Git project using `ls` but if we use `-la`, meaning all with `ls`, then this will show all the hidden files and folders as well. These hidden files and folders are mostly the system or admin files

`ls -la`

We will notice that there is a .git hidden folder, this is the one that helps the Git to manage the project and the changes that we make

**Now lets start**

Before starting anything we have to first make files and filder maybe code files or some graphic designs. So as we will have something to add our repository

Now we know that Git is keeping track of all the changes in our local directory  
We can always keep a track of the current condition of our projct

`git status`

This will give us the current condition of our project, basically this compares the local directory to the repository in Git and show if there are any changes  
If we make any changes and check the status then all the untracked files will be shown in red color

Now we have to add these new files to Git

`git add .`

This means that Git please add all the changes to our project, the dot in the end is the project reference

This will tell Git that we have made some changes and Git now knows this  
In order for GIT to keep track of all the changes we have to go ahead and commit these changes

**Commit is a two step process**

Whenever we make a commit to Git, what we are telling Git is save the changes in THIS POINT OF TIME

Meaning that Git save a image of everything what is there in project at this point of time  
And anytime later you mess up we can come back to this point of time and redoing things

Also give a message along with saving an image of the current situation of the project and the changes that we did

`git commit -m "message here"`

Git save the image with "-m" a message and the message is in the quotes  
Message is there for the work that we have finished so that if we have to go back in time we can look for message and pull that image of the project

---------------------------------------------------------------------------------------------

5.View all previous commits
---

How to view all our previous commits?  
To do this first make sure that we are in our Git project folder  
And we have to check the commits log

`git log`

This will give us the list of all the previous commits from the past along with the dates and the author

If we are working in a team and we want to view commits from a particular author then

`git log --author="name"`

This is cool because we dont have to write author's full name, their firstName or lastName can do the work

---------------------------------------------------------------------------------------------