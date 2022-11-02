import UserDetails from "./components/UserDetails";



function App() {

  const pessoas = [

    {id:1 , nome:"João", idade:32, profissao:"Analista de Sistemas"},
    {id:2 , nome:"Maria", idade:15, profissao:"Estudante"},
    {id:3 , nome:"Felipe", idade:17, profissao:"Menor Aprendiz"},
    {id:4 , nome:"Guilherme", idade:21, profissao:"Bombeiro"},
    {id:5 , nome:"Doencil", idade:18, profissao:"Porteiro"},
    {id:6 , nome:"Thayson", idade:49, profissao:"DBA"},
    


  ]



  return (
    <div>

      {
      
      pessoas.map((pessoa)=> (

        <UserDetails key={pessoa.id} nome={pessoa.nome} idade={pessoa.idade} 
        profissao={pessoa.profissao} />
        
        )
      
      
      ) 
      
      }
      
      
    </div>
  );
}

export default App;
