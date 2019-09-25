# SQS Messages
Create Message Queues and Broadcasters and wire them through code.

## Run Instructions
* There are 3 queues that can be accessed by changing the variable name:
```
QueueA
QueueB
QueueC
```

* In either the Send.java file or the Receive.java file you change this line to correspond to one of the above named queues.
:

```
private static final String QUEUE_NAME = "QueueA";
```

* Inside of the logger sub-directory in app.js the corresponding queueURL must match as well:
```
queueUrl: 'https://sqs.us-west-2.amazonaws.com/235269047671/QueueA',
```

* After specifying the correct Queue run the main method of Library.java and run ```npm start``` on the command line while in the logger sub-directory.

## API 
* -- Library.java
* ---- send()
* ---- receive()
* -- Receive.java
* -- Send.java


## Collaborators
- Ginger the dog
- @Bombibear
- Sapana Poudel
- Nhu Trinh
- Joachen Busch
- Brandon Hurrington
- Renee Messick
- Travis Cox
- Jack Kinne
- Marisha Hoza
- Chris Coulon
- Matt Stuhring
- Nick Paro
- Melfi Perez
- Padmapriva Ganapathi
