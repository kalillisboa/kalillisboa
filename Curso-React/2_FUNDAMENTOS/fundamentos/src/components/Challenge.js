const Challenge = () => {

    let a = 5;
    let b = 5;

   


    return (

        <div>
            <p>O valor de A é igual: {a}</p>
            <p>O valor de B é igual: {b}</p>

            <button onClick={()=>{console.log(a+b)}}> Clique Aqui para Somar</button>
           

        </div>

    );




};

export default Challenge;