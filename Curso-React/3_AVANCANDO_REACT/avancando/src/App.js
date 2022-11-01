
import { useState } from 'react';
import './App.css';
import City from './assets/city.jpg'
import CarDetails from './components/CarDetails';
import ChildrenComponent from './components/ChildrenComponent';
import ConditionRender from './components/ConditionRender';
import ExecuteFunction from './components/ExecuteFunction';

import ListRender from './components/ListRender';
import ManageData from './components/ManageData';
import {MessageStateLift , ChangeMessage} from './components/MessageStateLift';


function App() {

  const cars = [

    { id: 1, km: 0, brand: "FIAT", cor: "AZUL" },
    { id: 2, km: 1500, brand: "VW", cor: "ROSA" },
    { id: 3, km: 1231230, brand: "RENAULT", cor: "Amarela" },



  ];


  function ShowMessage() {

    console.log("Aqui consta a mensagem");




  };

  const [message, setMessage] = useState();



  return (
    <div className="App">
      <h1>Avançando em React</h1>
      {/* Imagem em public*/}

      <div>
        <img src="/img1.jpg" alt="Paisagem" />
      </div>

      {/*imagem em assets*/}

      <div>
        <img src={City} alt="Cidade" />

      </div>

      <div>
        <ManageData />
      </div>

      <div><ListRender /></div>

      <div><ConditionRender /></div>
      {/*
     {/*exemplo de props
     <div><ShowUserName name="Matheus"/></div>

     {/*exemplo de destructuring

     <div><CarDetails brand="FIAT" km={255000}  cor="AZUL"/></div>

      {/*exemplo de Loop Props*/}

      {cars.map((car) => (

        <CarDetails km={car.km} brand={car.brand} cor={car.cor} key={car.id} />

      ))}


      {/*Children onde pode ser colocado um html entre um componente e renderiza-lo, se não o html não renderiza */}


      <ChildrenComponent>

        <p>Esse é o valor renderizado no html</p>

      </ChildrenComponent>

      {/* Função criada no pai (app.js) executada no filho (ExecuteFunction) */}

      <ExecuteFunction filho={ShowMessage} />

      {/*State Lift*/}
      <MessageStateLift message={message}/>
      {/*Change Message*/}
      <ChangeMessage setMessage={setMessage}/>



    </div>


  );

};


export default App;
