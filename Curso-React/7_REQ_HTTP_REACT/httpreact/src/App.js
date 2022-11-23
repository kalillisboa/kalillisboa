import { useState, useEffect } from 'react'
import './App.css';
import { useFetch } from './hooks/useFetch';


function App() {

  const url = "http://localhost:3000/products"

  const [produtos, setProdutos] = useState([]);

  const { data: items, httpConfig, loading, error } = useFetch(url);



  const [name, setName] = useState('');
  const [price, setPrice] = useState('');
  const [id, setId] = useState('');


  // useEffect(() => {

  //   async function fetchData() {

  //     const resposta = await fetch(url);

  //     const produtos = await resposta.json();

  //     setProdutos(produtos);

  //   }
  //   fetchData();
  // }, [])



  const handleSubmit = async (e) => {

    e.preventDefault();

    const produtos = { id, name, price };

    // const res = await fetch(url,
    //   {
    //     method: "post",
    //     headers: {
    //       "Content-Type": "application/json"
    //     },
    //     body: JSON.stringify(produtos)
    //   }
    // );

    //   const produtoAdicionado = await res.json()

    //   setProdutos((produtos)=>[...produtos, produtoAdicionado])


    httpConfig(produtos, "POST");

    setName('');
    setPrice('');

  };


  const handleRemove = async (id) =>{

   

    
    httpConfig(id, "DELETE");

    
  }



  return (
    <div className="App">

      <h1>Lista Produtos</h1>

      {error && <p>{error}</p>}
      {  (loading && <p>Carregando... Aguarde</p>)}

      {

        
        ( !error &&
        <ul>

          {items && items.map((produtos) => (
            <li key={produtos.id}>ID: {produtos.id} - Nome: {produtos.name} - R$: {produtos.price} 
            <button onClick={()=>handleRemove(produtos.id)}>Excluir</button>
            
      </li>

          ))}

        </ul>
        ) 
      }


      <form onSubmit={handleSubmit} className="formulario">

        <label>
          Nome:
          <input type="text" name='name' value={name} onChange={(e) => setName(e.target.value)} />
        </label>
        <label>
          Preço:
          <input type="number" name='price' value={price} onChange={(e) => setPrice(e.target.value)} />
        </label>

        { loading && <input type="submit" disabled value="AGUARDE" />                                           }
        {!loading && <input type="submit" value="Criar Produto" />}

      </form>



      

    </div >
  );
}

export default App;
