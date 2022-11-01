import React from 'react'

const CarDetails = ({ km, brand, cor}) => {
  return (
    <div>
        <h2>Detalhes do Carro</h2>
        <p>A marca do carro é: {brand}</p>
        <p>A km do carro é: {km}</p>
        <p>a cor do carro é: {cor}</p>
    </div>
  )
}

export default CarDetails