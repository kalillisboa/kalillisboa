import React, { useState } from 'react'
import '../css/Jogo.css'







const Jogo = ({pontuacao , chances, categoria, comparaPalavras}) => {

  const [letra, setLetra] = useState('');

  const handleSubmit = (event) =>{
    
    event.preventDefault();
  
    comparaPalavras(letra);
  
  
  
  
  }
  




  return (
    <div className='Jogo'>
      
      <h1>Acerte a Palavra</h1>

      <p>Seu score é: {pontuacao} </p>

      <p>A sua palavra escolhida pertence a seguinte categoria: {categoria}</p>

      <p>você ainda possui {chances} chances</p>


      <div className='tabelaJogo'> 

      <span className='letra'>A</span>

       
      </div>

    <form onSubmit={handleSubmit}>

      <input type="text" name='letra' maxLength={1} onChange={(e)=>{setLetra(e.target.value)}}/>
      <input type="submit" value="jogar"/>

      {console.log(letra)}

    </form>

    <p>Letras Utilizadas</p>
    <p>???</p>
    </div>
  )
}

export default Jogo