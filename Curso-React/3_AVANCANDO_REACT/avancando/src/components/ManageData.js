import {useState} from 'react'

const ManageData = () => {
  
    let[number, setNumber] =  useState(1);


    
  
    

    return( 

        <div>
            <p>O valor de cliques é: {number}</p>
            <button onClick={()=>setNumber(number+1)} >Clique Aqui</button>
        </div>


    );

}

export default ManageData