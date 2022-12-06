
import './App.css';
import { BrowserRouter, Routes, Route, Navigate } from "react-router-dom";




import Home from './pages/Home';
import About from './pages/About';
import Produto from './pages/Produto';
import Navbar from './components/Navbar';
import Info from './pages/Info';
import NotFound from './pages/NotFound';
import Search from './pages/Search';
import SearchForm from './components/SearchForm';



function App() {
  return (
    <div className="App">
      <h1>React Router</h1>
      <BrowserRouter>

      <Navbar/>
      <SearchForm/>
        <Routes>
          <Route path='/' element={<Home/>} />     
          <Route path='/about' element={<About/>} /> 
          <Route path='/product/:id' element={<Produto/>}/>
          <Route path='/product/:id/info' element={<Info/>}/>
          <Route path='/search' element={<Search/>}></Route>

          <Route path='/company' element={<Navigate to="/about"/>}/>

          <Route path='*' element={<NotFound/>}/>

        </Routes>

      </BrowserRouter>


    </div>
  );
}

export default App;
