package sqs.messages;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.Message;

import java.util.List;

//public class Receive
//{
//    private static final String QUEUE_NAME = "QueueA";
//
//    public static void receive()
//    {
//        final AmazonSQS sqs = AmazonSQSClientBuilder.defaultClient();
//
//        String queueUrl = sqs.getQueueUrl(QUEUE_NAME).getQueueUrl();
//        // receive messages from the queue
//        List<Message> messages = sqs.receiveMessage(queueUrl).getMessages();
//
//        // delete messages from the queue
//        for (Message message : messages)
//        {
//            sqs.deleteMessage(queueUrl, message.getReceiptHandle());
//        }
//    }
//}

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SQSEvent;
import com.amazonaws.services.lambda.runtime.events.SQSEvent.SQSMessage;

public class Receive implements RequestHandler<SQSEvent, Void>
{
    @Override
    public Void handleRequest(SQSEvent event, Context context)
    {
        for(SQSMessage msg : event.getRecords())
        {
            System.out.println(new String(msg.getBody()));
        }
        return null;
    }
}
