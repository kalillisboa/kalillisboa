import style from './DetalheCarros.module.css'

const DetalheCarros = ({nome, marca, cor}) => {
    return (
        <div className={style.lista_carros}>
            <p >Carro: {nome}</p>
            <p >Marca: {marca}</p>
            <p >cor: {cor}</p>
        </div>
    )
}

export default DetalheCarros