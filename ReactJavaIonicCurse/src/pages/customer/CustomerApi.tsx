import Customer from "./Customer";

export async function searchCustomers(){    
    let url = import.meta.env.VITE_APP_API;
    url += 'customers';
    let urlConfig: RequestInit = {
        method : "GET",
        headers :{
            'Content-Type':'application/json'
        },   
    };
    const response = await fetch("http://localhost:8080/api/customers",urlConfig)       
    if(!response.ok){
        throw new Error("Error en la pericion fetch")        
    }
    return await response.json()
}


export async function RemoveCustomers(id:string){
    let url = import.meta.env.VITE_APP_API+'customers/'+id;
    await fetch(url, {
        method : "DELETE",
        headers :{
            'Content-Type':'application/json'
        },   
    });
    
}
export async function SaveEditCustomers(customer:Customer){
    let url = import.meta.env.VITE_APP_API +  'customers'; 
    console.log(url)
    await fetch(url, {
      "method": 'POST',
      "body": JSON.stringify(customer),
      "headers": {
        "Content-Type": 'application/json'
      }
    });
}

export async function searchCustomerById(id:string){
    let url = import.meta.env.VITE_APP_API;
    url +=  'customers/' + id
    console.log(url)
    let response = await fetch(url, {
      "method": 'GET',
      "headers": {
        "Content-Type": 'application/json'
      }
    })
  
    return await response.json();
}