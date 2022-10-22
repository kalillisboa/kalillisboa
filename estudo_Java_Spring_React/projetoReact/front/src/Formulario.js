function Formulario({botao , eventoTeclado, cadastrarUsuario, obj}) {

    return (


        <form>
            <input type='text' value={obj.nome_usuario} onChange={eventoTeclado} name='nome_usuario' placeholder='Nome' className='form-control' />
            <input type='text' value={obj.senha_usuario} onChange={eventoTeclado} name='senha_usuario' placeholder='Senha' className='form-control' />



            {

                botao
                ?

            <input type='button' value='Cadastrar' className=' btn btn-primary' onClick={cadastrarUsuario}/>

                :

            <div>

                <input type='button' value='Alterar' className='btn btn-warning' />
                <input type="button" value='Excluir' className='btn btn-danger' />
                <input type="button" value='Cancelar' className='btn btn-secondary' />


            </div>
            }


        </form>




    )


}

export default Formulario;





