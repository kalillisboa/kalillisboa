
import {useState} from 'react'

const ConditionRender = () => {

    const [x] = useState(false);
    console.log(x);

    var [name, setName] = useState('teste');

       /* if ( x == true ){

            return (
                    <div>O valor de x é igual a True</div>
                
            );
        } else {

            return (
                    <div>O valor de x é igual a False</div>
                
            );
        }
        */


       /* return(

            <div>

                {x === true ? <p>O valor é verdadeiro</p> : <p>O valor é falso</p> }

            </div>

        );
    
       */

        return (

            <div>


            { name === "joao" ? <p> O valor do Nome é igual a Joao</p> : <p>o valor do nome é diferente de joão</p>  }

            <button onClick={() => setName("joao")} >clique aqui pra igualar o nome</button>
            </div>
        );


    };





export default ConditionRender