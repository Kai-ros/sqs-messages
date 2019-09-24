import AWS from 'aws-sdk';
import React, { useEffect, useState } from 'react';
import { Consumer } from 'sqs-consumer';



AWS.config.update({
  region: 'us-west-2',
  accessKeyId: process.env.REACT_APP_AWS_ACCESS_KEY_ID,
  secretAccessKey: process.env.REACT_APP_AWS_SECRET_ACCESS_KEY,
});

function App() {

  const [list, setList] = useState([]);

  useEffect(() => {
    const app = Consumer.create({
      queueUrl: 'https://sqs.us-west-2.amazonaws.com/235269047671/QueueA',
      handleMessage: handler,
    });

    function handler(message) {
      setList((list) => [...list, message.Body]);
    }

    app.start();

    console.log(app);

    return () => app.stop();
  }, []);

  return (
    <div>
      <h2>SQS Responses</h2>
      <ul>
        {list.map((item, i) => <li key={i}>{item}</li>)}
      </ul>
    </div>
  );
}

export default App;
