import { IonButton, IonButtons, IonCard, IonCol, IonContent, IonGrid, IonHeader, IonIcon, IonItem, IonMenuButton, IonPage, IonRow, IonTitle, IonToolbar } from '@ionic/react';
import { useHistory, useParams } from 'react-router';
import { add, close, pencil } from 'ionicons/icons';
import { useEffect, useState } from 'react';
import { RemoveCustomers, SaveEditCustomers, searchCustomers } from './CustomerApi';
import Customer from './Customer';

const CustomerList: React.FC = () => {

    const { name } = useParams<{ name: string; }>();
    const [clientes, setClientes] = useState<Customer[]>([]);
    const history = useHistory();

    useEffect(() => {
        search();
    }, [history.location.pathname])

    const search = async () => {
        let result =  await searchCustomers();
        setClientes(result);
    }

    const remove = async (id:string) =>{
        await RemoveCustomers(id);
        search();
    }
    const addCustomer = () => {
        history.push('/page/customers/new')
    }
    const editCustomer = (id:string) => {
        console.log(id)
        history.push('/page/customers/'+ id)
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
                    <IonTitle>Gestión de Clientes</IonTitle>
                    <IonItem>
                        <IonButton onClick={addCustomer} color='primary' fill='solid' slot='end' size='default'>
                            <IonIcon icon={add} />
                            Agregar Cliente
                        </IonButton>
                    </IonItem>
                    <IonGrid className='table'>
                        <IonRow class='col'>
                            <IonCol>Nombre</IonCol>
                            <IonCol>Email</IonCol>
                            <IonCol>Telefono</IonCol>
                            <IonCol>Direccion</IonCol>
                            <IonCol>Acciones</IonCol>
                        </IonRow>
                        {clientes.map((clientes: Customer) =>
                            < IonRow class='col' >
                                <IonCol>{clientes.firstname} {clientes.lastname}</IonCol>
                                <IonCol>{clientes.email}</IonCol>
                                <IonCol>{clientes.phone}</IonCol>
                                <IonCol>{clientes.address}</IonCol>
                                <IonCol>
                                    <IonButton onClick={()=>editCustomer(String(clientes.id))} fill='clear' color='primary'>
                                        <IonIcon  icon={pencil} slot='icon-only' />
                                    </IonButton>
                                    <IonButton fill='clear' color='danger' onClick={()=>remove(String(clientes.id))}>
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

export default CustomerList;
