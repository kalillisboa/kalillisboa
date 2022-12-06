import React from 'react'

import { useSearchParams, Link } from 'react-router-dom'
import { useFetch } from '../hooks/useFetch'

const Search = () => {

    const [searchParams] = useSearchParams();

    const url = "http://localhost:3000/products?" + searchParams;

    const { data: items, loading, error } = useFetch(url)

    return (
        <div>

            <h1>Página de Busca</h1>

            {loading && "carregando pesquisa"}
            {error && <p>{error}</p>}

            {!error &&

                (items && items.map(

                    (item) => (
                        <ul key={item.id}>
                            <li>O id é: {item.id}</li>
                            <li>O nome do produto é: {item.name} </li>
                            <li>O preço do produto é: {item.price}</li>
                        </ul>
                    )

                ))}

        </div>
    )
}

export default Search