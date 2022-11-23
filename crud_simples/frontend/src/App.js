
import './App.css';
import PaginaInicial from './components/PaginaInicial';


const urlInicial = "http://localhost:8080"
const urlListar = "http://localhost:8080/listar"
const urlCadastrar = "http://localhost:8080/cadastrar"
const urlDeletar= "http://localhost:8080/deletar"
const urlAlterar="http://localhost:8080/alterar"





 

function App() {
  return (
    <div className="App">
      
      <PaginaInicial url={urlListar}/>


    </div>
  );
}

export default App;
