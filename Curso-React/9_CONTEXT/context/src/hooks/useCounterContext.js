import { useContext } from "react"
import { CounterContext } from "../context/CounterContext"


export const useCounterContext = () => {

    const countext = useContext(CounterContext);

    if(!countext) {

        console.log("erro no contexto")
    }

    return countext;

}

 
