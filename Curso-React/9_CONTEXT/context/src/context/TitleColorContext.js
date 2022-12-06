import { createContext, useReducer } from "react";

export const TitleColorContext = createContext();


export const titleColorReducer = (state, action) =>{ 

};

export const TitleColorContextProvider = ({children})=>{

    const[state, dispatch] = useReducer(titleColorReducer, {color: "red"});

    console.log("a cor do Title context é: ",state);

    return (

        <TitleColorContext.Provider value={{...state}}>
            {children}
        </TitleColorContext.Provider>
    );


};