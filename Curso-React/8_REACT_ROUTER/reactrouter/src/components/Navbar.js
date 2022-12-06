import React from 'react'
import style from '../css/Navbar.css'

import { Link, NavLink } from 'react-router-dom'



const Navbar = () => {
  return (

    <nav className='Navbar'>
        
    {/*<Link to="/">Home</Link>
    <Link to="/about">About</Link>*/}

    <NavLink to="/">Home</NavLink>
    <NavLink to="about">About</NavLink>

    </nav>
    

  )
}

export default Navbar