# Parcial Primer Tercio - AREP
This Java project is a Spark Web Application where users can check the weather of a city.

[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://thawing-brook-50672.herokuapp.com/)

## Getting Started
### Prerequisites
* Git
* Maven
* Heroku CLI
* Java SE Development Kit 8
* Java SE Runtime Environment 8

### Installing
1. To use this proyect, you must clone it in your computer. Use the following command:
   ```
    git clone https://github.com/DiegoMurcia2022/Parcial-Primer-Tercio-AREP.git
   ```

2. You must build the project, for that you enter to the directory **"Parcial-Primer-Tercio-AREP"** in the command terminal and run the following command:
   ```
   mvn package
   ```

3. Once the project is buil, you can execute ir with Maven in the following way:
   ```
   mvn exec:java -Dexec.mainClass="edu.eci.arep.WebApp"
   ```
   You must enter http://localhost:4567/clima?lugar=({city} in your browser.


4. If you want open it in Heroku App, you must open the app and enter, for example, the following path:
   ```
   https://thawing-brook-50672.herokuapp.com/clima?lugar=Miami
   ```

## Author
* Diego Alejandro Murcia Cespedes - Student at the *Colombian School of Engineering Julio Garavito*

## License
This project is licensed under the GNU v3.0 - see the [LICENSE.md](LICENSE.md) file for details.
   
    

