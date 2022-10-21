
import './App.css';
import Formulario from './Formulario';
import Tabela from './Tabela';
import { useState, useEffect } from 'react';
import {usuario} from './objetos/objetos';



function App() {




  //UseState
  const [btnCadastrar, setBtnCadastrar] = useState(true);
  const [usuarios, setUsuarios] = useState([]);
  const [objUsuarios, setObjUsuarios] = useState (usuario)

  

  //UseEffect

  useEffect(() => {

    fetch('http://localhost:8080/listar')   // Realiza a requisição
      .then(retorno => retorno.json())      // Converte o valor recebido em JSON
      .then(retorno_convertido => setUsuarios(retorno_convertido))  // Exibindo os usuarios



  }, []); // o ultimo colchetes após a virgula tem que ser utilizado para não termos requisições infintas.








  return (

    <div>

      <p>{JSON.stringify(objUsuarios)}</p>
      <Formulario botao={btnCadastrar} eventoTeclado={aoDigitar}/>

      <Tabela usuarios={usuarios}/>





    </div>
  );
  
}

export default App;


