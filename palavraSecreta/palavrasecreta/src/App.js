//css
import './css/App.css';
//data
import { listaPalavras } from './data/words'

//componentes
import PaginaInicial from './components/PaginaInicial';
import Jogo from './components/Jogo';
import Fim from './components/Fim';




//react
import { useState } from 'react';


const listaEstagio = [
  { id: 1, nome: "inicio" },
  { id: 2, nome: "jogo" },
  { id: 3, nome: "fim" }
]




function App() {

  const [estagio, setEstagio] = useState(listaEstagio[0].nome)
  const [palavra, setPalavra] = useState("");
  const [categoria, setCategoria] = useState("");
  const [pontuacao, setPontuacao] = useState(0);
  const [chances, setChances] = useState(3);
  const [letra, setLetra] = useState('');
  const [letrasAdvinhadas, setLetrasAdvinhadas] = useState([]);
  const [letrasErradas, setLetrasErradas] = useState([]);


  const iniciaJogo = () => {

    setEstagio(listaEstagio[1].nome)
    SeletorPalavras();


  }

  const gameover = () => {

    setEstagio(listaEstagio[2].nome)

  }

  const SeletorPalavras = () => {

    let categorias = Object.keys(listaPalavras)
    let categoria = categorias[Math.floor(Math.random() * categorias.length)]
    let palavra = listaPalavras[categoria][Math.floor(Math.random() * listaPalavras[categoria].length)]

    setPalavra(palavra);
    setCategoria(categoria);

  }

  const comparaPalavras = (letra) => {

    let separador = palavra.split('');

    separador = separador.map((separador) => separador.toLowerCase());
   
    const letranormalizada = letra.toLowerCase(); 


    if (separador.includes(letranormalizada)){

      setLetrasAdvinhadas((letrasatuais)=>[...letrasatuais, letranormalizada ])

    } else {

      console.log("não possui")
    }



    console.log(palavra ,separador, console.log(letrasAdvinhadas), letranormalizada);
  }






  return (
    <div className="App">


      {estagio === "inicio" && <PaginaInicial iniciaJogo={iniciaJogo} />}


      

      {estagio === "jogo" && <Jogo
        pontuacao={pontuacao}
        chances={chances}
        categoria={categoria}
        comparaPalavras={comparaPalavras}
    


      />}



      {estagio === "fim" && <Fim />}








    </div>
  );
}

export default App;
