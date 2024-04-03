import { useState } from "react";
import "./App.css";
import Box from "@mui/material/Box";
import { AppBar, Container, Grid } from "@mui/material";

function App() {
  const [count, setCount] = useState(0);

  return (
    <>
      <Box>
        <Container>
          <AppBar></AppBar>
          <Grid>
            <Grid item xs={12}>
              <p>Form here</p>
            </Grid>
          </Grid>
          <Grid>
            <Grid item xs={12}>
              <p>List here</p>
            </Grid>
          </Grid>
        </Container>
      </Box>
    </>
  );
}

export default App;
