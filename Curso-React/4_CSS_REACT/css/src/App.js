
import './App.css';
import MyComponent from './components/MyComponent';
import UniqueComponent from './components/UniqueComponent';

function App() {
  var n = 15;
  var redline = true


  return (
    <div className="App">

      {/*CSS GLOBAL */}
      <h1> TESTE </h1>

      <p>Esse paragrafo não é do componente "MyComponent" </p>

      {/*css do componente*/}
      <MyComponent />

      <p>Esse paragrafo não é do componente "MyComponent" </p>

      {/*CSS INLINE, deve ser evitado apenas exemplificando*/}

      <p style={{ color: "blue", background: "black" }}>Esse paragrafo contem css inline </p>

      {/*CSS INLINE DINAMICO, IF TERNARIO */}

      <p style={n > 10 ? { color: "red" } : { color: "yellow" }}> Se o valor de N (15) for maior que 10 vermelho se não amarelo</p>
      {n = 2}
      <p style={n > 10 ? { color: "red" } : { color: "yellow", background: "black" }}> Se o valor de N (15) for maior que 10 vermelho se não amarelo</p>

      {/*CSS CLASSE DINAMICA, IF TERNARIO */}

      <p className={redline ? "redline-true" : "redline-false"}>Aqui usamos a classe dinamica como true</p>

      {redline = false}

      <p className={redline ? "redline-true" : "redline-false"}>Aqui usamos a classe dinamica como false</p>

      {/* CSS EXCLUSIVO DO COMPONENT*/}

      <UniqueComponent/>


    </div>
  );
}

export default App;
