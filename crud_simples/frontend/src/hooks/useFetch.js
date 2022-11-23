import { useState, useEffect } from "react";


export const useFetch =(url)=>{

   
const [data, setData] = useState(null);
const [method, setMethod] = useState(null);
const [config, setConfig] = useState(null);
const [callFetch , setCallFetch] = useState(null); 

useEffect(() => {
  
    const fetchData = async () => {
        fetch(url)
        .then(retorno => retorno.json())
        .then(retorno_convertido => setData(retorno_convertido));
  }

  fetchData();

}, [url])

return{data}

}