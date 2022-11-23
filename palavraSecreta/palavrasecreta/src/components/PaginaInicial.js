import React from 'react'

import '../css/PaginaInicial.css'



const PaginaInicial = ({iniciaJogo}) => {

    

  return (
    <div className='PaginaInicial'>
        
    <h1>Palavra Secreta</h1>
    <p>Esse jogo consiste em advinhar a palavra</p>
    <p>O jogo irá apresentar uma dica e te oferecerá 3 tentativas</p>
    <p>Clique no botão abaixo para iniciar</p>

    <button onClick={iniciaJogo}>Começar</button>

    </div>
  )
}

export default PaginaInicial