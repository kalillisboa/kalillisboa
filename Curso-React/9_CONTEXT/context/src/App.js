import logo from './logo.svg';

import { BrowserRouter, Routes, Route, Navigate } from "react-router-dom";
import NavBar from './components/NavBar';

import Home from './pages/Home'
import Detalhes from './pages/Detalhes'
import About from './pages/About'

function App() {
  return (
    <div className="App">

      <BrowserRouter>

        <NavBar />

        <Routes>
          <Route path='/' element={<Home/>} />
          <Route path='/about' element={<About/>} />
          <Route path='/detalhes' element={<Detalhes/>} />
        </Routes>


      </BrowserRouter>


    </div>
  );
}

export default App;
