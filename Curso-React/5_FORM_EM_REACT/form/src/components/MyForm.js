import style from './MyForm.module.css'
import {useState} from 'react'

const MyForm = (user) => {

//3 - gerenciamento de dados
const [nome, setNome] = useState(user ? user.nome : " ");
const [email, setEmail] = useState(user ? user.email : " ");

//8 - campo text area

const [bio, setBio] = useState(user ? user.bio : "");


//9 - select

const [role, setRole] = useState(user ? user.role : "");

const handleNome = (e) => {

    setNome(e.target.value);
   

};


{/*Aula 5 - envio do formulário. Const handleSubmit e função preventDefault para não atualizar 
a pagina */}

const handleSubmit = (e) => {

  e.preventDefault();

  console.log(nome, email,bio, role);
   {/*Aula 7 - limpando formulários - basta adicionar um set vazio  */}

   setEmail("");
   setNome("");
   setBio("");
  setRole("");

}


{/* Aula 6 - formulário recebe dados já cadastrados, função de editar... no caso os valores são 
recebidos com props */}


  return (
    <div>

        <form className={style}>
        
        <div>
        {/* 1- formulário simples. hmtlFor e nome do imput tem que ser igual */}
        <label htmlFor="nome">Nome: </label>
        <input type="text" name="nome" 
        placeholder="Digite o seu nome aqui" onChange={handleNome} value={nome}/>
        </div>

        {/* 2- utilizando o formulário sem utilizar a label htmlfor.. resulta no mesmo abordagem 
        recomendada "Aula 4 - on change recebe uma arrow function para setar valor"*/}

        <label>
            <span>E-mail: </span>
            <input  type="email" name="email"  
            placeholder="Digite aqui o seu e-mail" onChange={(e)=>{setEmail(e.target.value)}} value={email}/>
            
        </label>

        {/*Aula 8 campo text area */}

        <label>
          <span>Bio: </span>
         <textarea name="bio" placeholder='Digite aqui sua bio' 
          onChange={(e)=>{setBio(e.target.value)}} value={bio}>

         </textarea>
        </label>


        {/*aula 9 */}

        <label> 

          <select name="role" value={role} onChange={(e)=>setRole(e.target.value)}>
            <option value="admin" >Administrador</option>
            <option value="user" >Usuário</option>
            <option value="Artist" >Artista</option>
          </select>

        </label>

        {/* aula 5 */}
        <input type="submit" value="Enviar" onClick={handleSubmit}/>
        




        </form>

       

    </div>
  )
}

export default MyForm