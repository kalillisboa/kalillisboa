import React from 'react'

const UserDetails = ({nome, idade, profissao }) => {

   


    return (
        <div>
            <h2>Pessoa</h2>
            
            <p>{nome}</p>
            <p>{idade}</p>
            <p>{profissao}</p>

            { 
              
              idade >= 18 ? <p>O usuário está apto para habilitação</p> : <p> O usuário é menor de idade e não está apto para dirigir</p>
            
            }

        </div>
    )
}

export default UserDetails