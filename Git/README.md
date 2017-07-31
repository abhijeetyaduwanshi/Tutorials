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

Before starting with anything in Git we have to have an account with Git and put up a Username and Email  
Whenever we are working on a Git project with a group of people making changes to the same source code, this is a way to sort things out of who did what, thats why everyone need their own account  

First we will add our name and to do that open the Git Bash

`git config --global user.name "Abhijeet Yaduwanshi"`

This just means that take the configuration file and change the name to Abhijeet Yaduwanshi  
Global is used at the computer system level that we are working on, all the commits for all the projects worked on this computer will have name Abhijeet Yaduwanshi and not for one particular project

Next is setting up the email and to do so

`git config --global user.email "abhijeetyaduwanshi@gmail.com"`

This has the same meaning as that of the name peoperty

Now to check if the settings are saved and we are good to go we will have to check the config settings and to do so

`git config --list`

This will give us list of all the config settings, we have to go and check for the user.name and user.email


If we want to check for a particular setting for say user.name do this

`git config user.name`

This will give us the user.name setting only


If in the way we face some problem and have to get some help, just ask Git

`git help`

This will give us a list of resources that can really help us big time

And if we want to learn more about a resource from the list in the help section then take help with the resource name for example we have a resource in the list named "commit" and we want to learn more about this commit resource

`git help commit`

This will probably open the HTML in the default browser explaining in deep about commit

---------------------------------------------------------------------------------------------