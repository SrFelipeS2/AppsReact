import Employee from "./Employee";

export async function searchEmployees(){    
    let url = import.meta.env.VITE_APP_API;
    url += 'employees';
    console.log(url)
    let urlConfig: RequestInit = {
        method : "GET",
        headers :{
            'Content-Type':'application/json'
        },   
    };
    const response = await fetch("http://localhost:8080/api/employees",urlConfig)       
    if(!response.ok){
        throw new Error("Error en la pericion fetch")        
    }
    return await response.json()
}


export async function RemoveEmployees(id:string){
    let url = import.meta.env.VITE_APP_API+'employees/'+id;
    await fetch(url, {
        method : "DELETE",
        headers :{
            'Content-Type':'application/json'
        },   
    });
    
}
export async function SaveEditEmployees(employee:Employee){
    let url = import.meta.env.VITE_APP_API +  'employees';
    await fetch(url, {
      "method": 'POST',
      "body": JSON.stringify(employee),
      "headers": {
        "Content-Type": 'application/json'
      }
    });
}

export async function searchEmployeeById(id:string){
    let url = import.meta.env.VITE_APP_API;
    url +=  'employees/' + id
    console.log(url)
    let response = await fetch(url, {
      "method": 'GET',
      "headers": {
        "Content-Type": 'application/json'
      }
    })
  
    return await response.json();
}