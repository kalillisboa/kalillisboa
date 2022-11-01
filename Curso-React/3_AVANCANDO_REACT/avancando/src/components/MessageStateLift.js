import React from 'react'

const MessageStateLift = ({ message }) => {
    return (

        <div>

         <h2>Componente de Mensagem (State Lift), ele realiza a leitura</h2>
            A Mensagem é : {message}

        </div>

    )
}



const ChangeMessage = ({setMessage}) => {

    const message = ["ola" , "tudo bem?", "teste"];


  return (
    <div>

    <h2> Componente para  alterar a mensagem</h2>
    <button onClick={ ()=> setMessage(message[0])} >1</button>
    <button onClick={ ()=> setMessage(message[1])}>2</button>
    <button onClick={()=> setMessage(message[2])}>3</button>
    
    </div>
  )

}






export {MessageStateLift , ChangeMessage};