import { useEffect, useState } from "react";
import "./App.css";
import Box from "@mui/material/Box";
import { AppBar, Container, Grid } from "@mui/material";
import { RandomCatForm } from "./RandomCatForm";
import { RandomCatList } from "./RandomCatList";
import CatImageService from "./service/CatImageService";

function App() {
  const [url, setUrl] = useState("");

  useEffect(() => {
    CatImageService()
      .getRandomCatImage()
      .then((catImageUrl) => setUrl(catImageUrl));
  }, []);
  return (
    <>
      <Box>
        <Container>
          <AppBar></AppBar>
            <RandomCatForm />
            <img src={url}/>
            <RandomCatList />
        </Container>
      </Box>
    </>
  );
}

export default App;
