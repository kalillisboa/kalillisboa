const usuario = {

    id_usuario : 0,
    nome_usuario : '',
    senha_usuario: '' 



}


//obtendo dados formulário
const aoDigitar= (evento) => {

    
    setObjUsuarios({...objUsuarios, [evento.target.name]:evento.target.value})
  
  }



export  {usuario,aoDigitar};



