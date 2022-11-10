//import css
import './App.css';

//import react

import { useState, useCallback, useEffect } from 'react';


//import components
import StartScreen from './components/StartScreen';
import GameStart from './components/GameStart';
import GameOver from './components/GameOver';

//import data

import { wordsList } from './data/words'

const stages = [
  { id: 1, nome: "start" },
  { id: 2, nome: "game" },
  { id: 3, nome: "over" }

]



function App() {

  const [gameStage, setGameStage] = useState(stages[0].nome);

  const [pickedWord, setPickedWord] = useState("");
  const [pickedCategory, setPickedCategory] = useState("");
  const [letters, setLetters] = useState("");

  const [score, setScore] = useState(0);
  const [guessedLetters, setGuessedLetters] = useState([]);
  const [wrongLetters, setWrongLetters] = useState([]);

  const [guesses, setGuesses] = useState(3);




  const pickWordAndCategory = () => {

    const categories = Object.keys(wordsList);
    const category = categories[Math.floor(Math.random() * Object.keys(categories).length)];


    const word = wordsList[category][Math.floor(Math.random() * wordsList[category].length)];




    return { category, word }

  }



  const startGame = () => {

    const { category, word } = pickWordAndCategory();


    let wordLetter = word.split("");

    wordLetter = wordLetter.map((letters) => letters.toLowerCase());



    console.log(category, word, wordLetter);


    setPickedWord(word);
    setPickedCategory(category);
    setLetters(wordLetter);



    setGameStage(stages[1].nome);

  }

  const verifyLetter = (letter) => {

    const letterNormalized = letter.toLowerCase();


    if (
      guessedLetters.includes(letterNormalized) || wrongLetters.includes(letterNormalized)

    ) {

      return;
    }

    if (letters.includes(letterNormalized)) {

      setGuessedLetters((actualGuessedLetters) => [

        ...actualGuessedLetters,
        letterNormalized
      ]
      );
    } else {

      setWrongLetters((actualWrongLetters) => [

        ...actualWrongLetters,
        letterNormalized
      ]
        ,
        setGuesses((actualGuesses) => actualGuesses - 1));


    };
  };

  useEffect(() => {

    if (guesses <= 0) {

      setGameStage(stages[2].nome)
    }
  }, [guesses]);




  console.log(guessedLetters);
  console.log(wrongLetters);
  return (
    <div className="App">
      {gameStage === "start" && <StartScreen startGame={startGame} />}
      {gameStage === "game" && <GameStart
        verifyLetter={verifyLetter}
        pickedWord={pickedWord}
        pickedCategory={pickedCategory}
        letters={letters}
        score={score}
        guessedLetters={guessedLetters}
        wrongLetters={wrongLetters}
        guesses={guesses}




      />}
      {gameStage === "over" && <GameOver />}



    </div>



  );
}

export default App;
