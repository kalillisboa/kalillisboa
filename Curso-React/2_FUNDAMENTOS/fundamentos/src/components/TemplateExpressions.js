const TemplateExpressions= () => {

    const user = {

        name : 'kalil',
        idade : 31,
        profissao : 'programador',
    };


   
    return(
        <div>
        <h1>Olá {user.name} deu bom?</h1>
        <h1>sua idade é: {user.idade}</h1>
        <h1>sua profissão é: {user.profissao}</h1>

           
        </div>

    );


};

export default TemplateExpressions;