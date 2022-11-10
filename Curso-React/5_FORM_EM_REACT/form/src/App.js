
import './App.css';
import MyForm from './components/MyForm';

function App() {


  return (
    <div className="App">
      <h2>FORM</h2>
      <MyForm/>

      <h2>FORM de Edição</h2>

      <MyForm nome="Kalil" email="fulano@gmail.com" bio="teste" role="admin"/>


      </div>
  );
}

export default App;
