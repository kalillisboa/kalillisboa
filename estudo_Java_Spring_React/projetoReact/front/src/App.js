
import './App.css';
import Formulario from './Formulario';
import Tabela from './Tabela';
import { useState, useEffect } from 'react';

function App() {

  //UseState
  const [btnCadastrar, setBtnCadastrar] = useState(true);
  const [usuarios, setUsuarios] = useState([]);

  //UseEffect

  useEffect(() => {

    fetch('http://localhost:8080/listar')   // Realiza a requisição
      .then(retorno => retorno.json())      // Converte o valor recebido em JSON
      .then(retorno_convertido => setUsuarios(retorno_convertido))  // Exibindo os usuarios



  }, []); // o ultimo colchetes após a virgula tem que ser utilizado para não termos requisições infintas.



  return (

    <div>

      
      <Formulario botao={btnCadastrar} />

      <Tabela usuarios={usuarios}/>





    </div>
  );
}

export default App;
