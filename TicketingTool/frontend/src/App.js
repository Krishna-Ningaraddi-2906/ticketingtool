import TestComponent from "./Components/TestComponent";

import { BrowserRouter, Route, Routes } from 'react-router-dom';

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/status" element={<TestComponent />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
