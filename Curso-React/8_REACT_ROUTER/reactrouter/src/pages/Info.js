import React from 'react'

import { useParams } from 'react-router-dom'

const Info = () => {

    const {id} = useParams();

  return (
    <div>

        <h1>A info é</h1>
        <p>o id do produto é: {id}</p>

    </div>

  )
}

export default Info