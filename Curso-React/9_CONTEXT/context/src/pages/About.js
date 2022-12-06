import React from 'react'
import { useCounterContext } from '../hooks/useCounterContext'


const About = () => {

  const {counter} = useCounterContext();

  return (
    <div>
        
        <h1>Você está no ABOUT</h1>

        <p>O valor atual do contador é: {counter}</p>

    </div>
  )
}

export default About