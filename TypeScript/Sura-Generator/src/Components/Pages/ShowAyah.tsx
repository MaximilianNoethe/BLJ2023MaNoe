import { useEffect, useState } from "react";
import { useParams } from "react-router-dom"
import QuranService from "../../Service/QuranDataService";




function ShowAyah() {
const { ayahId } = useParams();
const [number, setNumber] = useState(0);
const [text, setText] = useState("");

useEffect(() => {
    const fetchData = async () => {
        try{
            const quranData = await QuranService().getAyahById(ayahId);
            setNumber(quranData.number);
            setText(quranData.text);
        } catch(error){
            alert("Id was not found.");
        }
    };

    fetchData();

}, [ayahId]);


  return (
    <>
   
    </>
  )
}

export default ShowAyah
