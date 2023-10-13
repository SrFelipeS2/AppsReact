import Supplier from "./Supplier";

export async function searchSuppliers(){    
    let url = import.meta.env.VITE_APP_API;
    url += 'suppliers';
    let urlConfig: RequestInit = {
        method : "GET",
        headers :{
            'Content-Type':'application/json'
        },   
    };
    const response = await fetch("http://localhost:8080/api/suppliers",urlConfig)       
    if(!response.ok){
        console.log(response)
        throw new Error("Error en la pericion fetch")        
    }
    return await response.json()
}


export async function RemoveSuppliers(id:string){
    let url = import.meta.env.VITE_APP_API+'suppliers/'+id;
    console.log(url);
    await fetch(url, {
        method : "DELETE",
        headers :{
            'Content-Type':'application/json'
        },   
    });
    
}
export async function SaveEditSuppliers(supplier:Supplier){
    let url = import.meta.env.VITE_APP_API + 'suppliers';
    console.log(url)
    await fetch(url, {
      "method": 'POST',
      "body": JSON.stringify(supplier),
      "headers": {
        "Content-Type": 'application/json'
      }
    });
}

export async function searchSupplierById(id:string){
    let url = import.meta.env.VITE_APP_API;
    url +=  'suppliers/' + id
    console.log(url);
    let response = await fetch(url, {
      "method": 'GET',
      "headers": {
        "Content-Type": 'application/json'
      }
    })
  
    return await response.json();
}