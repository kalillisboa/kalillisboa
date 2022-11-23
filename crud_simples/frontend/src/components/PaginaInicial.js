import React, { useEffect, useState } from 'react'
//import { useTable } from 'react-table';
import { useFetch } from '../hooks/useFetch'






const PaginaInicial = ({ url }) => {

    const { data: items } = useFetch(url)




    return (
        <div>

            <h1>Crud Simples</h1>

            <p>Essa aplicação irá realizar todas as operação de um CRUD</p>
            <p>Se trata de um CRUD simples de usuários.</p>
            <ul>
                <li>C- CREATE</li>
                <li>R- READ</li>
                <li>U- UPDATE</li>
                <li>D- DELETE</li>

            </ul>


            <h1>Lista de usuários Cadastrados</h1>
            <p>READ</p>
            {
                <ul>

                    {items && items.map((user) => (

                        <li key={user.id}> {user.nome_usuario} - {user.email}</li>

                    ))
                    }


                </ul>

            }


        </div>
    )
}

export default PaginaInicial