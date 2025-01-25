# **UserInfoApplication**

## **Features**

- **User Registration**: Register a new user and upload their details.
- **Profile Display**: View user profile information after registration or login.
- **Data Storage**: Data is stored and managed in an H2 in-memory database using Hibernate.
- **H2 Database Console**: Access and view the stored data directly using the H2 console.
- **Hibernate Integration**: Simplifies database interactions with ORM support.

## **Tech Stack**

- **Backend**: Spring Boot, Hibernate
- **Database**: H2 In-Memory Database
- **Frontend**: HTML, CSS
- **Server Port**: `http://localhost:8080/`

## **How to Run the Application**

## **Method 1: Using Eclipse**

#### **Clone the Repository:**

**git clone** 'https://github.com/MohanRajRV/UserInfoApplication.git'
### Import the Project into Eclipse:

- Open Eclipse and go to File > Import
- Select Maven > Existing Maven Projects and click Next.
- Browse to the location of the cloned project and select the root folder.
- Click Finish to import the project.

### Run the Application:

- Right-click on the main application class (UserInfoApplication.java).
- Select Run As > Java Application.

### Open your browser and go to:

- **Application:** 'http://localhost:8080/'
-  **H2 Database Console:** 'http://localhost:8080/h2-console/'

## Method 2: Using Maven
**Clone the repository:**


**git clone** 'https://github.com/MohanRajRV/UserInfoApplication.git'

### Navigate to the project directory:
'cd UserInfoApplication'

### Build and run the application using Maven:
 mvn spring-boot:run

### Open your browser and go to:

**Application:** 'http://localhost:8080/'

**H2 Database Console:** 'http://localhost:8080/h2-console/'

## process to run the application
### Register a New User:
- Go to 'http://localhost:8080/'.
- Click on New Register User and fill out the form with the required details.
- Submit the information to upload it to the database.

### View Profile Information:

- After registration, the user profile will be displayed.
- Alternatively, you can log in with your credentials to view your profile.

### Access H2 Database Console:

- Navigate to 'http://localhost:8080/h2-console/'.

### Use the following credentials to connect:(important)

  **JDBC URL: jdbc:h2:mem:testdb**
  **Username:** sa
  **Password:** (Leave it blank)

Run SQL queries to view or manage the stored data.
Code


  
