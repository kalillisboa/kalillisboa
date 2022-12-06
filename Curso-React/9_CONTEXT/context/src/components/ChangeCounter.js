import { useContext } from "react"


import { CounterContext } from "../context/CounterContext"

const ChangeCounter = () => {

    const {counter, setCounter} = useContext(CounterContext)


  return (
    <div>
        
            <button onClick={()=>setCounter(counter+1)}>Clique aqui para alterar o valor do contador</button>

    </div>
  )
}

export default ChangeCounter