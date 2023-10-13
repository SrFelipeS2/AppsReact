import { IonButton, IonButtons, IonCard, IonCol, IonContent, IonGrid, IonHeader, IonIcon, IonItem, IonMenuButton, IonPage, IonRow, IonTitle, IonToolbar } from '@ionic/react';
import { useHistory, useParams } from 'react-router';
import { add, close, pencil } from 'ionicons/icons';
import { useEffect, useState } from 'react';
import { RemoveSuppliers, SaveEditSuppliers, searchSuppliers } from './SupplierApi';
import Supplier from './Supplier';

const SupplierList: React.FC = () => {

    const { name } = useParams<{ name: string; }>();
    const [supplier, setSupplier] = useState<Supplier[]>([]);
    const history = useHistory();

    useEffect(() => {
        search();
    }, [history.location.pathname])

    const search = async () => {
        let result = await searchSuppliers();
        setSupplier(result);
    }

    const remove = async (id:string) =>{
        await RemoveSuppliers(id);
        search();
    }

    const addSupplier = () => {
        history.push('/page/suppliers/new')
    }
    
    const editSupplier = (id:string) => {
        history.push('/page/suppliers/'+ id)
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
                    <IonTitle>Gestión de Proveedores</IonTitle>
                    <IonItem>
                        <IonButton onClick={addSupplier} color='primary' fill='solid' slot='end' size='default'>
                            <IonIcon icon={add} />
                            Agregar Empleado
                        </IonButton>
                    </IonItem>
                    <IonGrid className='table'>
                        <IonRow class='col'>
                            <IonCol>Nombre</IonCol>
                            <IonCol>Email</IonCol>
                            <IonCol>Telefono Empresarial</IonCol>
                            <IonCol>Direccion</IonCol>
                            <IonCol>Web</IonCol>
                            <IonCol>Telefono de Contacto</IonCol>
                            <IonCol>Acciones</IonCol>
                        </IonRow>
                        {supplier.map((supplier: Supplier) =>
                            < IonRow class='col' >
                                <IonCol>{supplier.name} </IonCol>
                                <IonCol>{supplier.email}</IonCol>
                                <IonCol>{supplier.phone}</IonCol>
                                <IonCol>{supplier.address}</IonCol>
                                <IonCol>{supplier.web}</IonCol>
                                <IonCol>{supplier.contact}</IonCol>
                                <IonCol>
                                    <IonButton onClick={()=>editSupplier(String(supplier.id))} fill='clear' color='primary'>
                                        <IonIcon  icon={pencil} slot='icon-only' />
                                    </IonButton>
                                    <IonButton fill='clear' color='danger' onClick={()=>remove(String(supplier.id))}>
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

export default SupplierList;
