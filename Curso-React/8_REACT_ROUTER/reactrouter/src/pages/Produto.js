
import { Link, useParams } from "react-router-dom"
import { useFetch } from "../hooks/useFetch";



const Produto = () => {

    const { id } = useParams();

    const { data: produto, loading, error } = useFetch(`http://localhost:3000/products/${id}`)

    return (


        <div>

            {produto && (<div>
                <p>O ID do Produto é: {id} </p>
                <p>O nome do produto é: {produto.name}</p>
                <p>O Preço do Produtoe é R$: {produto.price}</p>
                <Link to={`/product/${id}/info`}>info do Produto</Link>

            </div>
            )}

        </div>




    )
}

export default Produto