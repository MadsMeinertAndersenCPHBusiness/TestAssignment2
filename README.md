# Reflections

## Computer mouse

Firstly I would do unit tests. Where I isolate the mouse and make sure it works on its own. Testing all its functions, right-click, left-click, double-click etc.

Afterwords I would probably do an Integration Test, where I actually test if it works with a computer. 

At last I would perform user testing, to get some feedback from other individuals.


## Catastrophic failure
### The Mars Climate Orbiter
The Mars Climate Orbiter was a robot developed by NASA to study the climate on Mars. The orbiter was launched on December 11 1998, however the orbiter didn't live for long. Due to an misunderstanding between NASA and one if it's subcontractors, the orbiter used English units instead of the intended metric system, nearly a year after the orbiter was launch and reached mars, one of the thrusters malfunctioned, which caused the orbiter to crash. This mistake cost $327 MILLION and probably could have been prevented if some simple unit tests would have been performed. 


## Investagation of tools

### JUnit 5

#### @Tag
Tag is a way you filter tests with a unique name. For example, you can tag them by what kind of test it is eg. UnitTest, IntegrationTest etc. 

#### @Disabled
Disabled is a way to disable a test.

#### @RepeatedTest
RepeatedTest is a way to repeat a test if you want to run it multiple times. 

#### @BeforeEach, @AfterEach
BeforeEach and AfterEach are annotation you can use to execute some code before or after each test. They are quite useful to get rid of redundant code.

#### @BeforeAll, @AfterAll
BeforeAll and AfterAll are code that is execute before or after all the test are run. This is useful for executing an expensive operation such database connection or a server startup

#### @DisplayName
DisplayName is a way to give each of your tests a custom name.

#### @Nested
Nedsted allows you to have an inner class to group up serveral test classes under the same parent.

####assumeFalse, assumeTrue
assumeFalse, assumeTrue is a way to assume something will either return true or false. 

### Mocking Frameworks

I have choosen the frameworks JMockit and Mockito

#### What are their similarities?

#### What are their differences?


