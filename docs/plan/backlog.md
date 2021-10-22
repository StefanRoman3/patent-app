# PROJECT patent-app

# REPO https://github.com/StefanRoman3/patent-app

-GIT StefanRoman3

# 1. define objective

    Pay Patent Renewal Annuties for 10 Countries

- RO, HU, BG, RS, EP, FR, GB, SE, SI, UA, DE,

# 2. define entities

## user

    -user can register and log in
    -user can add patent
    -user can select which country and what annuity to pay
    -user will have a total cost for payment 
    -user will have option to save for later or proceed with payment
    -user will then go to payment menu to add card and process 

the payment or go back user will have manage portfolio menu where in Payment Instruction sent menu can see al pending
cases in this menu red receipt button means outstanding and green ones means receipt can be downloaded. user can access
Saved Patent menu where can select them and add them to basket to be paid

## Admin Page

    admin home page will have a to do list notes in order to organize 

outstanding and completed payments admin will have a nav bar with buttons to direct him to different tasks
(completed, outstanding, displays and multiple search criteria)
admin, on Outstanding page menu will have a short bar of notifications(7rows)
with cases lapsing within 7 days. ->on same page below notifications will have a list with patents sorted by current
status where pop in a menu with notes can be accessed

# 3. create epics

Epics: patent, annuity, country , fee, receipt

for client(user)-add patents -select annuities -select country

- proceed for payment -manage cases/save them for late payments

for admin- manage client portfolio -manage cases and see deadlines

# 4. create backlog

- add user stories

# landing page

short presentation list of fees and story why they should choose EPR

#

# register

- view register page and log in page
- register with email and password
- login with email and password
- logout

## Client Home page will start with add patent form

-Add patent form page- add patent details review instruction

# Review Instruction page

client will have a summary of patent details and the cost involved option to proceed or save for later

## Payment Page

-list of patent added for payment -option to add card details and to pay -page with confirmation and option to download
invoice receipt

# Payment instruction Menu

-list of paid patents and option to download receipt if button is green if red is outstanding

# Save Patents for Payment Menu

-list with patent details and invoice no option to select and go to Review Instruction Menu

# Acceptance criteria

-user click register and navigate to register form -user inputs data -email input    
-password input -first name input -last name input -user clicks "Register" button and the user should be saved

# Frontend view register page

form template -email input -password input -first name input -last name input -check box terms and conditions -submit
button "Register"

# backend

-database connection -spring boot -sql connector -spring data jpa -

-entity -repository -service -controller

