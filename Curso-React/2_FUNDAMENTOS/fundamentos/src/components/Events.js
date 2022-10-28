const Events = () => {

    const qtdCliques= (e) =>{
        
        console.log(e);
        console.log("ativou Evento");
    }

     


        return (
            
            <div>
                <div>
                    
                    <button onClick={qtdCliques} >Clique Aqui</button>
                   
                       
                    
                </div>
            </div>


        );



};

export default Events; 