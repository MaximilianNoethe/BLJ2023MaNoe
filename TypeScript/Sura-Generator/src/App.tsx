import { BrowserRouter, Route, Routes } from "react-router-dom";
import ShowAyah from "./Components/Pages/ShowAyah";

function App() {
  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path="ayah/:ayahId" Component={ShowAyah} />
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
