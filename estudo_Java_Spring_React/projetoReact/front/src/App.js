
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



//obtendo dados formulário
const aoDigitar = (evento) => {

    
  setObjUsuarios({...objUsuarios, [evento.target.name]:evento.target.value})

}


//cadastrar produto

const cadastrarUsuario = () => {

  fetch('http://localhost:8080/cadastrar',{
    method:'post',
    body:JSON.stringify(objUsuarios),
    headers:{
      'Content-type' : 'application/json',
      'Accept' : 'application/json'
    }

})
  .then( retorno => retorno.json() )
  .then(retorno_convertido =>{
    

    if(retorno_convertido.mensagem !== undefined){

      alert(retorno_convertido.mensagem);

    }else{ 

      setUsuarios([...usuarios, retorno_convertido]);
      alert('Usuario Cadastrado com sucesso');
      limpaFormulario();
    }

  }) 


}


//limpar formulario 

const limpaFormulario = () => {

  setObjUsuarios(usuario);

}



  return (

    <div>

     
      <Formulario botao={btnCadastrar} eventoTeclado={aoDigitar} cadastrarUsuario={cadastrarUsuario} obj={objUsuarios} />

      <Tabela usuarios={usuarios}/>





    </div>
  );
  
}

export default App;


