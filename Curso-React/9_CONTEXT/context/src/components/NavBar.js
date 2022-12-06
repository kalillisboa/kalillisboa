import '../components/NavBar.css'
import { Link, NavLink } from 'react-router-dom'

const NavBar = () => {
    return (
        
        <div>

        <h1>MENU</h1>
        <nav>


            <NavLink to="/">Home</NavLink>

            <NavLink to="about">About</NavLink>

            <NavLink to="detalhes">Detalhes</NavLink>


        </nav>

        </div>
    )
}

export default NavBar