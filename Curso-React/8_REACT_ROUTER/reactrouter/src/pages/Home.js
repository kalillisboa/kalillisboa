import React from 'react'
import { Link } from 'react-router-dom';
import  '../css/Home.css'


import { useFetch } from '../hooks/useFetch'

const Home = () => {

    const url = "http://localhost:3000/products";

    const { data: items, httpConfig, loading, error } = useFetch(url);


    return (



        <div>
            <h1>Lista de Produtos</h1>


            {loading && <p>Carregando dados</p>}
            {error && <p>{error}</p>}

            {!error && 
            
           ( items && items.map((items) => (
                <ul className='produtos' key={items.id}>
                    <li > ID: {items.id}</li>
                    <li>Nome: {items.name}</li>
                    <li>Preço: {items.price}</li>
                    <Link to={`/product/${items.id}`}>Detalhe do Produto</Link>

                </ul>

            )))
            
            
            }
           

           
        </div>

    )
}

export default Home