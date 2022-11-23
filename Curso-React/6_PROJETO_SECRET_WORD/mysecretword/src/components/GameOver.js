import React from 'react'

const GameOver = ({resetGame , score}) => {
  return (
    <div>

    <h1>Game Over</h1>

    <p>Sua Pontuação foi de: {score}</p>

    <button onClick={()=>{

      resetGame();


    }}>Resetar Jogo</button>

    </div>
  )
}

export default GameOver