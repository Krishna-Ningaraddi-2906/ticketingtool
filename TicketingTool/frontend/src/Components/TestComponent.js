import React, { useEffect, useState } from 'react';

function TestComponent() {
  const [message, setMessage] = useState("Loading...");

  useEffect(() => {
    fetch("/status")
      .then(res => res.text())
      .then(data => setMessage(data))
      .catch(err => setMessage("❌ Error connecting to backend"));
  }, []);

  return <h2>{message}</h2>;
}

export default TestComponent;
