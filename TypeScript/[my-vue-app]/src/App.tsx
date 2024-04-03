import { useState } from "react";
import "./App.css";
import Box from "@mui/material/Box";
import { AppBar, Container, Grid } from "@mui/material";
import { RandomCatForm } from "./RandomCatForm";
import { RandomCatList } from "./RandomCatList";

function App() {
  return (
    <>
      <Box>
        <Container>
          <AppBar></AppBar>
          <RandomCatForm />
          <RandomCatList />
        </Container>
      </Box>
    </>
  );
}

export default App;
