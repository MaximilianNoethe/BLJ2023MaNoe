// 6236 Ayas exists

import { useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import QuranService from "../../Service/QuranDataService";
import { Grid, TextField } from "@mui/material";
import Navbar from "../Molecule/Navbar";

function ShowAyah() {
  const { ayahId } = useParams();
  const [number, setNumber] = useState();
  const [text, setText] = useState("");

  useEffect(() => {
    const fetchData = async () => {
      try {
        const quranData = await QuranService().getAyahById(ayahId);
        const { number, text } = quranData.data;
        setNumber(number);
        setText(text);
      } catch (error) {
        alert("Id was not found.");
      }
    };

    fetchData();
  }, [ayahId]);

  return (
    <>
      <Navbar />
      <br />
      <br />
      <Grid container spacing={2}>
        <Grid item xs={6}>
          <TextField
            id="outlined-required-read-only-input"
            label="Ayah-Number"
            value={number}
            InputProps={{
              readOnly: true,
            }}
          />
          <br />
          <br />
          <TextField
            id="outlined-required-read-only-input"
            label="Ayah-Text"
            value={text}
            multiline
            fullWidth
            InputProps={{
              readOnly: true,
            }}
          />
        </Grid>
      </Grid>
    </>
  );
}

export default ShowAyah;
