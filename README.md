# Hero Squad

# This is an app there the user is able to create a virtual squad and heroes of their choice.

## Author
* **Savanah Agutu** 

## Live Page / Demo

## Getting Started
 CLone the repository to your Local Machine to get started 
 
 Github: [https://github.com/savanahatieno/Hero-Squad].
 
### Prerequisities
 Before we start
 You need the following installed in your machine
 -Java
 -JDK- Java Development Kit
 -Maven
 -Gradle
 -An IDE - Intellij (Recommended) / Eclipse
 
 To confirm you have the above , run the folowing command on Linux
 $ java --version    //java version
 $ mvn --version     //maven version
 $ gradle --version  //gradle version
 
## Installing 
After cloning to your local machine navigate to the folder you cloned into and open it with intellij.
* Navigate into the ``` src/main/java/App.java ``` and click run in intellij.
* Go to your browser and type ``` localhost:4567 ```

## Running the Tests

Create a test class for running tests in the application.

This is a sample test that tests if the getter method works

```
@Test
public void newHero_getName_String(){
  hero testHero = Hero.setUpNewHero();
  assertEquals("Anne", testHero.getName());
}
```

## Built With

* [Java](https://www.java.com/) - The language used
* [Intellij Idea](https://www.jetbrains.com/idea/) - Intergated development
* [Spark](3.8.1) - Framework


## Contributing
If you want to put out a pull request you first have to send us the sample code that you want to add to our repository for cross-checking before we allow the pull.

## Versioning

We use [Github](https://github.com/) for versioning. This is the first version of this application

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

## Acknowledgments

* Hat tip to  ```Stackoverflow```
* Hate tip to  ```Youtube```