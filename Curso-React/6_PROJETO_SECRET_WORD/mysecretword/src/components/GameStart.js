import './GameStart.css'
import { useState, useRef } from 'react';


const GameStart = ({
  verifyLetter,
  pickedWord,
  pickedCategory,
  letters,
  score,
  guessedLetters,
  wrongLetters,
  guesses,
}) => {

  const letterInputRef= useRef(null)

  const handleSubmit = (e) => {
    e.preventDefault();
    
    verifyLetter(letter);
  
    setLetter("");

    letterInputRef.current.focus();

  };


  
  const [letter, setLetter] = useState("");


  return (
    <div className='game'>

      <p className='points'>
        <span>Sua Pontuação: {score}</span>
      </p>

      <h1> Advinhe a Palavra </h1>
      <h3 className='tip'>Dica sobre a palavra:
        <span> {pickedCategory} </span>
      </h3>
      <p>Você ainda tem {guesses} tentativas</p>

      <div className='wordContainer'>

        {letters.map((letter, i) => ((guessedLetters.includes(letter) ?

          <span key={i} className="letter"> {letter} </span>

          :

          <span key={i} className="blankSquare"></span>)))

        }


      </div>

      <div className='letterContainer'>

        <p>Tente Advinhar uma letra da Palavra </p>
        <form onSubmit={handleSubmit}>


          <input type="text" onChange={(e) => setLetter(e.target.value)}
            value={letter} required maxLength="1" name="letter" ref={letterInputRef}/>

          <button>Jogar!</button>

        </form>

      </div>

      <div className='wrongLettersContainer'>

        <p>Letras já Utilizadas:</p>
        {wrongLetters.map((letter, i) => (

          <span key={i}>{letter} </span>
        ))}
      </div>


    </div>


  )
}

export default GameStart