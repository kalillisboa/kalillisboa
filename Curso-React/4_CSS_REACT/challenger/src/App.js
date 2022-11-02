
import './App.css';
import DetalheCarros from './components/DetalheCarros';

function App() {

  const carros = [

    { id: 1, nome: "Marea", marca: "FIAT", cor: "Preto" },
    { id: 2, nome: "GOL", marca: "VW", cor: "Azul" },
    { id: 3, nome: "SkyLine", marca: "NISSAN", cor: "Prata" },
    { id: 4, nome: "Lancer", marca: "MITSUBSH", cor: "BRANCO" },
    { id: 5, nome: "WRX-STI", marca: "SUBARU", cor: "Cinza" },
    { id: 6, nome: "RS2-AVANT", marca: "AUDI", cor: "Azul" }

  ];



  return (
    <div className='App'>

      <h2>Desafio 5 </h2>

      {
        carros.map((carro) => (<DetalheCarros key={carro.id} nome={carro.nome}
          marca={carro.marca} cor={carro.cor} />))
      }


    </div>
  );
}

export default App;
