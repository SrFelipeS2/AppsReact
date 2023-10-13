import { IonButton, IonButtons, IonCard, IonCol, IonContent, IonGrid, IonHeader, IonIcon, IonItem, IonMenuButton, IonPage, IonRow, IonTitle, IonToolbar } from '@ionic/react';
import { useHistory, useParams } from 'react-router';
import { add, close, pencil } from 'ionicons/icons';
import { useEffect, useState } from 'react';
import { RemoveEmployees, SaveEditEmployees, searchEmployees } from './EmployeeApi';
import Employee from './Employee';

const EmployeeList: React.FC = () => {

    const { name } = useParams<{ name: string; }>();
    const [employee, setEmployees] = useState<Employee[]>([]);
    const history = useHistory();

    useEffect(() => {
        search();
    }, [history.location.pathname])

    const search = async () => {
        let result = await searchEmployees();
        setEmployees(result);
    }

    const remove =  async (id:string) =>{
        await RemoveEmployees(id);
        search();
    }

    const addEmployee = () => {
        history.push('/page/employees/new')
    }
    
    const editEmployee = (id:string) => {
        console.log(id)
        history.push('/page/employees/'+ id)
    }

    return (
        <IonPage>
            <IonHeader>
                <IonToolbar>
                    <IonButtons slot='start'>
                        <IonMenuButton />
                    </IonButtons>
                    <IonTitle>{name}</IonTitle>
                </IonToolbar>
            </IonHeader>
            <IonContent fullscreen>
                <IonHeader collapse='condense'>
                    <IonToolbar>
                        <IonTitle size='large'>{name}</IonTitle>
                    </IonToolbar>
                </IonHeader>
                <IonCard>
                    <IonTitle>Gestión de Empleados</IonTitle>
                    <IonItem>
                        <IonButton onClick={addEmployee} color='primary' fill='solid' slot='end' size='default'>
                            <IonIcon icon={add} />
                            Agregar Empleado
                        </IonButton>
                    </IonItem>
                    <IonGrid className='table'>
                        <IonRow class='col'>
                            <IonCol>Nombre</IonCol>
                            <IonCol>Email</IonCol>
                            <IonCol>Telefono</IonCol>
                            <IonCol>Direccion</IonCol>
                            <IonCol>Salario</IonCol>
                            <IonCol>Acciones</IonCol>
                        </IonRow>
                        {employee.map((employee: Employee) =>
                            < IonRow class='col' >
                                <IonCol>{employee.firstname} {employee.lastname}</IonCol>
                                <IonCol>{employee.email}</IonCol>
                                <IonCol>{employee.phone}</IonCol>
                                <IonCol>{employee.address}</IonCol>
                                <IonCol>{employee.salary}</IonCol>
                                <IonCol>
                                    <IonButton onClick={()=>editEmployee(String(employee.id))} fill='clear' color='primary'>
                                        <IonIcon  icon={pencil} slot='icon-only' />
                                    </IonButton>
                                    <IonButton fill='clear' color='danger' onClick={()=>remove(String(employee.id))}>
                                        <IonIcon icon={close} slot='icon-only' />
                                    </IonButton>
                                </IonCol>
                            </IonRow>
                        )}
                    </IonGrid>
                </IonCard>            
            </IonContent>
        </IonPage >
    );
};

export default EmployeeList;
