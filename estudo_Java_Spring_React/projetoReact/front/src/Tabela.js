function Tabela({ usuarios }) {




    return (

        <table className='table'>
            <thead>
                <tr>
                    <th>#</th>
                    <th>Nome</th>
                    <th>Senha</th>
                    <th>Selecionar</th>
                </tr>

            </thead>

            <tbody>
                {
                    usuarios.map((obj, indice) => (

                        <tr key={indice}>
                            <td>{indice+1}</td>
                            <td>{obj.nome_usuario}</td>
                            <td>{obj.senha_usuario}</td>
                            <td><button className="btn btn-success">Selecionar</button></td>
                        </tr>

                    ))
                }


            </tbody>
        </table>


    )

}

export default Tabela;

