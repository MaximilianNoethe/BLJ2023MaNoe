import { BrowserRouter, Route, Routes } from "react-router-dom";
import ShowAyah from "./Components/Pages/ShowAyah";
import HomePage from "./Components/Pages/HomePage";

function App() {
  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path="ayah" Component={HomePage} />
          <Route path="ayah/:ayahId/en.asad" Component={ShowAyah} />
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
