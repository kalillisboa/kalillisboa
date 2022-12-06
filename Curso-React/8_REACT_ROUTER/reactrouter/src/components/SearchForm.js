
import { useState } from "react"
import { useNavigate } from "react-router-dom";

const SearchForm = () => {

    const [query, setQuery] = useState("");
    const navigate = useNavigate();


    const handleSubmit = (e) =>{

        e.preventDefault();
        navigate("/search?q=" + query);

    }

  return (
    <div>

    <form onSubmit={handleSubmit} >
    <input type="text" onChange={(e)=> setQuery(e.target.value)} />
    <input type="submit" value="pesquisar" />
    </form>

 
    </div>
  )
}

export default SearchForm;