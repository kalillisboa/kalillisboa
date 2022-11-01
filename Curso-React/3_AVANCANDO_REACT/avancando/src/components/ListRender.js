import {useState} from 'react'

const ListRender = () => {
  
    const [list, setUsers] = useState([
        {id: 1, nome:"kalil"},
        {id: 2, nome:"fulano"},
        {id: 3, nome:"Cicrano"},
          
    ]  );


    const deletarRandom = () => {
        
        const randomNumber = Math.floor(Math.random()*4);

    
        setUsers((anteriorUser) => {
            
          
            console.log(anteriorUser);
            return anteriorUser.filter((user) => randomNumber !== user.id);
            

        });

        

    }


    


    return (
        
        <div>
            <ul>

                {list.map((item) => (<li key={item.id}>{item.nome} </li>))}

            </ul>

                <button onClick={deletarRandom} >Clique aqui para deletar um Radom</button>

        </div>

        )   
        
};

export default ListRender