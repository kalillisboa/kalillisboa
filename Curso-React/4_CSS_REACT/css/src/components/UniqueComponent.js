import style from './UniqueComponent.module.css'


const UniqueComponent = () => {
  return (
    <div>
        
        <p className={style.paragh}>Esse CSS é utilizado apenas pelo componente e não pode ser replicado</p>

    </div>
  )
}

export default UniqueComponent