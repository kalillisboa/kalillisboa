import { useState, useEffect } from "react";


export const useFetch = (url) => {

    const [data, setData] = useState(null);
    const [method, setMethod] = useState(null);
    const [config, setConfig] = useState(null);

    const [chamadaFetch, setChamadaFetch] = useState(false);

    const [loading, setLoading] = useState(false);


    const [error, setError] = useState(null);

    const [itemId, setItemId] = useState(null);


    const httpConfig = (data, method) => {
        if (method === "POST") {
            setConfig({
                method,
                headers: {
                    "Content-Type": "application/json",
                },
                body: JSON.stringify(data)
            });
            setMethod(method);
        } else if(method === "DELETE") {

            setConfig({
                method,
                headers: {
                    "Content-Type": "application/json",
                },
             
            });
            setMethod(method);
            setItemId(data);
          

            

        }

    }





    useEffect(() => {


        const fetchData = async () => {

            setLoading(true)
            try {

                const res = await fetch(url)
                const json = await res.json();

                setData(json)

            } catch (error) {

                setError("Houve um erro ao obter os dados");
               

            }
            setLoading(false);
        }
    


        fetchData();



    }, [url, chamadaFetch])



    // 5- refatorando post

    useEffect(() => {

        const requestHtml = async () => {
            if (method === "POST") {
                let fetchOptions = [url, config];

                const res = await fetch(...fetchOptions);
                const json = await res.json();

                setChamadaFetch(json)
            }

            else if (method === "DELETE"){

                const deleteurl = `${url}/${itemId}`
                const res = await fetch(deleteurl, config)

                const json = await res.json();

                setChamadaFetch(json)
            }
            
            
        };



        requestHtml();
    }, [url, config, method, itemId]);

    return { data, httpConfig, loading, error };

};